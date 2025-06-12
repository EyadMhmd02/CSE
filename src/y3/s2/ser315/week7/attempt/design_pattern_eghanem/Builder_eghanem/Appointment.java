package y3.s2.ser315.week7.attempt.design_pattern_eghanem.Builder_eghanem;

import java.time.LocalDateTime;

// Appointment class
public class Appointment {
    private int appointmentId;
    private LocalDateTime startTime;
    private Student student;
    private Tutor tutor;
    private Subject subject;
    private boolean isOnline;
    private String zoomLink;    // For online appointments
    private String roomNumber;  // For campus appointments

    // Package-private constructor used by builders
    Appointment(LocalDateTime startTime, boolean isOnline) {
        this.startTime = startTime;
        this.isOnline = isOnline;
        this.appointmentId = generateId();
    }

    private int generateId() {
        return (int) (Math.random() * 10000);
    }

    // Getters
    public int getAppointmentId() {
        return appointmentId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public Student getStudent() {
        return student;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public Subject getSubject() {
        return subject;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public String getZoomLink() {
        return zoomLink;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    // Package-private setters used by builders
    void setStudent(Student student) {
        this.student = student;
    }

    void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    void setSubject(Subject subject) {
        this.subject = subject;
    }

    void setZoomLink(String zoomLink) {
        this.zoomLink = zoomLink;
    }

    void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Appointment ID: ").append(appointmentId).append("\n");
        sb.append("Time: ").append(startTime).append("\n");
        sb.append("Type: ").append(isOnline ? "Online" : "On Campus").append("\n");

        if (student != null) {
            sb.append("Student: ").append(student.getName()).append("\n");
        }

        if (tutor != null) {
            sb.append("Tutor: ").append(tutor.getName()).append("\n");
        }

        if (subject != null) {
            sb.append("Subject: ").append(subject.getName()).append("\n");
        }

        if (isOnline && zoomLink != null) {
            sb.append("Zoom Link: ").append(zoomLink).append("\n");
        }

        if (!isOnline && roomNumber != null) {
            sb.append("Room: ").append(roomNumber).append("\n");
        }

        return sb.toString();
    }
}
