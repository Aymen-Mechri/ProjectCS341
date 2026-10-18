/**
 * 1B Two Floodwalls
 *
 * Input:  walls[i] = height of the wall at position i (n >= 2, heights >= 0)
 * Output: the largest min(walls[i], walls[j]) * (j - i) over all i < j
 *
 * Keep the class name, method names and parameter types exactly as they are;
 * the test runner looks them up by name. You may add helper methods.
 */
public class TwoFloodwalls {

    /** Brute force solution. Time: O(n^2)  Space: O(1) */
    public static int brute(int[] walls) {
        long maxArea = 0;

        for (int i = 0; i < walls.length - 1; i++) {
            for (int j = i + 1; j < walls.length; j++) {
                int waterHeight = Math.min(walls[i], walls[j]);
                int width = j - i;
                long area = (long) waterHeight * width;
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }

        return Math.toIntExact(maxArea);
    }

    /** Optimized solution (two pointers). Time: O(n)  Space: O(1) */
    public static int optimized(int[] walls) {
        int left = 0;
        int right = walls.length - 1;
        long maxArea = 0;

        while (left < right) {
            int waterHeight = Math.min(walls[left], walls[right]);
            long area = (long) waterHeight * (right - left);
            if (area > maxArea) {
                maxArea = area;
            }


            if (walls[left] <= walls[right]) {
                left++;
            } else {
                right--;
            }
        }

        return Math.toIntExact(maxArea);
    }
}
