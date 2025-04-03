package y3.s2.ser315.week1;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk() {
        System.out.println("walking...");
    }

    public void speak() {
        System.out.println("speaking...");
    }
}
