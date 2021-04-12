package MaxCommonCharacterCount;

import java.util.HashMap;

public class Main {

    static int findCommonCharacter(String s1, String s2) {
        int totalCount = 0;
        int s1Length = s1.length();
        int s2Length = s2.length();

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s1Length; i++) {
            if (!map.containsKey(s1.charAt(i))) {
                map.put(s1.charAt(i), 1);
            } else {
                int tempCount = map.get(s1.charAt(i));
                map.put(s1.charAt(i), ++tempCount);
            }
        }

        for (int i = 0; i < s2Length; i++) {
            if (!map2.containsKey(s2.charAt(i))) {
                map2.put(s2.charAt(i), 1);
            } else {
                int tempCount = map2.get(s2.charAt(i));
                map2.put(s2.charAt(i), ++tempCount);
            }
        }

        
        for (var it : map.entrySet()) {
            Character keys = it.getKey();
            int map1Value = it.getValue();
            if (map2.containsKey(keys)) {
                int map2Value = map2.get(keys);
                if (map1Value < map2Value) {
                    totalCount += map1Value;
                } else {
                    totalCount += map2Value;
                }
            }
        }
        return totalCount;
    }


    public static void main(String[] args) {
        int result = findCommonCharacter("aabcc", "dacaa");
        System.out.println(result);
    }
}
