package RotateMatrix;

public class RotateMatrix {

    public static void main(String[] args) {
//        int[][] array = {
//                {59, 62, 5, 19, 13, 23, 69},
//                {79, 28, 92, 17, 70, 12, 54},
//                {25, 82, 37, 22, 39, 4, 12},
//                {70, 46, 28, 83, 72, 95, 42},
//                {1, 6, 43, 93, 27, 36, 65},
//                {35, 65, 96, 54, 48, 100, 74},
//                {68, 63, 92, 3, 96, 68, 34}
//        };
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int row = array.length;
        int col = array[0].length;
        int[][] temp = new int[row][col];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }

//        int high = row - 1;
//        int low = 0;
//        int k = 0;
//
//        while (low < high) {
//            while (k < col) {
//                int temp1 = temp[low][k];
//                temp[low][k] = temp[high][k];
//                temp[high][k] = temp1;
//                k++;
//            }
//            low++;
//            high--;
//        }

//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                array[i][j] = temp[i][j];
//            }
//        }
////
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
