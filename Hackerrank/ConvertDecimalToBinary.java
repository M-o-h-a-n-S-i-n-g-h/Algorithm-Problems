package Hackerrank;

public class ConvertDecimalToBinary {

    public static void main(String[] args) {
        int dec = 4;
        StringBuilder bin = new StringBuilder();
        int i = 1;
        while (dec != 0) {
            int rem = dec % 2;
            String in = String.valueOf(rem);
            bin.append(in);
            dec /= 2;
        }
        int binary = Integer.parseInt(bin.toString());
        System.out.println(binary);
    }
}
