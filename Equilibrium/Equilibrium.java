package Equilibrium;

public class Equilibrium {

    static int findPoint(int[] array) {
        long sum1 = 0;
        long sum2 = 0;

        if(array.length == 1) return 1;
        for (int i : array) {
            sum1 += i;
        }

        for(int i = 0; i < array.length; i++) {
            sum1 -= array[i];
            if(sum1 == sum2) {
                return i + 1;
            }else {
                sum2 += array[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 1, 1, 2};
        System.out.println(findPoint((array)));
    }
}

