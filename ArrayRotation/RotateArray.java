package ArrayRotation;

import java.lang.reflect.Array;
import java.util.*;

public class RotateArray {

//    static int[] rotateArray(int[] array, int limit) {
//        reverse(array, 0, array.length - 1);
//        reverse(array, array.length - limit, array.length - 1);
//        reverse(array, 0, array.length - limit - 1);
//        return array;
//    }

    static void reverse(int[] arr, int k, int l) {
        while (k < l) {
            int temp = arr[k];
            arr[k] = arr[l];
            arr[l] = temp;
            k++;
            l--;
        }
    }
    static int[] rotLeft(int[] arr, int d) {
        int length = arr.length;
        reverse(arr, 0 , length - 1);
        reverse(arr, length - d, length - 1);
        reverse(arr, 0, length - d - 1 );
        return arr;
    }
//
//    static void reverse(int[] b, int d, int l){
//        int j = l;
//        while(i < j) {
//            int temp = b[i];
//            b[i] = b[j];
//            b[j] = temp;
//            i++;
//            j--;
//        }
//    }


    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        int limit = 4;
        int[] result = rotLeft(array, limit);
        System.out.println(Arrays.toString(result));
    }
}
