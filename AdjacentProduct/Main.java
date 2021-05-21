package AdjacentProduct;

public class Main {
    static int findProduct(int[] array) {
        int greaterProduct = -1000;
        int prevProduct = 0;
        for (int i = 0; i < array.length - 1; i++) {
            prevProduct = array[i] * array[i + 1];
            if (prevProduct > greaterProduct) greaterProduct = prevProduct;
        }
        return greaterProduct;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, -2, -5, 7, 3};
        int result = findProduct(arr);
        System.out.println(result);
    }
}
