package Hackerrank;

import java.util.Arrays;

public class MinimumSwaps {


    public static void main(String[] args) {
        int count = 0;
        int[] array = {7, 1, 3, 2, 4, 5, 6};
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {
                int k = i;
                while (array[k] != i + 1) {
                    k++;
                }
                int temp = array[i];
                array[i] = array[k];
                array[k] = temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
