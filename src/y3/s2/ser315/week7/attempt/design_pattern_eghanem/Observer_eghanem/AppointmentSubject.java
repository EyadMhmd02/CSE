package y3.s2.ser315.week7.attempt.design_pattern_eghanem.Observer_eghanem;

// Subject interface
public interface AppointmentSubject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(Appointment appointment, String action);
}
