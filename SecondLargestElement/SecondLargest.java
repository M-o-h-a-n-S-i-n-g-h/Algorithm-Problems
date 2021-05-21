package SecondLargestElement;

import java.util.Arrays;

public class SecondLargest {

    static int findSecondLargest(int[] A, int N) {
        Arrays.sort(A);
        int i = 0;
        if (A[0] == A[N - 1]) {
            return -1;
        }
        if (A[N - 1] != A[N - 2]) {
            return A[N - 2];
        } else {
            while (A[N - i - 3] == A[N - 1]) {
                i++;
            }
            return A[N - i - 3];
        }
    }

    public static void main(String[] args) {
        int[] A = new int[]{2, 4, 5, 6, 7};
        int N = A.length;
        int result = findSecondLargest(A, N);
        System.out.println(result);
    }
}
