package Hackerrank;

public class Array2D {

    static int hourSum(int[][] arr, int rows, int cols) {
        int[][] result = new int[4][4];
        int maxSum = 0;

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < cols; j++) {
                int sum = 0;
                for (int k = j; k <= j + 2; k++) {
                    sum += arr[i][k] + arr[i + 2][k];
                }
                sum += arr[i + 1][j + 1];
                result[i][j] = sum;
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }

        }
        for (int[] ints : result) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[][] input = new int[][]{
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0},
        };
        int rowLength = input.length / 2;
        int colLength = input[0].length / 2;
        int result = hourSum(input, rowLength, colLength);
        System.out.println(result);
    }
}
