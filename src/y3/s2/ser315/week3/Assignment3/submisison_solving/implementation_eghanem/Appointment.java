package y3.s2.ser315.week3.implementation_eghanem; /**
 * Appointment represents the base appointment in our system.
 */

import java.time.LocalDateTime;
import java.util.Random;

public abstract class Appointment {
    public int appointmentId;
    public LocalDateTime startTime;
    public Student student;
    public Tutor tutor;
}