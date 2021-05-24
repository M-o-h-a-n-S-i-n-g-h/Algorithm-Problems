package FindMissingRepeating;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
public class FindMissingRepeating {

    static int[] findIt(int[] array) {
        int length = array.length;
        int repeating = 0, missing = 0;
        int[] tracker = new int[length + 1];
        Arrays.fill(tracker, 0);

        for (int j : array) {
            tracker[j]++;
        }

        for (int i = 0; i < tracker.length; i++) {
            if (tracker[i] == 0 && i != 0) {
                missing = i;
            } else if (tracker[i] > 1) {
                repeating = i;
            }
        }
        return new int[]{missing, repeating};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 2};
        int[] result = findIt(nums);
        System.out.println(Arrays.toString(result));
    }
}
