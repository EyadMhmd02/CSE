package y3.s2.ser315.week7.attempt.design_pattern_eghanem.Builder_eghanem;

import java.time.LocalDateTime;

// Online appointment builder
public class OnlineAppointmentBuilder implements AppointmentBuilder {
    private Appointment appointment;

    public OnlineAppointmentBuilder(LocalDateTime startTime) {
        appointment = new Appointment(startTime, true);
    }

    @Override
    public OnlineAppointmentBuilder withStudent(Student student) {
        appointment.setStudent(student);
        return this;
    }

    @Override
    public OnlineAppointmentBuilder withTutor(Tutor tutor) {
        appointment.setTutor(tutor);
        return this;
    }

    @Override
    public OnlineAppointmentBuilder withSubject(Subject subject) {
        appointment.setSubject(subject);
        return this;
    }

    public OnlineAppointmentBuilder withZoomLink(String zoomLink) {
        appointment.setZoomLink(zoomLink);
        return this;
    }

    @Override
    public Appointment build() {
        // Validate appointment
        if (appointment.getTutor() == null) {
            throw new IllegalStateException("Appointment must have a tutor");
        }
        return appointment;
    }
}