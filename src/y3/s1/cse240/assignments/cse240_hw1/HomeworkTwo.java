package y3.s1.cse240.assignments.cse240_hw1;

import java.util.Scanner;

/**
 * @author Eyad Mohamed AbdelMohsen Ghanem
 * */
class HomeworkTwo {
    public static void main(String[] args) {
        Classroom classroom;
        Student data;
        int row, col, rowNum, columnNum;
        String info;
        Scanner scan = new Scanner(System.in);

        System.out.println("How many rows do you want?");
        rowNum = scan.nextInt();

        System.out.println("How many columns do you want?");
        columnNum = scan.nextInt();

        classroom = new Classroom(rowNum, columnNum);

        System.out.println("Capture a student information (name/lastname) or enter \"Q\" to quit.");
        info = scan.next();

        while (!info.equalsIgnoreCase("Q")) {
            data = new Student(info);

            System.out.println("Capture the row number where the student wants to sit:");
            row = scan.nextInt();
            System.out.println("Capture the column number where the student wants to sit:");
            col = scan.nextInt();

            if (!classroom.isValid(row, col)) {

                System.out.println("row or column number is not valid.");
                System.out.println("A student " + data.getFirstName() + " " + data.getLastName() + " is not assigned to a seat.\n");

            } else {

                if (classroom.setStudentAt(row, col, data)) {
                    System.out.println("The seat at row " + row + " and column " + col + " is assigned to " + data);
                    System.out.println(classroom);

                } else {

                    System.out.println("The seat at row " + row + " and column " + col + " is taken.\n");

                }
            }

            // Read the next studentInfo
            System.out.println("Capture a student information (name/lastname) or enter \"Q\" to quit.");
            info = scan.next();
        }

        scan.close();
    }
}

/*
SAMPLE OUTPUT:

How many rows do you want?
3
How many columns do you want?
3
Capture a student information (name/lastname) or enter "Q" to quit.
Mickey/Mouse
Capture the row number where the student wants to sit:
1
Capture the column number where the student wants to sit:
2
The seat at row 1 and column 2 is assigned to M.M.

The current seating:
f.b. f.b. f.b.
f.b. f.b. M.M.
f.b. f.b. f.b.

Capture a student information (name/lastname) or enter "Q" to quit.
Daisy/Duck
Capture the row number where the student wants to sit:
2
Capture the column number where the student wants to sit:
0
The seat at row 2 and column 0 is assigned to D.D.

The current seating:
f.b. f.b. f.b.
f.b. f.b. M.M.
D.D. f.b. f.b.

Capture a student information (name/lastname) or enter "Q" to quit.
Clarabelle/Cow
Capture the row number where the student wants to sit:
2
Capture the column number where the student wants to sit:
1
The seat at row 2 and column 1 is assigned to C.C.

The current seating:
f.b. f.b. f.b.
f.b. f.b. M.M.
D.D. C.C. f.b.

Capture a student information (name/lastname) or enter "Q" to quit.
Max/Goof
Capture the row number where the student wants to sit:
0
Capture the column number where the student wants to sit:
0
The seat at row 0 and column 0 is assigned to M.G.

The current seating:
M.G. f.b. f.b.
f.b. f.b. M.M.
D.D. C.C. f.b.

Capture a student information (name/lastname) or enter "Q" to quit.
Horace/Horsecollar
Capture the row number where the student wants to sit:
5
Capture the column number where the student wants to sit:
1
row or column number is not valid.
A student Horace Horsecollar is not assigned to a seat.

Capture a student information (name/lastname) or enter "Q" to quit.
Sylvester/Shyster
Capture the row number where the student wants to sit:
2
Capture the column number where the student wants to sit:
0
The seat at row 2 and column 0 is taken.

Capture a student information (name/lastname) or enter "Q" to quit.
Snow/White
Capture the row number where the student wants to sit:
-1
Capture the column number where the student wants to sit:
0
row or column number is not valid.
A student Snow White is not assigned to a seat.

Capture a student information (name/lastname) or enter "Q" to quit.
Jiminy/Criket
Capture the row number where the student wants to sit:
0
Capture the column number where the student wants to sit:
2
The seat at row 0 and column 2 is assigned to J.C.

The current seating:
M.G. f.b. J.C.
f.b. f.b. M.M.
D.D. C.C. f.b.

Capture a student information (name/lastname) or enter "Q" to quit.
Q
*/
