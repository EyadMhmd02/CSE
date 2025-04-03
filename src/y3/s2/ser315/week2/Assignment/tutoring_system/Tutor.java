package y3.s2.ser315.week2.Assignment.tutoring_system;

import java.util.ArrayList;
import java.util.List;

public class Tutor {
    public String name;
    public String email;
    public List<Subject> subjects = new ArrayList<>();
    public List<Appointment> appointments = new ArrayList<>();
}