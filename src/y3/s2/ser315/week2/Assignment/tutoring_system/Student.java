package y3.s2.ser315.week2.Assignment.tutoring_system;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public String email;
    public String password;
    public int credits;
    public List<Appointment> bookedAppointments = new ArrayList<>();

    public String cancelAppointment(Appointment appointment) {
        // Check if appointment is booked by this student
        if (!bookedAppointments.contains(appointment)) {
            return "Error: Appointment not found";
        }

        // Check cancellation time
        LocalDateTime now = LocalDateTime.now();
        if (now.plusHours(24).isBefore(appointment.time)) {
            // Cancelled more than 24 hours in advance
            bookedAppointments.remove(appointment);
            credits++; // Return credit
            return "Appointment canceled. Credit returned.";
        } else {
            // Cancelled less than 24 hours in advance
            bookedAppointments.remove(appointment);
            return "Appointment canceled. No credit returned.";
        }
    }
}