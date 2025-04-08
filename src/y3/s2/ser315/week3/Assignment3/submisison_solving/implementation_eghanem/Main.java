package y3.s2.ser315.week3.implementation_eghanem;

import java.time.LocalDateTime;

public class Main {
    static LocalDateTime now = LocalDateTime.now();
    static UserControl userControl = new UserControl();
    static AppointmentControl appointmentControl = new AppointmentControl();
    static SubjectControl subjectControl = new SubjectControl();

    public static void main(String[] args) {
        /**
         * Creating Manager
         */
        Manager mehlhase = new Manager("Dr. Mehlhase", "mehlhase@tutoringCenter", "SunDevils<3");

        /**
         * Creating Subjects
         */
        Subject ser315 = new Subject("ser315");
        Subject ser316 = new Subject("ser316");
        Subject ser222 = new Subject("ser222");
        subjectControl.subjects.add(ser315);
        subjectControl.subjects.add(ser316);
        subjectControl.subjects.add(ser222);

        /**
         * Creating Tutors
         */
        Tutor david = new Tutor("Seth123", "david@tutoringCenter", "Singleton<3");
        david.subjects.add(ser315);
        david.subjects.add(ser316);
        Tutor kelly = new Tutor("Kelly456", "kelly@tutoringCenter", "MichaelScott<3");
        kelly.subjects.add(ser315);
        kelly.subjects.add(ser222);
        userControl.tutors.add(kelly);
        userControl.tutors.add(david);

        /**
         * Creating Appointments
         */
        // Create appointments relative to now so they always get the same result
        Appointment appointment1 = new OnlineAppointment(now.plusHours(2));
        appointment1.tutor = david;
        Appointment appointment2 = new CampusAppointment(now.plusDays(12));
        appointment2.tutor = kelly;

        // Add appointments to list of all appointments in system
        appointmentControl.appointments.add(appointment1);
        appointmentControl.appointments.add(appointment2);

        /**
         * Creating Students
         */
        Student jacob = new Student("jake789", "jake@jake.com", "Parks&RecIsBetter");
        // Add student to appointment1 and appointment1 to student
        appointment1.student = jacob;
        jacob.appointments.add(appointment1);

        Student joseph = new Student("joey098", "joe@joe.com", "Yee-Haw");
        // Add student to appointment2 and appointment2 to student
        appointment2.student = joseph;
        joseph.appointments.add(appointment2);

        // Add students to list of all students in system
        userControl.students.add(joseph);
        userControl.students.add(jacob);

        /**
         * Testing cancelAppointment method
         */
        // Student not signed up for appointment
        System.out.println("Jacob Cancelling an appointment he isnt signed up for: ");
        System.out.println(appointmentControl.cancelAppointment(appointment2.appointmentId, jacob.email, false));

        // Successful, no refund
        System.out.println("Jacob Cancelling and appointment with < 24 until start of appointment: ");
        System.out.println(appointmentControl.cancelAppointment(appointment1.appointmentId, jacob.email, false));

        // Successful, but sick
        System.out.println("Jacob cancelling an appointment, with < 24 hrs, but he's sick :(");
        System.out.println(appointmentControl.cancelAppointment(appointment1.appointmentId, jacob.email, true));

        // Successful, with refund
        System.out.println("Joseph cancelling an appointment in time: ");
        System.out.println(appointmentControl.cancelAppointment(appointment2.appointmentId, joseph.email, false));
    }
}