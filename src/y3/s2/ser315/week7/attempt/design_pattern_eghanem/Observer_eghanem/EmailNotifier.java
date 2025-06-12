package y3.s2.ser315.week7.attempt.design_pattern_eghanem.Observer_eghanem;

// Concrete observer: EmailNotifier
public class EmailNotifier implements Observer {
    @Override
    public void update(Appointment appointment, String action) {
        if (action.equals("CREATED")) {
            sendEmail(appointment.getStudentName(),
                    "Your appointment has been created: " + appointment);
            sendEmail(appointment.getTutorName(),
                    "You have a new appointment: " + appointment);
        } else if (action.equals("CANCELLED")) {
            sendEmail(appointment.getStudentName(),
                    "Your appointment has been cancelled: " + appointment);
            sendEmail(appointment.getTutorName(),
                    "An appointment has been cancelled: " + appointment);
        }
    }

    private void sendEmail(String recipient, String message) {
        // In a real implementation, this would send an actual email
        System.out.println("[EMAIL] To: " + recipient + " | Message: " + message);
    }
}
