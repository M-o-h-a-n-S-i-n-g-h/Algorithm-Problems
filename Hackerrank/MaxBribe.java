package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxBribe {
    static void maxBribe(int[] arr, int n) {
        ArrayList<Integer> indexArray = new ArrayList<>(n);
        ArrayList<Integer> list = new ArrayList<>(n);
        int k = 1;
        int count = 0;
        boolean flag = true;
        for (int i : arr) {
            list.add(i);
        }

        for (int i = 0; i < n; i++, k++) {
            indexArray.add(k);
        }

        for (int j : indexArray) {
            int index = list.indexOf(j);
            int outIndex = indexArray.indexOf(j);
            int compare = Math.abs(index - outIndex);

           if(index < outIndex - 2){
               System.out.println("Too chaotic");
               break;
           }
            if (index > outIndex) {
                count += Math.abs(outIndex - index);
            }
        }
        if (!flag) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(count);
        }
    }


    public static void main(String[] args) {
        int[] array = {5, 1, 2, 3, 7, 8, 6, 4}; // 1 2 3 4 5 6 7 8
        int n = array.length;
        maxBribe(array, n);
    }
}
