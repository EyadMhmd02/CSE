package y3.s2.ser315.week7.attempt.design_pattern_eghanem.Builder_eghanem;

import java.time.LocalDateTime;

// Main class to test the builder pattern
public class Main {
    public static void main(String[] args) {
        Student alice = new Student("Alice");
        Tutor bob = new Tutor("Bob");
        Subject math = new Subject("Mathematics");

        LocalDateTime nextMonday = LocalDateTime.now().plusDays(7).withHour(14).withMinute(0);

        // Create an online appointment
        Appointment onlineAppointment = new OnlineAppointmentBuilder(nextMonday)
                .withStudent(alice)
                .withTutor(bob)
                .withSubject(math)
                .withZoomLink("https://zoom.us/j/123456789")
                .build();

        System.out.println("Online Appointment Details:");
        System.out.println(onlineAppointment);

        // Create a campus appointment
        Appointment campusAppointment = new CampusAppointmentBuilder(nextMonday.plusHours(2))
                .withStudent(alice)
                .withTutor(bob)
                .withSubject(math)
                .withRoom("B305")
                .build();

        System.out.println("Campus Appointment Details:");
        System.out.println(campusAppointment);

        // Try creating an invalid appointment (without tutor)
        try {
            Appointment invalidAppointment = new OnlineAppointmentBuilder(nextMonday)
                    .withStudent(alice)
                    .withSubject(math)
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Validation caught: " + e.getMessage());
        }
    }
}
