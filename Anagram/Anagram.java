package Anagram;
import java.util.*;

public class Anagram {

    static void findAnagram() {
        String s1 = "geeksforgeeks";
        String s2 = "mohan";
        HashMap<Character, Integer> set = new HashMap<>();
        HashMap<Character, Integer> set1 = new HashMap<>();
        for(int i = 0; i < s1.length(); i++) {
            if(!set.containsKey(s1.charAt(i))) {
                set.put(s1.charAt(i), 1);
            }else {
                set.put(s1.charAt(i), set.get(s1.charAt(i)) + 1);
            }
        }
        for(int i = 0; i < s2.length(); i++) {
            if(!set1.containsKey(s2.charAt(i))) {
                set1.put(s2.charAt(i), 1);
            }else {
                set1.put(s2.charAt(i), set1.get(s2.charAt(i)) + 1);
            }
        }
        System.out.println(set);
        System.out.println(set1);
    }

    public static void main(String[] args) {
        findAnagram();
    }
}
