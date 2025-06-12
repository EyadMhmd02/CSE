package y3.s2.ser315.week7.attempt.design_pattern_eghanem.Builder_eghanem;

import java.time.LocalDateTime;

// Campus appointment builder
public class CampusAppointmentBuilder implements AppointmentBuilder {
    private Appointment appointment;

    public CampusAppointmentBuilder(LocalDateTime startTime) {
        appointment = new Appointment(startTime, false);
    }

    @Override
    public CampusAppointmentBuilder withStudent(Student student) {
        appointment.setStudent(student);
        return this;
    }

    @Override
    public CampusAppointmentBuilder withTutor(Tutor tutor) {
        appointment.setTutor(tutor);
        return this;
    }

    @Override
    public CampusAppointmentBuilder withSubject(Subject subject) {
        appointment.setSubject(subject);
        return this;
    }

    public CampusAppointmentBuilder withRoom(String roomNumber) {
        appointment.setRoomNumber(roomNumber);
        return this;
    }

    @Override
    public Appointment build() {
        // Validate appointment
        if (appointment.getTutor() == null) {
            throw new IllegalStateException("Appointment must have a tutor");
        }

        if (appointment.getRoomNumber() == null) {
            throw new IllegalStateException("Campus appointment must have a room number");
        }

        return appointment;
    }
}
