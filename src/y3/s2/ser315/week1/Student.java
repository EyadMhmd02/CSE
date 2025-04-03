package y3.s2.ser315.week1;

public class Student extends Person {
    private String course;
    private int id;

    public Student(String name, int age, String course, int id) {
        super(name, age);
        this.course = course;
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public int getId() {
        return id;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setId(int id) {
        this.id = id;
    }
}
