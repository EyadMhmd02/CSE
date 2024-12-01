package y3.s1.cse222.canvas.m05_elementary_sorts.gpt;

class _3_ShellSort {
    public static void sort(int[] arr) {
        // Loop over the gap sequence
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            // Sorting the sublists for the current gap
            for (int i = gap; i < arr.length; i++) {
                int temp = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                arr[j] = temp;
            }
        }
    }


}
