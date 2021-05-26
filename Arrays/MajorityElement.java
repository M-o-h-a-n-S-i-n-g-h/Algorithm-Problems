package Arrays;

import java.util.Arrays;

public class MajorityElement {

    static int findMajorityElement(int[] array) {
        int[] tracker = new int[1000000];
        int length = array.length;
        int checker = (int) Math.floor(Math.abs((float) length / 2));

        for (int i : array) {
            tracker[i]++;
        }

        for (int i : array) {
            if (tracker[i] > checker) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 15};
        int result = findMajorityElement(array);
        System.out.println(result);
    }
}
