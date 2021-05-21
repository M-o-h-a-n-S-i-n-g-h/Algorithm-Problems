package MergeArrays;

import java.util.*;

public class MergeArrays {

    public static void main(String[] args) {
        int[] array1 = {2, 5, 1, 2, 7};
        int[] array2 = {9, 3, 7, 4, 5, 1};
        int n = array1.length + array2.length;
        int[] array3 = new int[n];
        int[] temp = new int[n];
        int[] temp2 = new int[n];
        System.arraycopy(array1, 0, array3, 0, array1.length);

        int g = 0;
        int len = array1.length;
        int m = array2.length;
        int[] count = new int[n];
        int j = 0;
        Arrays.sort(array3);
        for (int i = 0; i < n - 1; i++)
            if (array3[i] != array3[i + 1])
                array3[j++] = array3[i];
        array3[j++] = array3[n - 1];

        for (int i = 0; i < j ; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
