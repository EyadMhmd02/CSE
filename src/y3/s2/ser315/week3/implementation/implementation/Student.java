import java.util.LinkedList;
public class Student extends User{
    public int credits;
    public LinkedList<Appointment> appointments;
    PaymentCard paymentCard;

    public Student(String userName, String email, String password){

        this.userName = userName;
        this.email = email;
        this.password = password;

        this.paymentCard = new PaymentCard();
        this.appointments = new LinkedList<>();
        this.credits = 0;
    }


}