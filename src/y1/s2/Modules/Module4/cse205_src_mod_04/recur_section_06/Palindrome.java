package y1.s2.Modules.Module4.cse205_src_mod_04.recur_section_06;
//*******************************************************************************
// CLASS: Palindrome (Palindrome.java)
//
// DESCRIPTION
// Employs recursion to implement a recursive method which determines if a string
// is a palindrome.
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering
// School of Computing, Informatics, and Decision Systems Engineering
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: http://www.devlang.com
//*******************************************************************************

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        while (true) {
            new Palindrome().run();
        }
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string? ");
        String s = in.next();
        if (isPalindromic(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("NOT Palindrome");
        }
    }

    public boolean isPalindromicLoopSolution(String str) {
        for (int i = 0, j = str.length() - 1; i < str.length() && j >= 0; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Rule 1: A string s, s.length() ≤ 1, is a palindrome.
     * <p>
     * <p>
     * Rule 2: A string s, s.length() > 1, is not a palindrome if s[0] ≠ s[s.length()-1].
     * <p>
     * <p>
     * Rule 3: A string s, s.length() ≥ 2, is a palindrome if both of these requirements are met:
     * <p>
     * a. s[0] = s[s.length()-1]
     * <p>
     * b. The substring t = s[1]:[s.length()-2] is a palindrome.
     */
    public boolean isPalindromic(String s) {
        if (s.length() <= 1) {
            return true;
        } else {
            if (s.charAt(0) != s.charAt(s.length() - 1)) {
                return false;
            } else {
                String t = s.substring(1, s.length() - 1);
                return isPalindromic(t);
            }
        }
    }
}
