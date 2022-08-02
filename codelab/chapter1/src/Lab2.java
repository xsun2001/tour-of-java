import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.random.RandomGenerator;

public class Lab2 {
    public static void quickSort(int[] arr) {
        // Implement your quickSort!
    }

    private static final List<Integer> nList = List.of(10, 1000, 10000, 1000000, 5000000);

    public static long measureTime(Runnable func) {
        var before = Instant.now();
        func.run();
        var after = Instant.now();
        return Duration.between(before, after).toNanos() / 1000;
    }

    public static int[] randomArray(int n, RandomGenerator random) {
        return random.ints(n).toArray();
    }

    public static boolean isSorted(int[] arr) {
        int last = Integer.MIN_VALUE;
        for (int x : arr) {
            if (last <= x) {
                last = x;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        var random = RandomGenerator.getDefault();
        for (int n : nList) {
            var arr = randomArray(n, random);
            var time = measureTime(() -> quickSort(arr));
            if (isSorted(arr)) {
                System.out.printf("n = %7d, Array sorted, elapsed time = %d us\n", n, time);
            } else {
                System.out.printf("n = %7d, Array unsorted!\n", n);
                System.exit(-1);
            }
        }
        System.out.println("All tests PASSED!");
    }
}
