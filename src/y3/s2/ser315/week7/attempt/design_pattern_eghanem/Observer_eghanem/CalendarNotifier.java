package y3.s2.ser315.week7.attempt.design_pattern_eghanem.Observer_eghanem;

// Concrete observer: CalendarNotifier
public class CalendarNotifier implements Observer {
    @Override
    public void update(Appointment appointment, String action) {
        if (action.equals("CREATED")) {
            addToCalendar(appointment.getStudentName(), appointment);
            addToCalendar(appointment.getTutorName(), appointment);
            System.out.println("[CALENDAR] Added appointment to calendars for " +
                    appointment.getStudentName() + " and " +
                    appointment.getTutorName());
        } else if (action.equals("CANCELLED")) {
            removeFromCalendar(appointment.getStudentName(), appointment);
            removeFromCalendar(appointment.getTutorName(), appointment);
            System.out.println("[CALENDAR] Removed appointment from calendars for " +
                    appointment.getStudentName() + " and " +
                    appointment.getTutorName());
        }
    }

    private void addToCalendar(String user, Appointment appointment) {
        // In a real implementation, this would add the event to a calendar system
    }

    private void removeFromCalendar(String user, Appointment appointment) {
        // In a real implementation, this would remove the event from a calendar system
    }
}
