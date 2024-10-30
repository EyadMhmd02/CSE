package y1.s2.Modules.ModuleFinalExam.oop;

public class _4_1_Objects {
    public static void main(String[] args) {
        _4_1_Objects.university = "EL-GALALALALALA";

    }

    // data members / attributes / fields
    private String name;
    private int age;

    public static String university;

    public _4_1_Objects() {
        this("Eyad");
    }

    public _4_1_Objects(String n) {

    }

    // methods
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
