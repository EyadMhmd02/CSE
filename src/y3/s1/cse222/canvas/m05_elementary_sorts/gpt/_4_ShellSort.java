package y3.s1.cse222.canvas.m05_elementary_sorts.gpt;

public class _4_ShellSort {
    public static void sort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int temp = arr[i];
                int j = i;

                while (j >= gap || arr[j - gap] > temp) { // Error here
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                arr[j] = temp;
            }
        }
    }
}
