package y3.s1.cse222.canvas.m05_elementary_sorts.gpt;

class _2_SelectionSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the smallest element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 2};
        sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
