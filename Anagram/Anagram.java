package Anagram;

public class Anagram {

    static String findAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return "Not an anagram";
        }

        int[] tracker = new int[26];
        for (char i : s1.toCharArray()) {
            tracker[i - 'a']++;
        }

        for (char i : s2.toCharArray()) {
            tracker[i - 'a']++;
        }

        for (int i : tracker) {
            if ((i & 1) == 1) {
                return "Not an anagram";
            }
        }

        return "Anagram";
    }


    public static void main(String[] args) {
        String s1 = "care";
        String s2 = "race";
        String result = findAnagram(s1.toLowerCase(), s2.toLowerCase());
        System.out.println(result);
    }
}
