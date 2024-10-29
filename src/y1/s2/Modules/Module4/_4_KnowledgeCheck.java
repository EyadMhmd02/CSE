package y1.s2.Modules.Module4;

/**
 * <a href="https://mygu.instructure.com/courses/769/quizzes/1971?module_item_id=27563">...</a>
 */
public class _4_KnowledgeCheck {
    public static void main(String[] args) {
        q3();
    }

    static int factorial(int n) {
        if (n != 0) return n * factorial(n - 1);
        else return 1;

        /**
         * What does the method do when the base case is reached?
         * */

        // return 1
    }

    static void q2() {
        int[] x = {10, 18, 20, 23, 24, 64, 77, 106, 121, 142, 151, 176, 195, 287, 332, 356, 359, 385, 399, 444, 452, 484, 492, 645, 731, 771, 781, 795, 851, 860, 966, 967};
        /*
          If we are looking for the element with the
          value 23, how many times does a linear search
          method access the array
          (including the access for 23)?
          */
        linearSearch(x, 23);

        // 4
    }

    public static void linearSearch(int[] arr, int n) {
        int counter = 0;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            counter++;
            if (n == arr[i]) {
                found = true;
                System.out.println("index = " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("not found");
        }
        System.out.println("access = " + counter);
    }

    static void q3() {
        int[] x = {10, 18, 20, 23, 24, 64, 77, 106, 121, 142, 151, 176, 195, 287, 332, 356, 359, 385, 399, 444, 452, 484, 492, 645, 731, 771, 781, 795, 851, 860, 966, 967};
        /*
          If we are looking for the element with the value 23,
          how many times does a binary search method access
          the array
          (including the access for 23)?
          */
        binarySearch(x, 23, 0, x.length - 1);

        //
    }

    static int counter = 0;

    public static void binarySearch(int[] arr, int n, int low, int high) {
        if (low > high) {
            counter++;
            System.out.println("not found");
            return;
        }
        int mid = (low + high) / 2;
        if (n == arr[mid]) {
            counter++;
            System.out.println("index = " + mid);
        } else if (n < arr[mid]) {
            counter++;
            binarySearch(arr, n, low, mid - 1);
        } else {
            counter++;
            binarySearch(arr, n, mid + 1, high);
        }
        System.out.println("access = " + counter);
    }

    public static void q4() {
        /*
          What are the three main operations that
          we have to perform on data structures?
          */

        // add
        // remove
        // search
    }

    public static void q5() {
        /**
         * if f(n) = 400n^2 - 200n + 100
         * What is the most appropriate function g(n) such that f(n) is O(g(n))?
         * */

        // n^2
    }
}
