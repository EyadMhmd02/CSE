package y3.s1.cse240.lecs.lec07;

class Lec07 {

    private static void example1() {
        int x = 5;
        Integer y = x; // In Java, we use objects to simulate pointers
        System.out.println("x\tvalue of x:\t\t\t\t\t\t" + x);
        System.out.println("y\tvalue of y (simulated pointer):\t" + y);
    }

    private static void example2() {
        int x = 5;
        Integer y = x; // Simulating a pointer
        Integer z = y; // Simulating a pointer to a pointer
        System.out.println("x\tvalue of x:\t\t\t\t\t\t\t\t\t" + x);
        System.out.println("y\tvalue of y (simulated pointer):\t\t\t\t" + y);
        System.out.println("z\tvalue of z (simulated pointer to pointer):\t" + z);
    }

    private static void example3() {
        int a = 12;
        Integer b = null, c = null; // Simulating pointers with objects
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        b = a; // Assigning value
        a = 24; // Directly modifying the value
        c = b; // Simulating pointer to pointer
        a = 48; // Directly modifying the value
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }

    private static void arrays1() {
        int[] a = new int[4];
        a[0] = 0; // same as *(a + 0) in C
        a[1] = 1; // same as *(a + 1) in C
        a[2] = 2; // same as *(a + 2) in C
        a[3] = 3; // same as *(a + 3) in C
    }

    private static void arrays2() {
        int i = 0;
        char[] a = "Hello CSE 240".toCharArray();
        System.out.println("\n message: " + new String(a));

        // iterate the whole string
        while (i < a.length && a[i] != '\0') {
            a[i] = (char) (a[i] + 1);
            i++;
        }
        System.out.println("\n message after encryption: " + new String(a));

        for (int j = 0; j < a.length; j++) {
            a[j] = (char) (a[j] - 1);
        }
        System.out.println("\n message after decryption: " + new String(a));
    }

    public static void main(String[] args) {
//         example1();
//         example2();
//         example3();
        arrays2();
    }
}

// example1()
/*
x	value of x:		                5
y	value of y (simulated pointer):	5
 */

// example2()
/*
x	value of x:									5
y	value of y (simulated pointer):				5
z	value of z (simulated pointer to pointer):	5

*/

// example3()
/*
a = 12, b = null, c = null
a = 48, b = 12, c = 12
 */


// arrays2()
/*

 message: Hello CSE 240

 message after encryption: Ifmmp!DTF!351

 message after decryption: Hello CSE 240

 */