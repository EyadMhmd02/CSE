/**
 * TutoringRoom class represents the physical tutoring room at the school. It effectively acts as a scheduler to ensure that no more than 5 in person appointments can happen at a time. 
 */
import java.util.HashMap;
import java.util.LinkedList;
import java.time.LocalDateTime;
public class TutoringRoom{
    static final int CAPACITY = 5;
    public LinkedList<CampusAppointment> appointments;


    public TutoringRoom(){
		this.appointments = new LinkedList<>();
    }


}