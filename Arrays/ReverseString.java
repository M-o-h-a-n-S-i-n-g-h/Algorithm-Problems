package Arrays;

public class ReverseString {

    static String reverseString (String s) {
        String reversed = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        String s = "Geeks";
        String result = reverseString(s);
        System.out.println(result);
    }
}
