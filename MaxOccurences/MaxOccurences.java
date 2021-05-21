package MaxOccurences;

import java.util.*;

public class MaxOccurences {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 2, 3, 4, 5, 6, 7, 8};
        int x = 2;
        int y = 7;
        int countX = 0;
        int countY = 0;
        for (int j : array) {
            if (j == x) {
                countX += 1;
            } else if (j == y) {
                countY += 1;
            }
        }
        if(countX == countY) System.out.println(Math.min(x, y));
        if(countX > countY) {
            System.out.println(x);
        }else {
            System.out.println(y);
        }
    }
}
