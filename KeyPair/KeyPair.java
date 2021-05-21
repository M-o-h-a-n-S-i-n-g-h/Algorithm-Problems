package KeyPair;


public class KeyPair {
    static boolean findKeyPair(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length - 1; j++) {
                if (array[i] + array[j + 1] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 45, 6, 10, 8};
        int target = 16;
        boolean result = findKeyPair(array, target);
        System.out.println(result);
    }
}
