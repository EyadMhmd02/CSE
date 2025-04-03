package y3.s2.ser315.week2.Assignment.tutoring_system;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Create subjects
        Subject ser315 = new Subject();
        ser315.name = "SER315";

        // Create tutor
        Tutor tutor = new Tutor();
        tutor.name = "Jane Smith";
        tutor.email = "jane@example.com";
        tutor.subjects.add(ser315);

        // Create student
        Student student = new Student();
        student.name = "John Doe";
        student.email = "john@example.com";
        student.credits = 5;

        // Create appointment
        Appointment appointment = new Appointment();
        appointment.id = "APP001";
        appointment.time = LocalDateTime.now().plusDays(2); // 2 days in the future
        appointment.isOnline = false;
        appointment.subject = ser315;
        appointment.tutor = tutor;
        appointment.student = student;

        // Add appointment to student's booked appointments
        student.bookedAppointments.add(appointment);

        // Demonstrate appointment cancellation scenarios
        System.out.println("Scenario 1: Cancellation more than 24 hours in advance");
        String result1 = student.cancelAppointment(appointment);
        System.out.println("Result: " + result1);
        System.out.println("Student credits: " + student.credits);

        // Create another appointment for less than 24 hours scenario
        Appointment appointment2 = new Appointment();
        appointment2.id = "APP002";
        appointment2.time = LocalDateTime.now().plusHours(12); // 12 hours in the future
        appointment2.isOnline = true;
        appointment2.subject = ser315;
        appointment2.tutor = tutor;
        appointment2.student = student;

        student.bookedAppointments.add(appointment2);

        System.out.println("\nScenario 2: Cancellation less than 24 hours in advance");
        String result2 = student.cancelAppointment(appointment2);
        System.out.println("Result: " + result2);
        System.out.println("Student credits: " + student.credits);
    }
}