package y3.s2.ser315.week7.attempt.design_pattern_eghanem.Observer_eghanem;

import java.time.LocalDateTime;

// Appointment class (for demonstration)
public class Appointment {
    private int id;
    private LocalDateTime startTime;
    private String studentName;
    private String tutorName;
    private String subject;
    private boolean isOnline;

    public Appointment(int id, LocalDateTime startTime, String studentName, String tutorName,
                       String subject, boolean isOnline) {
        this.id = id;
        this.startTime = startTime;
        this.studentName = studentName;
        this.tutorName = tutorName;
        this.subject = subject;
        this.isOnline = isOnline;
    }

    // Getters
    public int getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getTutorName() {
        return tutorName;
    }

    public String getSubject() {
        return subject;
    }

    public boolean isOnline() {
        return isOnline;
    }

    @Override
    public String toString() {
        return "Appointment #" + id + ": " + studentName + " with " + tutorName +
                " for " + subject + " at " + startTime + (isOnline ? " (Online)" : " (Campus)");
    }
}
