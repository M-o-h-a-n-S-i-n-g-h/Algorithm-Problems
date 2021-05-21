package Strings;

public class Palindrome {

    static boolean checkPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while( i < j) {
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String string = "malayalam";
        boolean res = checkPalindrome(string);
        System.out.println(res);
    }
}
