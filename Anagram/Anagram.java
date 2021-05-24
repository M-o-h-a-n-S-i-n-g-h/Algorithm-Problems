package Anagram;

public class Anagram {

    static String findAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return "Not an anagram";
        }
        int c = 0;
        int d = 0;

        for(int i = 0; i < s1.length(); i++) {
            c += +s1.charAt(i);
            d += +s2.charAt(i);
        }

        if(c != d) {
            return "Not an anagram";
        }

        return "Anagram";
    }


    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";
        String result = findAnagram(s1.toLowerCase(), s2.toLowerCase());
        System.out.println(result);
    }
}
