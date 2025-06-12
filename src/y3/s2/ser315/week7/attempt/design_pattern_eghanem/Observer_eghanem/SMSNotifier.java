package y3.s2.ser315.week7.attempt.design_pattern_eghanem.Observer_eghanem;

// Concrete observer: SMSNotifier (continued)
public class SMSNotifier implements Observer {
    @Override
    public void update(Appointment appointment, String action) {
        if (action.equals("CREATED")) {
            // Only notify about new appointments via SMS
            sendSMS(appointment.getStudentName(),
                    "New appointment scheduled with " + appointment.getTutorName() +
                            " on " + appointment.getStartTime());

            sendSMS(appointment.getTutorName(),
                    "New appointment scheduled with " + appointment.getStudentName() +
                            " on " + appointment.getStartTime());
        } else if (action.equals("CANCELLED")) {
            // Send urgent notification for cancellations
            sendSMS(appointment.getStudentName(),
                    "ALERT: Your appointment on " + appointment.getStartTime() +
                            " has been cancelled.");

            sendSMS(appointment.getTutorName(),
                    "ALERT: Your appointment with " + appointment.getStudentName() +
                            " on " + appointment.getStartTime() + " has been cancelled.");
        }
    }

    private void sendSMS(String recipient, String message) {
        // In a real implementation, this would send an actual SMS
        System.out.println("[SMS] To: " + recipient + " | Message: " + message);
    }
}
