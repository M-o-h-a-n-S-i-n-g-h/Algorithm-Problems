package PrintingPatterns;

public class HalfPyramidNumbers {

    static void printHalfPyramidNumbers() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("\n");
        }
    }

    static void inverted() {
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void numbers() {
        int n = 9;
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

    static void withSpace() {
        int n = 6;

        for (int rows = 1; rows <= n; rows++) {
            for (int spaces = n; spaces > rows ; spaces--) {
                System.out.print(" ");
            }
            for(int stars = 1; stars <= rows; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        printHalfPyramidNumbers();
//        inverted();
//        numbers();
        withSpace();
    }
}
