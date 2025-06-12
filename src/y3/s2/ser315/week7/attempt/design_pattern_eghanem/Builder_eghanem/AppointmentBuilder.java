package y3.s2.ser315.week7.attempt.design_pattern_eghanem.Builder_eghanem;

// Builder interface
public interface AppointmentBuilder {
    AppointmentBuilder withStudent(Student student);

    AppointmentBuilder withTutor(Tutor tutor);

    AppointmentBuilder withSubject(Subject subject);

    Appointment build();
}
