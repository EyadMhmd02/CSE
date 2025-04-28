/**
 * Manager class represents the manager of the tutoring center. The manager is responsible for adding subjects to the system, as well as tutors. 
 */
import java.util.LinkedList;
public class Manager extends User{
    public LinkedList<Subject> subjects;
    public LinkedList<Tutor> tutors;

    public Manager(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.subjects = new LinkedList<>();
        this.tutors = new LinkedList<>();
    }

}