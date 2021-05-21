package PrintingPatterns;

public class HalfPyramidOfAlphabets {

    static void printAlpha() {
        int characterNumber = 65;
        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                int character = 65 + j;
                System.out.print((char) character + " ");
            }
//            characterNumber += 1;
            System.out.println();
        }
    }

    static void alphaWithSpace() {
        int n = 5;
        for (int rows = 1; rows <= n; rows++) {
            for (int spaces = 1; spaces <= rows; spaces++) {
                System.out.print(" ");
            }
            for (int characterCount = 0; characterCount <= n - rows; characterCount++) {
                int character = 65 + characterCount;
                System.out.print((char) character);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        alphaWithSpace();
    }
}
