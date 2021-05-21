package ImmediateSmaller;

import java.util.Arrays;

public class ImmediateSmaller {

    static int findSmaller(int[] arr, int x) {
        int max = -1;
        for (int i : arr) {
            if (i < x && i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-47, 1, 4, 49, -18, 10, 26, 18, -11, -38, -24, 36, 44, -11, 45, 20, -16, 28, 17, -49, 47, -48, -33, 42, 2, 6, -49, 30, 36, -9, 15, 39, -6, -31, -10, -21, -19, -33, 47, 21, 31, 25, -41, -23, 17, 6, 47, 3, 36, 15, -44, 33, -31, -26, -22, 21, -18, -21, -47, -31, 20, 18, -42, -35, -10, -1, 46, -27, -32, -5, -4, 1, -29, 5, 29, 38, 14, -22, -9, 0, 43, -50, -16, 14, -26};
        int x = 1;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
//        int result = findSmaller(array, x);
//        System.out.println(result);
    }
}
