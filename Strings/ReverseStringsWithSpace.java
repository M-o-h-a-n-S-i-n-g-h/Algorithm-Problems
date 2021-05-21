package Strings;

import java.util.Arrays;

public class ReverseStringsWithSpace {

    static void reverse(String string) {
        int n = string.length();
        int i = 0;
        char[] strArray = string.toCharArray();
        int j = n - 1 - i;
        while (i < n && j > i) {
            if (strArray[i] == ' ') {
                i++;
            } else if (strArray[j] == ' ') {
                j = j - 1;
            } else {
                char temp = strArray[i];
                strArray[i] = strArray[j];
                strArray[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(new String(strArray));
    }

    public static void main(String[] args) {
        String string = "Help others";
        reverse(string);
    }
}
