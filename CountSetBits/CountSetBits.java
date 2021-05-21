package CountSetBits;

public class CountSetBits {

    public static void main(String[] args) {
        int number = 5; // 101
        int count = 0;
        while (number > 0) {
            if ((number & 1) == 1) {
                count++;
            }
            number = number >> 1;
        }
        System.out.println(count);
    }
}
