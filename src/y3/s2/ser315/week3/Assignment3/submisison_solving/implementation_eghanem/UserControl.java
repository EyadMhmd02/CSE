package y3.s2.ser315.week3.implementation_eghanem;

import java.util.LinkedList;

public class UserControl {
    public LinkedList<Student> students;
    public LinkedList<Tutor> tutors;

    public UserControl() {
        this.students = new LinkedList<>();
        this.tutors = new LinkedList<>();
    }

    public boolean login(String email, String password) {
        // Check students
        for (Student student : students) {
            if (student.email.equals(email) && student.password.equals(password)) {
                return true;
            }
        }

        // Check tutors
        for (Tutor tutor : tutors) {
            if (tutor.email.equals(email) && tutor.password.equals(password)) {
                return true;
            }
        }

        return false;
    }
}