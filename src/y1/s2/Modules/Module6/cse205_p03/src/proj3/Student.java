//**************************************************************************************************
// CLASS: Student
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// (c) Kevin R. Burger 2014-2019
//**************************************************************************************************
package y1.s2.Modules.Module6.cse205_p03.src.proj3;

import java.util.ArrayList;

/**
 * The Student class stores the gradebook information for one Student.
 * <p>
 * Note that Student implements the java.lang.Comparable<Student> interface because we are going
 * to be sorting the roster of students by last name so we need to be able to compare the last
 * names of two students A and B to determine if A < B, or if A = B, or if A > B. See the
 * compareTo() method.
 */
public class Student implements Comparable<Student> {

    /**
     * mCurrStudent is a reference to the Student object which is currently being displayed and
     * edited in the View. It should only be accessed via accessor/mutator methods.
     */
    private static Student mCurrStudent;

    /**
     * mExamList is an ArrayList of Integers storing the student's exam scores.
     */
    private ArrayList<Integer> mExamList;

    /**
     * The student's first name.
     */
    private String mFirstName;

    /**
     * mHomework List is an ArrayList of Integers storing the student's homework scores.
     */
    private ArrayList<Integer> mHomeworkList;

    /**
     * The student's lst name.
     */
    private String mLastName;

    /**
     * Student()
     * <p>
     * PSEUDOCODE:
     * method Student(pFirstName : String, pLastName : String)
     * save parameters pFirstName and pLastName to instance variables by calling mutators
     * -- Note that we only create the exam list here, it will be populated later
     * create an ArrayList<Integer> and pass it off to setExamList()
     * -- Note that we only create the homework list here, it will be populated later
     * create an ArrayList<Integer> and pass it off to setHomeworkList()
     * end Student()
     */
    public Student(String pFirstName, String pLastName) {
        setFirstName(pFirstName);
        setLastName(pLastName);
        setExamList(new ArrayList<Integer>());
        setHomeworkList(new ArrayList<Integer>());
    }

    /**
     * addExam()
     * <p>
     * Adds an exam score pScore to the exam list
     *
     * @param pScore PSEUDOCODE:
     *               method addExam(pScore : int) : void
     *               call add(pScore) on getExamList() to add a new exam score to the list of exam scores.
     *               end addExam
     */
    public void addExam(int pScore) {
        getExamList().add(pScore);
    }

    /**
     * addHomework()
     * <p>
     * Adds a homework score pScore to the homework list
     *
     * @param pScore PSEUDOCODE:
     *               method addHomework(pScore : int) : void
     *               call add(pScore) on getHomeworkList() to add a new homework score to the list of
     *               homework scores
     *               end addHomework
     */
    public void addHomework(int pScore) {
        getHomeworkList().add(pScore);
    }

    /**
     * compareTo()
     *
     * @param pStudent is a Student
     *                 <p>
     *                 This method compares the last name of 'this' Student to the last name of pStudent to
     *                 determine if the last name of 'this' Student is <, =, or > the last name of pStudent.
     *                 It is called during the quick sort routine in Sorter.partition().
     *                 <p>
     *                 Provide the annotation that prevents accidental overloading since we are overriding the
     *                 String.compareTo() method.
     *                 <p>
     *                 <p>
     *                 PSEUDOCODE:
     *                 <p>
     *                 method compareTo(pStudent : Student) : int
     *                 <p>
     *                 return: -1 if the last name of this Student is < the last name of pStudent
     *                 <p>
     *                 return: 0 if the last name of this Student is = the last name of pStudent
     *                 <p>
     *                 return: 1 if the last name of this Student is > the last name of pStudent
     *                 <p>
     *                 hint: the last names are Strings and String already implements compareTo().
     *                 <p>
     *                 end compareTo
     */
    @Override
    public int compareTo(Student pStudent) {
        return getLastName().compareTo(pStudent.getLastName());
    }

    /**
     * Accessor method for mCurrStudent.
     */
    public static Student getCurrStudent() {
        return mCurrStudent;
    }

    /**
     * getExam()
     * <p>
     * Accessor method to retrieve an exam score from the list of exams.
     *
     * @param pNum The exam number for which we wish to retrieve the score.
     * @return The exam score.
     * <p>
     * Hint: Call getExamList() to get the ArrayList<Integer> object storing the exam scores.
     * Since that object is an ArrayList<Integer>, we next call the get(index) method to retrieve
     * the correct exam score.
     */
    public int getExam(int pNum) {
        return getExamList().get(pNum);
    }

