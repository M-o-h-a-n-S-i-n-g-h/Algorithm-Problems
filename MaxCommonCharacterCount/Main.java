package MaxCommonCharacterCount;

import java.util.HashMap;

public class Main {

    static int findCommonCharacter() {
        int totalCount = 0;
        int s1Length = "aabcc".length();
        int s2Length = "dacaa".length();

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        mapIt("aabcc", s1Length, map);

        mapIt("dacaa", s2Length, map2);


        for (var it : map.entrySet()) {
            Character keys = it.getKey();
            int map1Value = it.getValue();
            int map2Value = map2.get(keys);
            if (map2.containsKey(keys)) {
                totalCount += Math.min(map1Value, map2Value);
            }
        }
        return totalCount;
    }

    private static void mapIt(String s2, int s2Length, HashMap<Character, Integer> map2) {
        for (int i = 0; i < s2Length; i++) {
            if (!map2.containsKey(s2.charAt(i))) {
                map2.put(s2.charAt(i), 1);
            } else {
                int tempCount = map2.get(s2.charAt(i));
                map2.put(s2.charAt(i), ++tempCount);
            }
        }
    }


    public static void main(String[] args) {
        int result = findCommonCharacter();
        System.out.println(result);
    }
}
