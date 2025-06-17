package y3.s2.ser315.week3.implementation_eghanem;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class AppointmentControl {
    public LinkedList<Appointment> appointments;

    public AppointmentControl() {
        this.appointments = new LinkedList<>();
    }

    public String cancelAppointment(int appointmentId, String email, boolean isSick) {
        Student tempStu = null;

        // Find student in UserControl
        for (Student stu : Main.userControl.students) {
            if (email.equals(stu.email)) {
                tempStu = stu;
                break;
            }
        }

        // Find appointment in appointments list
        Appointment tempApp = null;
        for (Appointment app : appointments) {
            if (appointmentId == app.appointmentId) {
                tempApp = app;
                break;
            }
        }

        String event;

        if (!tempStu.appointments.contains(tempApp)) {
            event = "Student is not registered for appointment with id: " + appointmentId + "\n";
        } else {
            // If Appointment is < 24 hours before appointment Start Time
            if (tempApp.startTime.minusHours(24).isBefore(Main.now)) {
                if (isSick) {
                    event = "Student: Appointment cancelled provide proof for refund\n" +
                            "Tutor: Appointment with ID: " + appointmentId + " has been cancelled by student\n";
                } else {
                    event = "Student: Appointment Cancelled, no refund issued\n" +
                            "Tutor: Appointment with ID: " + appointmentId + " has been cancelled by student\n";
                }
            } else {
                event = "Student: Appointment Cancelled, refund issued\n" +
                        "Tutor: Appointment with ID: " + appointmentId + " has been cancelled by student\n";
            }
        }
        return event;
    }

    public String createAppointment(String email, LocalDateTime time, boolean online) {
        // Implementation would go here
        return "Appointment created";
    }
}