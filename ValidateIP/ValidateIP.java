package ValidateIP;

import java.util.HashSet;
import java.util.Set;

public class ValidateIP {

    static boolean validateIP(String s){
        Set<String> allnums;
        allnums = new HashSet<>();
        for (int i = 0; i < 256; i++) {
            allnums.add(String.valueOf(i));
        }

        int dots = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') dots++;
        }

        if (dots != 3) return false;
        String[] nums = s.split("\\.");
        if (nums.length != 4) return false;

        for (String x : nums) {
            if (!allnums.contains(x)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String string = "a";
        System.out.println(validateIP(string));
    }
}
