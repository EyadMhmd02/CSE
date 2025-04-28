/**
 * CampusAppointment class represents a tutoring appointment that will be held in person at the school. 
 */

import java.time.LocalDateTime;
import java.util.Random;

public class CampusAppointment extends Appointment{
    public CampusAppointment(LocalDateTime startTime){
        this.startTime = startTime;
        Random rand = new Random();
        this.appointmentId = rand.nextInt(); //maybe not perfect but you can come up with alternatives
        this.student = null;
        this.tutor = null;
    } 
}