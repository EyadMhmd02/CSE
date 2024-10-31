package y3.s1.cse222.canvas.ser222_01_01_slides_recursion._1_linear_search_example;

/**
 * Given an array of values, determine if a value is contained in that array.
 * <p>
 * Mechanism:
 * Check each element against the value
 */
class LinerSearchExample {

    public static boolean linearSearch(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                System.out.println("n = " + n + " == arr[" + i + "] = " + arr[i] + ".");
                return true;
            }
            System.out.println("n = " + n + " != arr[" + i + "] = " + arr[i] + ".");
        }
        return false;
    }


    public static void main(String[] args) {
                      // 0  1  2  3  4
        int[] numbers = {4, 3, 2, 9, 7};

        System.out.println(linearSearch(10, numbers));
    }
}
