package SortByHeight;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static int[] sortByHeight(int[] array) {
        ArrayList<Integer> skipIndex = new ArrayList<>();
        ArrayList<Integer> numIndex = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1) {
                skipIndex.add(i);
            } else {
                numIndex.add(i);
            }
        }

        for (int i = 0; i < skipIndex.size(); i++) {
            for (int j = 1; j < numIndex.size() - i; j++) {
                if (array[numIndex.get(j)] < array[numIndex.get(j - 1)]) {
                    int temp = array[numIndex.get(j)];
                    array[numIndex.get(j)] = array[numIndex.get(j - 1)];
                    array[numIndex.get(j - 1)] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {-1, 150, 190, 170, -1, -1, 160, 180};
        int[] result = sortByHeight(array);
        System.out.println(Arrays.toString(result));
    }
}
