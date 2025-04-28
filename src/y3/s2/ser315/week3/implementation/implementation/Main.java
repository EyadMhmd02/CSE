import java.time.LocalDateTime;
import java.util.LinkedList;

public class Main{
    static LocalDateTime now = LocalDateTime.now();
    static LinkedList<Appointment> appointments = new LinkedList<>();
    static LinkedList<Student> students = new LinkedList<>();
    static LinkedList<Tutor> tutors = new LinkedList<>();

    public static void main(String[] args) {

        /**
         * Creating Students, Tutors, Appointments and Subjects
         */

        Manager mehlhase = new Manager("Dr. Mehlhase","mehlhase@tutoringCenter","SunDevils<3");

        //############ Subject Creation ############
        Subject ser315 = new Subject("ser315");
        Subject ser316 = new Subject("ser316");
        Subject ser222 = new Subject("ser222");

        //############ Tutor Creation ############
        Tutor david = new Tutor("Seth123", "david@tutoringCenter", "Singleton<3");
        david.subjects.add(ser315);
        david.subjects.add(ser316);
        Tutor kelly = new Tutor("Kelly456", "kelly@tutoringCenter", "MichaelScott<3");
        kelly.subjects.add(ser315);
        kelly.subjects.add(ser222);
        tutors.add(kelly);
        tutors.add(david);

        //############ Appointment Creation ############
        //Create appointments relative to now so they always get the same result
        Appointment appointment1 = new OnlineAppointment(now.plusHours(2)); 
        appointment1.tutor = david;
        Appointment appointment2 = new CampusAppointment(now.plusDays(12));
        appointment2.tutor = kelly;

        //Add appointments to list off all appointments in system
        appointments.add(appointment1);
        appointments.add(appointment2);

        //############ ############Student Creation ############
        Student jacob = new Student("jake789","jake@jake.com","Parks&RecIsBetter");
        //Add student ot appointment1 and appointment1 to student.
        appointment1.student = jacob;
        jacob.appointments.add(appointment1);

        Student joseph = new Student("joey098", "joe@joe.com", "Yee-Haw");
        //Add student ot appointment1 and appointment1 to student.
        appointment2.student = joseph;
        joseph.appointments.add(appointment2);

        //Add students to list off all students in system
        students.add(joseph);
        students.add(jacob);

        //############ Cancelling appointments ############
        //Student not signed up for appointment
        System.out.println("Jacob Cancelling an appointment he isnt signed up for: ");
        System.out.println(cancelAppointment(appointment2.appointmentId, jacob.email,false));
        
        //Successful, no refund
        System.out.println("Jacob Cancelling and appointment with < 24 until start of appointment: ");
        System.out.println(cancelAppointment(appointment1.appointmentId,jacob.email,false));
        
        //Successful, but sick
        System.out.println("Jacob cancelling an appointment, with < 24 hrs, but he's sick :(");
        System.out.println(cancelAppointment(appointment1.appointmentId, jacob.email,true));

        //Successful, with refund
        System.out.println("Joseph cancelling an appointment in time: ");
        System.out.println(cancelAppointment(appointment2.appointmentId, joseph.email,false));
    }


    public static String cancelAppointment(int appointmentId, String email, boolean isSick){
        Student tempStu = null;

        //find student in list of students from the system
        //we assume student exists
        for(Student stu : students) {
            if(email.equals(stu.email)){
                tempStu = stu;
                break;
            }
        }

        //find appointment in list of appointment from system
        //we assume appointment exists
        Appointment tempApp = null;
        for(Appointment app : appointments) {
            if (appointmentId == app.appointmentId) {
                tempApp = app;
                break;
            }
        }

        String event;

        if(!tempStu.appointments.contains(tempApp)){
            event = "Student is not registered for appointment with id: " + appointmentId + "\n"; // id of appointment added not 100% consistent to SD but helps clarify what happened
        }
        else {
            //if Appointment is < 24 hours before appointment Start Time.
            if(tempApp.startTime.minusHours(24).isBefore(now)) {
                if(isSick) {
                    event = "Student: Appointment cancelled provide proof for refund\n" +
                    "Tutor: Appointment with ID: " + appointmentId+ " has been cancelled by student\n"; // id of appointment added not 100% consistent to SD but helps clarify what happened
                } else {
                    event = "Student: Appointment Cancelled, no refund issued\n" +
                    "Tutor: Appointment with ID: " + appointmentId+ " has been cancelled by student\n"; // id of appointment added not 100% consistent to SD but helps clarify what happened
                }
            } else {
                event = "Student: Appointment Cancelled, refund issued\n" +
                "Tutor: Appointment with ID: " + appointmentId+ " has been cancelled by student\n";
            }
        }
        return event;
    }
}