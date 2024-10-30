package y1.s2.Modules.ModuleFinalExam.oop;

public class _2_1_Array {
    public static void main(String[] args) {
        int[][] a = new int[4][3];

        int[][] b = {
                {3, 4, 5},
                {6, 7, 8},
                {9, 10, 11},
                {12, 13, 14}
        };

        // O(n^2)
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
