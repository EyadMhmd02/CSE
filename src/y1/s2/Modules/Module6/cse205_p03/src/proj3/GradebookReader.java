package y1.s2.Modules.Module6.cse205_p03.src.proj3;

//**************************************************************************************************
// CLASS: GradebookReader
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// (c) Kevin R. Burger 2014-2019
//**************************************************************************************************

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * GradebookReader() reads the gradebook info from the file whose name is passed to the ctor.
 * Once the input file has been read, it will return a Roster object containing the list of
 * Students in the course.
 */
public class GradebookReader {

    /**
     * mIn is used to read from the input file.
     */
    private Scanner mIn;

    /**
     * Attempts to open the gradebook file for reading. If successful, mIn will be used to read
     * from the file. If the file cannot be opened, a FileNotFoundException will be thrown.
     * <p>
     * Note that this  method does not actually read the information from the file. That is done
     * lated when readRoster() is called from y3.s2.ser315.week3.implementation_eghanem.Main.run().
     *
     * @param pFname The name of the file to be opened for reading. For this project it will be
     *               "gradebook.dat"
     * @throws FileNotFoundException
     */
    public GradebookReader(String pFname) throws FileNotFoundException {
        mIn = new Scanner(new File(pFname));
    }

    /**
     * Reads the exam scores for a Student.
     * <p>
     * The number of exams is retrieved by calling the static getNumExams() method in y3.s2.ser315.week3.implementation_eghanem.Main.
     *
     * @param pStudent The student for whom we are going to read the exam scores from the input
     *                 file.
     */
    private void readExam(Student pStudent) {
        for (int n = 0; n < Main.getNumExams(); ++n) {
            pStudent.addExam(mIn.nextInt());
        }
    }

    /**
     * Called to read the gradebook information. Calls readRoster() to read the student records and
     * then sorts the roster by last name.
     * <p>
     * Called from y3.s2.ser315.week3.implementation_eghanem.Main.run().
     *
     * @return The roster of students that was read from the input file.
     */
    public Roster readGradebook() {
        Roster roster = readRoster();
        roster.sortRoster();
        return roster;
    }

    /**
     * Reads the homework scores for a Student.
     * <p>
     * The number of homework assignments is retrieved by calling the static getNumHomeworks()
     * method in y3.s2.ser315.week3.implementation_eghanem.Main.
     *
     * @param pStudent The student for whom we are going to read the homework scores from the input
     *                 file.
     */
    private void readHomework(Student pStudent) {
        for (int n = 0; n < Main.getNumHomeworks(); ++n) {
            pStudent.addHomework(mIn.nextInt());
        }
    }

    /**
     * Reads the student information for each student in the input file, adding each student to
     * the roster.
     * <p>
     * Called from readGradebook().
     *
     * @return The roster of students that was read from the input file.
     */
    private Roster readRoster() {
        Roster roster = new Roster();
        while (mIn.hasNext()) {
            // See §2 Background for the format of each Student record in the input file.
            String lastName = mIn.next();
            String firstName = mIn.next();
            Student student = new Student(firstName, lastName);
            readExam(student);
            readHomework(student);
            roster.addStudent(student);
        }
        return roster;
    }
}