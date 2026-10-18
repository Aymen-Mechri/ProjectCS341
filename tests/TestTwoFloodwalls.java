import java.util.Random;

/** Additional tests for 1B. Keep separate from the required solution file. */
public class TestTwoFloodwalls {
    private static int count = 0;

    private static void check(int[] walls, int expected) {
        int brute = TwoFloodwalls.brute(walls);
        int optimized = TwoFloodwalls.optimized(walls);
        if (brute != expected || optimized != expected) {
            throw new AssertionError("Expected " + expected
                + ", brute=" + brute + ", optimized=" + optimized);
        }
        count++;
    }

    public static void main(String[] args) {
        check(new int[]{2, 7, 3, 1, 6, 4, 2, 5}, 30);
        check(new int[]{2, 5}, 2);
        check(new int[]{0, 0, 0}, 0);
        check(new int[]{5, 5, 5}, 10);
        check(new int[]{1, 1}, 1);
        check(new int[]{1, 2, 3, 4}, 4);
        check(new int[]{4, 3, 2, 1}, 4);
        check(new int[]{3, 0, 3}, 6);

        // Compare two independent implementations on many general inputs.
        Random random = new Random(341);
        for (int trial = 0; trial < 1000; trial++) {
            int n = 2 + random.nextInt(40);
            int[] walls = new int[n];
            for (int i = 0; i < n; i++) {
                walls[i] = random.nextInt(100);
            }
            int brute = TwoFloodwalls.brute(walls);
            int optimized = TwoFloodwalls.optimized(walls);
            if (brute != optimized) {
                throw new AssertionError("Algorithms disagree on trial " + trial);
            }
            count++;
        }
        System.out.println("PASS: " + count + " tests for TwoFloodwalls");
    }
}
