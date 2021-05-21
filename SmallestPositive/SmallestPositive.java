package SmallestPositive;

import java.util.*;

public class SmallestPositive {

    // static int findMissing(int[] array) {
 /*       int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 && array[i + 1] != 1) {
                return 1;
            } else if (array[i] == 0) {
                k = 0;
                System.out.println(i + " " + "I" + " " + array[i] );
                        ///////////////////////
                for (k = 0; k <= array.length; k++) {
                    if(k - 1 == array[i - 1]){
                        i++;
                        k++;
                    }
                    else if (k != array[i]) {
                        System.out.println(k + " " + array[i]);
                        return k;
                    }
                    i++;
                }
            } else if (array[i] > 0) {
                k = 1;
                for (k = 1; k <= array.length; k++) {
                    if (k != array[i]) {
                        System.out.println(k + " " + array[i]);
                        return k;
                    }
                    i++;
                }
            } else {
                continue;
            }
        }
        if (k == array.length) return k + 1;
        return k;*/
    //   return 0;
    //}

    //TODO:DEBUG

    static int solution(int[] A) {
        int n = A.length;
        boolean[] present = new boolean[n + 1];
        for (int j : A) {
            if (j > 0 && j <= n)
                present[j] = true;
        }
        for (int i = 1; i <= n; i++)
            if (!present[i])
                return i;
        return n + 1;
    }


    public static void main(String[] args) {
        int[] array = {2, 3, -7, 6, 8, 1, -10, 15};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int result = solution(array);
        System.out.println(result);
    }

}
