package y3.s2.ser315.week7.attempt.design_pattern_eghanem.Observer_eghanem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// Concrete subject: AppointmentManager
public class AppointmentManager implements AppointmentSubject {
    private List<Appointment> appointments = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    // Observer pattern methods
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Appointment appointment, String action) {
        for (Observer observer : observers) {
            observer.update(appointment, action);
        }
    }

    // Business methods
    public Appointment createAppointment(LocalDateTime startTime, String studentName,
                                         String tutorName, String subject, boolean isOnline) {
        // Generate a simple ID (in a real system, this would be more sophisticated)
        int id = appointments.size() + 1;

        Appointment appointment = new Appointment(id, startTime, studentName, tutorName, subject, isOnline);
        appointments.add(appointment);

        // Notify observers about the new appointment
        notifyObservers(appointment, "CREATED");

        return appointment;
    }

    public boolean cancelAppointment(int appointmentId) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getId() == appointmentId) {
                Appointment appointment = appointments.get(i);
                appointments.remove(i);

                // Notify observers about the cancellation
                notifyObservers(appointment, "CANCELLED");

                return true;
            }
        }
        return false;
    }

    public List<Appointment> getAllAppointments() {
        return new ArrayList<>(appointments);
    }
}
