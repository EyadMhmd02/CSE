//**************************************************************************************************
// CLASS: y3.s2.ser315.week3.implementation_eghanem.Main
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// (c) Kevin R. Burger 2014-2019
//**************************************************************************************************
package y1.s2.Modules.Module6.cse205_p03.src.proj3;

import javax.swing.*;
import java.io.FileNotFoundException;

import static y1.s2.Modules.Module6.cse205_p03.src.proj3.CourseConstants.NUM_EXAMS;
import static y1.s2.Modules.Module6.cse205_p03.src.proj3.CourseConstants.NUM_HOMEWORKS;

/**
 * The y3.s2.ser315.week3.implementation_eghanem.Main class containing the main() and run() methods.
 */
public class Main {
    /**
     * The Roster of students that is read from the input file "gradebook.dat".
     */
    private Roster mRoster;

    /**
     * A reference to the View object.
     */
    private View mView;

    /**
     * This is where execution starts. Instantiate a y3.s2.ser315.week3.implementation_eghanem.Main object and then call run().
     */
    public static void main(String[] args) {
        new Main().run();
    }

    /**
     * exit() is called when the Exit button in the View is clicked. When we exit we have to write
     * the roster to the output file "gradebook.dat". Then we exit the program with a code of 0.
     * <p>
     * We open the file and write the roster to it in a try-catch block, where we catch a
     * FileNotFoundException that will be thrown if for some reason, we cannot open "gradebook.dat"
     * for writing.
     * <p>
     * PSEUDOCODE:
     * method exit() : void
     * <p>
     * <p>
     * try
     * <p>
     * instantiate a GradebookWriter object named gbWriter, opening "gradebook.dat" for
     * writing
     * <p>
     * call writeGradebook(getRoster()) on gbWriter
     * <p>
     * call System.exit(0) to terminate the application with an exit code of 0
     * <p>
     * <p>
     * catch FileNotFoundException e
     * <p>
     * call messageBox() on getView() to display a message box containing the text "Could
     * <p>
     * not open gradebook.dat for writing. Exiting without saving."
     * <p>
     * call System.exit(-1) to terminate the application with an error code of -1
     * <p>
     * end try-catch
     * <p>
     * <p>
     * end exit
     */
    public void exit() {
        try {
            GradebookWriter gbWriter = new GradebookWriter("gradebook.txt");
            gbWriter.writeGradebook(getRoster());
            System.exit(0);
        } catch (FileNotFoundException pExcept) {
            getView().messageBox("Could not open gradebook.txt for writing. Exiting without saving.");
            System.exit(-1);
        }
    }

    /**
     * This method returns the number of exams in the class by returning the constant NUM_EXAMS.
     */
    public static final int getNumExams() {
        return NUM_EXAMS;
    }

    /**
     * This method returns the number of homework assignments in the class by returning the
     * constant NUM_HOMEWORKS.
     */
    public static final int getNumHomeworks() {
        return NUM_HOMEWORKS;
    }

    /**
     * Accessor method for mRoster.
     */
    private Roster getRoster() {
        return mRoster;
    }

    /**
     * Accessor method for mView.
     */
    private View getView() {
        return mView;
    }

    /**
     * run() is the main routine and is called from main().
     * <p>
     * <p>
     * PSEUDOCODE:
     * <p>
     * method run
     * <p>
     * call JFrame.setDefaultLookAndFeelDecorated(true or false depending on your preference)
     * <p>
     * -- Create the View passing 'this' as the argument so the View will be linked to the y3.s2.ser315.week3.implementation_eghanem.Main
     * <p>
     * -- class, so they may communicate with each other. Then pass the newly created View object
     * <p>
     * -- to setView() to save the reference to the View in our instance variable mView.
     * <p>
     * call setView(new View(this)) to create the View and stored the returned object in mView
     * <p>
     * <p>
     * try
     * <p>
     * -- Note that when we try to open "gradebook.dat" for reading that GradebookReader()
     * <p>
     * -- may throw a FileNotFoundException which we catch here.
     * <p>
     * create a GradebookReader object named gbReader opening "gradebook.dat" for reading
     * <p>
     * -- Read the student roster from the input file.
     * <p>
     * call readGradebook() on gbReader, which returns the Roster
     * <p>
     * call setRoster() on the Roster returned from readGradebook() to save the roster in
     * <p>
     * our instance variable mRoster
     * <p>
     * <p>
     * catch
     * <p>
     * call messageBox() on getView() to display the error message "Could not open
     * <p>
     * gradebook.dat for reading. Exiting."
     * <p>
     * call System.exit(-1) to terminate the application with an exit code of -1
     * <p>
     * end try-catch
     * <p>
     * <p>
     * end run
     */
    private void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        setView(new View(this));
        try {
            GradebookReader gbReader = new GradebookReader("gradebook.txt");
            setRoster(gbReader.readGradebook());
        } catch (FileNotFoundException pExcept) {
            getView().messageBox("Could not open gradebook.txt for reading. Exiting.");
            System.exit(-1);
        }
    }

    /**
     * search() is called when the Search button is clicked in the View. The input parameter is
     * the last name of the Student to search the roster for. Call getStudent(pLastName) on the
     * Roster object (call getRoster() to get the reference to the Roster) to get a reference to
     * the Student with that last name. If the student is not located, getStudent() returns null.
     *
     * @param pLastName The last name of the student who we will search the Roster for.
     *                  <p>
     *                  PSEUDOCODE:
     *                  method search(pLastName : String) : Student
     *                  call getRoster().getStudent(pLastName) and return what getStudent() returns
     *                  end search
     */
    public Student search(String pLastName) {
        return getRoster().getStudent(pLastName);
    }

    /**
     * Mutator method for mRoster.
     */
    private void setRoster(Roster pRoster) {
        mRoster = pRoster;
    }

    /**
     * Mutator method for mView.
     */
    private void setView(View pView) {
        mView = pView;
    }
}
