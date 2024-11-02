package y3.s1.cse222.canvas.m01_java_review_data_abstraction._1_java_review._1_linear_search_example;

/**
 * Basic Java Program
 */
class BasicJavaProgram {
    public static void main(String[] args) {
        int[] numbers =
          // i = 0  1  2  3  4
          // length = 5
          // i < 5
          // i < numbers.length
          // i++
                {3, 4, 7, 9, 0};
        System.out.println(sumArray(numbers));
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
