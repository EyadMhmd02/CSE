package y1.s2.Modules.Module2.cse205_p02.src;

// **************************************************************************************************
//// CLASS: y3.s2.ser315.week3.implementation_eghanem.Main
////
//// DESCRIPTION
//// The y3.s2.ser315.week3.implementation_eghanem.Main class for Project 2.
////
//// AUTHOR
//// Kevin R. Burger (burgerk@asu.edu)
//// Computer Science & Engineering
//// School of Computing, Informatics, and Decision Systems Engineering
//// Fulton Schools of Engineering
//// Arizona State University, Tempe, AZ 85287-8809
////**************************************************************************************************

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * Instantiate a y3.s2.ser315.week3.implementation_eghanem.Main object and call run() on the object.
     * Note that essentially now, run()
     * becomes the starting point of execution for the program.
     */
    public static void main(String[] args) {
        Main mainObject = new Main();
        mainObject.run();
    }

    /**
     * Calculates the tuition for each Student in pStudentList. Write an enhanced for loop that
     * iterates over each Student in pStudentList. For each Student, call calcTuition() on that
     * Student object. Note: this is a polymorphic method call. What does that mean?
     * <p>
     * PSEUDOCODE
     * Enhanced ForEach student in pStudentList Do
     * student.calcTuition()
     * End Enhanced ForEach
     */
    private void calcTuition(ArrayList<Student> pStudentList) {
        for (Student student : pStudentList) {
            student.calcTuition();
        }
    }

    /**
     * Reads the student information from "p02-students.txt" and returns the list of students as
     * an ArrayList<Student> object. Note that this method throws FileNotFoundException if the
     * input file could not be opened. The exception is caught and handled in run().
     * <p>
     * <p>
     * PSEUDOCODE
     * <p>
     * <p>
     * Declare and create an ArrayList<Student> object named studentList
     * <p>
     * Open "p02-students.txt" for reading using a Scanner object named in
     * <p>
     * While in.hasNext() returns true Do
     * <p>
     * String studentType <= read next string from in
     * <p>
     * If studentType is "C" Then
     * <p>
     * studentList.add(readOnCampusStudent(in))
     * <p>
     * Else
     * <p>
     * studentList.add(readOnlineStudent(in))
     * <p>
     * End If
     * <p>
     * End While
     * <p>
     * Close the scanner
     * <p>
     * Return studentList
     */
    private ArrayList<Student> readFile() throws FileNotFoundException {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner in = new Scanner(new File("p02-students.txt"));
        while (in.hasNext()) {
            String studentType = in.next();
            if (studentType.equals("C")) {
                studentList.add(readOnCampusStudent(in));
            } else {
                studentList.add(readOnlineStudent(in));
            }
        }
        in.close();
        return studentList;
    }

    /**
     * Reads the information for an on-campus student from the input file.
     * <p>
     * <p>
     * PSEUDOCODE
     * <p>
     * Declare String object id and assign pIn.next() to id
     * <p>
     * Declare String object named lname and assign pIn.next() to lname
     * <p>
     * Declare String object named fname and assign pIn.next() to fname
     * <p>
     * Declare and create an OnCampusStudent object. Pass id, fname, and lname as params to ctor.
     * <p>
     * Declare String object named res and assign pIn.next() to res
     * <p>
     * Declare double variable named fee and assign pIn.nextDouble() to fee
     * <p>
     * Declare int variable named credits and assign pIn.nextInt() to credits
     * <p>
     * If res.equals("R") Then
     * <p>
     * Call setResidency(OnCampusStudent.RESIDENT) on student
     * <p>
     * Else
     * <p>
     * Call setResidency(OnCampusStudent.NON_RESIDENT) on student
     * <p>
     * End If
     * <p>
     * Call setProgramFee(fee) on student
     * <p>
     * Call setCredits(credits) on student
     * <p>
     * Return student
     */
    private OnCampusStudent readOnCampusStudent(Scanner pIn) {
        String id = pIn.next();
        String lName = pIn.next();
        String fName = pIn.next();
        OnCampusStudent student = new OnCampusStudent(id, fName, lName);
        String res = pIn.next();
        double fee = pIn.nextDouble();
        int credits = pIn.nextInt();
        student.setResidency(res.equals("R"));
        student.setProgramFee(fee);
        student.setCredits(credits);
        return student;
    }

    /**
     * Reads the information for an online student from the input file.
     * <p>
     * <p>
     * PSEUDOCODE
     * <p>
     * Declare String object id and assign pIn.next() to id
     * <p>
     * Declare String object named lname and assign pIn.next() to lname
     * <p>
     * Declare String object named fname and assign pIn.next() to fname
     * <p>
     * Declare and create an OnlineStudent student. Pass id, fname, lname as params to the ctor.,
     * <p>
     * Declare String object named fee and assign pIn.next() to fee
     * <p>
     * Declare int variable named credits and assign pIn.nextInt() to credits
     * <p>
     * If fee.equals("T")) Then
     * <p>
     * Call setTechFee(true) on student
     * <p>
     * Else
     * <p>
     * Call setTechFee(false) on student
     * <p>
     * End If
     * <p>
     * Call setCredits(credits) on student
     * <p>
     * Return student
     */
    private OnlineStudent readOnlineStudent(Scanner pIn) {
        String id = pIn.next();
        String lName = pIn.next();
        String fName = pIn.next();
        OnlineStudent student = new OnlineStudent(id, fName, lName);
        String res = pIn.next();
        double fee = pIn.nextDouble();
        int credits = pIn.nextInt();
        student.setTechFee(res.equals("T"));
        student.setCredits(credits);
        return student;
    }

    /**
     * Calls other methods to implement the sw requirements.
     * <p>
     * <p>
     * PSEUDOCODE
     * <p>
     * Declare ArrayList<Student> object named studentList and initialize it to null
     *
     * <p>
     * <p>
     * -- In the try-catch block we try to read the list of students from p02-students.txt
     * <p>
     * -- storing the students in the studentList list. If we cannot open the input file for
     * <p>
     * -- reading, then we output an error message and terminate the program.
     * <p>
     * try
     * <p>
     * studentList = readFile()
     * <p>
     * catch (FileNotFoundException)
     * <p>
     * Print "Sorry, could not open 'p02-students.txt' for reading. Stopping."
     * <p>
     * Call System.exit(-1)
     * <p>
     * end try-catch
     *
     * <p>
     * <p>
     * -- Calculate the tuition for each Student in studentList
     * <p>
     * calcTuition(studentList)
     *
     * <p>
     * <p>
     * -- Sort the students in studentList into ascending order based on student identifier
     * <p>
     * -- Note that Sorter.insertionSort() is a static/class method so we do not have to instantiate
     * <p>
     * -- an object of the Sorter class, we just write class-name.static-method-name() to call a
     * <p>
     * -- static method in a class.
     * <p>
     * Call Sorter.insertionSort(studentList, Sorter.SORT_ASCENDING) to sort the list
     *
     * <p>
     * <p>
     * -- In the try-catch block we try to write the list of students and their calculated tuitions
     * <p>
     * -- to p02-tuition.txt If we cannot open the output file for writing, then we output an error
     * <p>
     * -- message and terminate the program.
     * <p>
     * try
     * <p>
     * writeFile(studentList)
     * <p>
     * catch (FileNotFoundException)
     * <p>
     * Print "Sorry, could not open 'p02-tuition.txt' for writing. Stopping."
     * <p>
     * Call System.exit(-1)
     * <p>
     * end try-catch
     */
    private void run() {
        ArrayList<Student> studentList;
        try {
            studentList = readFile();
            calcTuition(studentList);
            Sorter.insertionSort(studentList, Sorter.SORT_ASCENDING);
            writeFile(studentList);
        } catch (FileNotFoundException pExcept) {
            System.out.println("Sorry, could not open 'p02-student.txt' for reading. Stopping.");
            System.exit(-1);
        }
    }

    /**
     * Writes the output to "p02-tuition.txt" per the software requirements. Note that this method
     * throws FileNotFoundException if the output file could not be opened. The exception is caught
     * and handled in run().
     * <p>
     * <p>
     * PSEUDOCODE
     * <p>
     * Declare and create a PrintWriter object named out, opening "p02-tuition.txt" for writing
     * <p>
     * Enhanced ForEach student in pStudentList Do
     * <p>
     * Using out.printf() output the student information per SW Requiremment 3
     * <p>
     * End Enhanced ForEach
     * <p>
     * Close the output file
     */
    private void writeFile(ArrayList<Student> pStudentList) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new File("p02-tuition.txt"));
        for (Student student : pStudentList) {
            out.print(student.getId() + " " + student.getLastName() + " " + student.getFirstName() + " ");
            out.printf("%.2f%n", student.getTuition());
        }
        out.close();
    }

}
