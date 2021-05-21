package Strings;

public class MaxCharsBetwnSameChar {

    static int maxChar(String str) {
        int maxLength = -1;
        int tempCount = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char alphabet = str.charAt(i);
            int index = str.indexOf(alphabet);
            int lastIndex = str.lastIndexOf(alphabet);
            if (index != lastIndex) {
                tempCount = str.substring(index + 1, lastIndex).length();
                if (tempCount > maxLength) {
                    maxLength = tempCount;
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String string = "socks";
        int res = maxChar(string);
        System.out.println(res);
    }
}
