package LeaderInArray;
import java.util.*;

//Use tow pointers dont forget

public class LeaderInArray {
    static ArrayList<Integer> leaderInArray(int[] arr) {
        ArrayList<Integer> lead = new ArrayList<Integer>();
        int max = arr[6 - 1];
        lead.add(max);
        for (int i = 6 - 2; i >= 0; i--) {
            if (max <= arr[i]) {
                max = arr[i];
                lead.add(arr[i]);
            }
        }
        lead.sort(Collections.reverseOrder());
        return lead;
    }

    public static void main(String[] args) {
        int[] array = new int[]{16,17,4,3,5,2};
        ArrayList<Integer> list = leaderInArray(array);
        System.out.println(list);
    }
}
