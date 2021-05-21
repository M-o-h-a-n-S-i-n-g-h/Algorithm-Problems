package WaveArray;

import java.util.Arrays;

public class WaveArray {

    static int[] waveArray(int[] array) {
        int end = array.length - 1;
        if ((array.length & 1) == 1) {
            end = array.length - 2;
        }
        int i = 0;
        int j = 1;
        while (i < j) {
            if (j > end) {
                break;
            }
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i += 2;
            j += 2;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 7, 8, 9, 10};
        System.out.println(Arrays.toString(waveArray(array)));
    }
}
