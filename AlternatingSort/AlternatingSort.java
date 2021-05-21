package AlternatingSort;

import java.util.Arrays;


public class AlternatingSort {

    static int[] alterNateSort(int[] array, int n) {
        int[] result = new int[n];
        Arrays.sort(array);
        double divider = Math.floor( (int) (n / 2));
        int j = 0;
        int k = 1;
        for(int i = n - 1; i >= (int)divider; i--) {
            while(j < n) {
                result[j] = array[i];
                break;
            }
            j += 2;
        }

        for(int i = 0; i <= (int)divider ; i++) {
            while(k < n) {
                result[k] = array[i];
                break;
            }
            k += 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[]{7, 1, 2, 3, 4, 5, 6};
        int n = 7;
        int[] result = alterNateSort(array, n);
        System.out.println(Arrays.toString(result));
    }
}
