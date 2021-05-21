package Strings;

public class RemoveChar {
    static void removeChars(String string1, String string2) {
        int length1 = string1.length();
        int length2 = string2.length();
        int[] charCount = new int[256];
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < length2; i++) {
            int character = string2.charAt(i);
            charCount[character]++;
        }

        for (int i = 0; i < length1; i++) {
            char character = string1.charAt(i);
            if (charCount[character] == 0) {
                newString.append(character);
            }
        }
        System.out.println(newString.toString());
    }


    public static void main(String[] args) {
        String s1 = "computer";
        String s2 = "cat";
        removeChars(s1, s2);
    }
}