    /**
     * getExamList()
     * <p>
     * Accessor method for mExamList.
     */
    private ArrayList<Integer> getExamList() {
        return mExamList;
    }

    /**
     * getFirstName()
     * <p>
     * Accessor method for mFirstName.
     */
    public String getFirstName() {
        return mFirstName;
    }

    /**
     * getFullName()
     * <p>
     * Returns the student's full name in the format: "lastname, firstname".
     */
    public String getFullName() {
        return mLastName + ", " + mFirstName;
    }

    /**
     * getHomework()
     * <p>
     * Accessor method to retrieve a homework score from the list of homeworks.
     *
     * @param pNum The homework number for which we wish to retrieve the score.
     * @return The homework score.
     * <p>
     * Hint: Call getHomeworkList() to get the ArrayList<Integer> object storing the hw scores.
     * Since that object is an ArrayList<Integer>, we next call the get(index) method to retrieve
     * the correct hw score.
     */
    public int getHomework(int pNum) {
        return getHomeworkList().get(pNum);
    }

    /**
     * getHomeworkList()
     * <p>
     * Accessor method for mHomeworkList.
     */
    private ArrayList<Integer> getHomeworkList() {
        return mHomeworkList;
    }

    /**
     * getLastname()
     * <p>
     * Accessor method for mLastName.
     */
    public String getLastName() {
        return mLastName;
    }

    /**
     * Mutator method for mCurrStudent.
     */
    public static void setCurrStudent(Student pCurrStudent) {
        mCurrStudent = pCurrStudent;
    }

    /**
     * setExam()
     * <p>
     * Mutator method to store an exam score into the list of exam scores.
     *
     * @pNum is the index into the list of exams, where 0 is the index of the first exam score.
     * <p>
     * See the hint for getExam(). This method will be similar, but rather than calling get()
     * on the ArrayList<Integer> object to get a score, we need to call set(index, value) method
     * to set the value in the ArrayList<Integer> at index 'index' to 'value'.
     */
    public void setExam(int pNum, int pScore) {
        getExamList().set(pNum, pScore);
    }

    /**
     * setExamList()
     * <p>
     * Mutator method for mExamList.
     */
    private void setExamList(ArrayList<Integer> pExamList) {
        mExamList = pExamList;
    }

    /**
     * setFirstName()
     * <p>
     * Mutator method for mFirstName.
     */
    public void setFirstName(String pFirstName) {
        mFirstName = pFirstName;
    }

    /**
     * setHomework()
     * <p>
     * Mutator method to store a homework score into the list of homework scores.
     *
     * @pNum is the index into the list of homeworks, where 0 is the index of the first hw score.
     * <p>
     * See the hint for getHomework(). This method will be similar, but rather than calling get()
     * on the ArrayList<Integer> object to get a score, we need to call set(index, value) method
     * to set the value in the ArrayList<Integer> at index 'index' to 'value'.
     */
    public void setHomework(int pNum, int pScore) {
        getHomeworkList().set(pNum, pScore);
    }

    /**
     * setHomeworkList()
     * <p>
     * Mutator method for mHomeworkList.
     */
    private void setHomeworkList(ArrayList<Integer> pHomeworkList) {
        mHomeworkList = pHomeworkList;
    }

    /**
     * setLastname()
     * <p>
     * Mutator method for mLastName.
     */
    public void setLastName(String pLastName) {
        mLastName = pLastName;
    }

    /**
     * toString()
     * <p>
     * Returns a String representation of this Student. The format of the returned string shall be
     * such that the Student information can be printed to the output file in this format:
     * <p>
     * lastname firstname exam1 exam2 exam2 hw1 hw2 hw3 hw4 hw5
     * <p>
     * where the fields are separated by spaces, except there is not space following hw5.
     * <p>
     * Hint: The String class has a method named trim() that removes leading and trailing white-
     * space from a string.
     * <p>
     * Hint: use enhanced for loops
     */
    @Override
    public String toString() {
        String result = getLastName() + " " + getFirstName() + " ";
        for (Integer exam : getExamList()) {
            result += exam + " ";
        }
        for (Integer hw : getHomeworkList()) {
            result += hw + " ";
        }
        return result.trim();
    }
}
