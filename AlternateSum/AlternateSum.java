package AlternateSum;

import java.util.Arrays;

public class AlternateSum {
    static int[] findAlternateSum(int[] array) {
        int[] temp = new int[]{0, 0};
        for (int i = 0; i < array.length; i++) {
            if ((i & 1) == 0) {
                temp[0] += array[i];
            } else {
                temp[1] += array[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] array = new int[]{80};
        int[] result = findAlternateSum(array);
        System.out.println(Arrays.toString(result));
    }

}
