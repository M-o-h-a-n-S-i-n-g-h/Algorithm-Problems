package Hackerrank;

import java.util.Arrays;

//TODO:DEBUG IT

public class ArrayManipulation {
    static long manipulate(int n, int m, int[][] queries) {
        if (n == 0 || queries == null || queries.length == 0) {
            return -1;
        }
        long[] computation = new long[n];

        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0] - 1;
            int b = queries[i][1] - 1;
            int k = queries[i][2];
            computation[a] += k;
            if (b + 1 < n) {
                computation[b + 1] -= k;
            }
        }

        long max = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += computation[i];
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        int n = 10;
        int[][] queries = {
                {1, 5, 3},
                {4, 8, 7},
                {6, 9, 1}
        };
        int m = 3;
        long res = manipulate(n, m, queries);
        System.out.println(res);
    }
}

//3,3,3,10,10,8,8,8,1, 0