package y3.s2.ser315.week2.Assignment.tutoring_system;

import java.time.LocalDateTime;

public class Appointment {
    public String id;
    public LocalDateTime time;
    public boolean isOnline;
    public Tutor tutor;
    public Student student;
    public Subject subject;
}