/**
 * Tutor class represents a tutor type user in the system. Tutors are responsible for signing up to teach subjects, as well as creating appointments for students to book. 
 */
import java.util.LinkedList;
public class Tutor extends User{
    public String zoomId;
    public LinkedList<Subject> subjects;
    public LinkedList<Appointment> appointments;

    public Tutor(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.zoomId = null;
        this.subjects = new LinkedList<>();
        this.appointments = new LinkedList<>();
    }

}