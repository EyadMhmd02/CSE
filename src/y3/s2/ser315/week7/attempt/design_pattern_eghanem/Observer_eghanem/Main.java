package y3.s2.ser315.week7.attempt.design_pattern_eghanem.Observer_eghanem;

import java.time.LocalDateTime;

// Main class to test the observer pattern
public class Main {
    public static void main(String[] args) {
        // Create our appointment manager (the subject)
        AppointmentManager appointmentManager = new AppointmentManager();

        // Create and register observers
        EmailNotifier emailNotifier = new EmailNotifier();
        SMSNotifier smsNotifier = new SMSNotifier();
        CalendarNotifier calendarNotifier = new CalendarNotifier();

        appointmentManager.registerObserver(emailNotifier);
        appointmentManager.registerObserver(smsNotifier);
        appointmentManager.registerObserver(calendarNotifier);

        System.out.println("=== Creating a new appointment ===");
        // Create an appointment - this should trigger notifications
        Appointment appointment = appointmentManager.createAppointment(
                LocalDateTime.now().plusDays(3),
                "Alice Smith",
                "Bob Johnson",
                "Mathematics",
                true
        );

        System.out.println("\n=== Creating another appointment ===");
        // Create another appointment
        Appointment appointment2 = appointmentManager.createAppointment(
                LocalDateTime.now().plusDays(5),
                "Charlie Brown",
                "Diana Prince",
                "Physics",
                false
        );

        System.out.println("\n=== Cancelling an appointment ===");
        // Cancel an appointment - this should trigger different notifications
        appointmentManager.cancelAppointment(appointment.getId());

        // Remove one observer to demonstrate
        System.out.println("\n=== Removing SMS notifications and creating another appointment ===");
        appointmentManager.removeObserver(smsNotifier);

        // Create one more appointment - only email and calendar notifications should happen
        Appointment appointment3 = appointmentManager.createAppointment(
                LocalDateTime.now().plusDays(7),
                "Eve Wilson",
                "Frank Thomas",
                "Chemistry",
                true
        );
    }
}