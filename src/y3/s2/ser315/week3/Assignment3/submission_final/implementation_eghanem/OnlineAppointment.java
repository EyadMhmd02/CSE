package y3.s2.ser315.week3.implementation_eghanem; /**
 * OnlineAppointment class represents a virtual tutoring appointment. 
 */
import java.time.LocalDateTime;
import java.util.Random;

public class OnlineAppointment extends Appointment{

    public OnlineAppointment(LocalDateTime startTime){
        this.startTime = startTime;
        Random rand = new Random();
        this.appointmentId = rand.nextInt(); //maybe not perfect but you can come up with alternatives
        this.student = null;
        this.tutor = null;
    }
}