package y3.s1.cse240.assignments.cse240_hw1;

/**
 * @author Eyad Mohamed AbdelMohsen Ghanem
 * */
class Student {
    private final String lastName;
    private final String firstName;

    /**
     * Constructs a Student object by assigning the default string " bar " to lastName and “foo” to firstName.
     * */
    public Student() {
        lastName = "bar";
        firstName = "foo";
    }

    /**
     * Constructs a Student object using the string info. Use the split method of the String class to extract first name and last name, then assign them to each instance variable of the Student class. An example of the input string is:
     * “John/Doe”
     * */
    public Student(String info) {
        String[] parts = info.split("/");
        firstName = parts[0];
        lastName = parts[1];
    }

    /**
     * returns the instance variable lastName.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * returns the instance variable firstName.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * It should return a string containing the initial character of the first name, a period, the initial character of the last name, and a period. An example of such string for the student John Doe is:
     * “J.D.”
     * */
    @Override
    public String toString() {
        return firstName.charAt(0) + "." + lastName.charAt(0) + ".";
    }


}
