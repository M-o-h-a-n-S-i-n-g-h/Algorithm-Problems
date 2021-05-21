package Strings;

public class RunEncodingLength {

    static String runEncodingLength(String str) {
        int n = str.length();
        int count = 1;
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count = count + 1;
            } else {
                encoded.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        encoded.append(str.charAt(n - 1)).append(count);
        return encoded.toString();
    }

    public static void main(String[] args) {
        String string = "aaaabbbccc";
        String res = runEncodingLength(string);
        System.out.println(res);
    }
}
