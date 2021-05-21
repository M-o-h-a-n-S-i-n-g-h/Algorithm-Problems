package PrintingPatterns;

public class FullPyramid {

    static void Diamond() {
        int n = 5;
        int starCount = 1;
        int atCount = n*2 - 1;
        for (int rows = 1; rows <= n; rows++) {
            for (int spaces = n; spaces > rows; spaces--) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= starCount; stars++) {
                System.out.print("*");
            }
            for (int spaces = n; spaces > rows; spaces--) {
                System.out.print(" ");
            }
            starCount += 2;
            System.out.println();
        }
        for (int rows = 1; rows <= n; rows++) {
            for (int spaces = 1; spaces < rows; spaces++) {
                System.out.print(" ");
            }
            for (int stars = atCount; stars >= 1; stars--) {
                System.out.print("*");
            }
            for (int spaces = 1; spaces < rows; spaces++) {
                System.out.print(" ");
            }
            atCount -= 2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Diamond();
    }
}
