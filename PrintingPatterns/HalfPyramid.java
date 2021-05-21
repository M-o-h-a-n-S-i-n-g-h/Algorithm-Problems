package PrintingPatterns;

public class HalfPyramid {

    static void printHalfPyramid() {
        for(int i = 1; i <= 5; i++ ) {
            for(int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }

    static void inverted() {
        for(int i = 5; i >= 0; i--) {
            for(int j = i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        printHalfPyramid();
        inverted();
    }
}

//*
//* *
//* * *
//* * * *
//* * * * *