package Duplicates;

import java.lang.reflect.Array;
import java.util.*;

class FindDuplicate {
    // Function to print duplicates
    void printRepeating(int[] arr, int size) {
        int i;
        int j = 0;
        for (i = 0; i < size - 1; i++) {
            if (arr[i] != arr[i + 1])
                arr[j++] = arr[i];
            arr[j++] = arr[size - 1];
        }
        System.out.println(Arrays.toString(arr));
    }

    // Driver code
    public static void main(String[] args) {
        FindDuplicate duplicate = new FindDuplicate();
        int arr[] = {1, 2, 3, 1, 3, 6, 6};
        int arr_size = arr.length;
        duplicate.printRepeating(arr, arr_size);
    }
}
