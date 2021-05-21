package Strings;

import java.util.Arrays;

public class TimeConversion {
    static String timeConversion(String s) {
        int length = s.length();
        String AM = "AM";
        String PM = "PM";
        String colon = ":";
        String ampm = s.substring(length - 2);
        String[] strs = s.split(":");
        strs[2] = strs[2].substring(0, 2);

        int time = Integer.parseInt(strs[0]);
        String newTime;

        if (ampm.equals(AM) && time == 12) {
            newTime = "00";
        } else if (ampm.equals(PM) && time < 12) {
            newTime = String.valueOf(time + 12);
        } else {
            return String.join(colon, strs);
        }

        strs[0] = newTime;
        return String.join(colon, strs);
    }

    public static void main(String[] args) {
        String s = "07:05:45PM";
        System.out.println(timeConversion(s));
    }
}
