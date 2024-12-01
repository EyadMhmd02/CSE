package y3.s1.cse222.canvas.m05_elementary_sorts.gpt;

class _1_InsertionSort {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
