package y3.s2.ser315.week1._07_Assignment.FieldTrip;

public class Person {
    String name;
    String email;

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("{\"name\": \"");
        str.append(this.name);
        str.append("\", \"email\": \"");
        str.append(this.email);
        str.append("\"}");
        return str.toString();
    }
}
