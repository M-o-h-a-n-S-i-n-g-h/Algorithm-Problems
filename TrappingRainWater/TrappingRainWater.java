package TrappingRainWater;

import java.util.Arrays;

//TODO:DEBUG IT

public class TrappingRainWater {

    static int findWater(int[] arr, int n) {
        int maxSeenSoFar = 0;
        int[] maxSeenRight = new int[n];
        int maxSeenLeft = 0;
        int rainWater = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > maxSeenSoFar) {
                maxSeenSoFar = arr[i];
                maxSeenRight[i] = maxSeenSoFar;
            } else {
                maxSeenRight[i] = maxSeenSoFar;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            rainWater = rainWater + Integer.max((Integer.min(maxSeenLeft, maxSeenRight[i]) - arr[i]), 0);
            if (arr[i] > maxSeenLeft) {
                maxSeenLeft = arr[i];
            }
        }
        return rainWater;
    }

    public static void main(String[] args) {
        int[] array = {6, 9, 9};
        int length = array.length;
        int result = findWater(array, length);
        System.out.println(result);
    }
}

