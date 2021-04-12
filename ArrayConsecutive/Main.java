package ArrayConsecutive;

import java.lang.System;

// ! NOT SOLVED

public class Main {

    static int findMissingElements(int array[]) {
        int count = 0;
        int length = array.length;
        int missingElementsArray[] = {};
        for (int i = 1; i <= length - 1; i++) {
            if( i == 1 ) continue;
            if (i != array[i]) {
                System.out.println("Inside If " + i);
                missingElementsArray[i] = i;
            }
            count = missingElementsArray.length;
        }
        return count;
    }

    public static void main(String[] args) {
        int numbers[] = { 6, 2, 3, 8 };
        int result = findMissingElements(numbers);
        System.out.println(result);
    }
}
