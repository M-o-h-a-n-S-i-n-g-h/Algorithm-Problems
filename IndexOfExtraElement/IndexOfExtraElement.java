package IndexOfExtraElement;

public class IndexOfExtraElement {

    static int findIndex(int[] array1, int[] array2) {
        int sum1 = 0, sum2 = 0;
        int i = 0;

        for ( i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }
        for ( i = 0; i < array2.length; i++) {
            sum2 += array2[i];
        }
        int missingElement = sum1 - sum2;

        for ( i = 0; i < array1.length; i++) {
            if (array1[i] == missingElement) {
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{2, 4, 6, 8, 9, 10, 12};
        int[] array2 = new int[]{2, 4, 6, 8, 10, 12};
        int result = findIndex(array1, array2);
        System.out.println(result);

    }
}
