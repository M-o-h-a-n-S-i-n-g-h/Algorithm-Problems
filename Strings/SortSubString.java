package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class SortSubString {

   static void sortSubString(String string, int N, int K) {
       int i = 0;
       int j = N;
       char[] str = string.toCharArray();
       Arrays.sort(str, 1, 3);
       System.out.println(Arrays.toString(str));
//       Integer[] str = new Integer[K];
//        while( j <= K) {
//            int characterN = string.charAt(N);
//            str[i++] = characterN;
//            j++;
//        }
//       Arrays.sort(str, Collections.reverseOrder());
//
//        for(int k = 0; k < str.length; k++) {
//            int character = str[i];
//        }
//       while( N <= K) {
//           int characterN = string.charAt(N);
//           str[i++] = characterN;
//           N++;
//       }
    }

    public static void main(String[] args) {
        int N = 1;
        int K = 3;
        String string = "lleho";
        sortSubString(string, N, K);
    }
}
