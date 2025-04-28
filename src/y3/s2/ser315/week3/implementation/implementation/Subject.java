/**
 * Subject class represents a subject for which a tutor can offer to teach. 
 */
import java.util.LinkedList;

public class Subject{
    public String name;
    public Manager manager;
    public LinkedList<Tutor> tutors;

    public Subject(String name){
        this.name = name;
        this.tutors = new LinkedList<>();
    }
}