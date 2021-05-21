package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grading {
    static List<Integer> grading(List<Integer> grades){
        for(int i = 0; i < grades.size(); i++) {
            int number = grades.get(i);
            if(number >= 38){
                int nextMultiple = (int)Math.ceil((double)number / 5) * 5;
                if(nextMultiple - number < 3){
                    grades.set(i, nextMultiple);
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>(Arrays.asList(73, 67 ,38, 33));
        System.out.println(grading(grades));
    }
}
