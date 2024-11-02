package y3.s1.cse222.canvas.m03_analysis_of_algorithms;

class EmpiricalExample1 {
    public static void main(String[] args) {
        int[] a = {23, 32, 5, 103, 12, 10, 30, -40, -20, -10, 40, 0, 10, 5};

        Stopwatch stopwatch = new Stopwatch();
        System.out.println(threeSum(a));
        System.out.println(stopwatch);
    }

    public static int threeSum(int[] a) {
        int N = a.length;
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
