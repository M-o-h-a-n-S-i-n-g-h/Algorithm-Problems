package DiagonalDiff;


import java.util.Arrays;
import java.util.List;

public class DiagonalDiff {

    static int diagonalDiff(List<List<Integer>> arr) {
        int finalSum = 0;
        int rtl = 0;
        int ltr = 0;

        for (int i = 0, j = 0; i < arr.size() && j < arr.get(0).size(); i++, j++) {
            ltr += arr.get(i).get(j);
        }

        for (int i = 0, j = arr.size() - 1; i < arr.size() && j < arr.get(0).size(); i++, j--) {
            rtl += arr.get(i).get(j);
        }
        finalSum = ltr - rtl;
        return Math.abs(finalSum);
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(9, 8, 9)
        );
        int result = diagonalDiff(arr);
        System.out.println(result);
    }
}
