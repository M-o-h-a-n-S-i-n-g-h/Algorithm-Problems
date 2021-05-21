package FirstRepeatingElement;
import java.util.*;

//TODO:DEBUG IT

public class FirstRepeatingElement {

    static int getFirstRepeatingElementArray(int[] array) {
        int minimumIndex = -1;
        HashSet<Integer> set = new HashSet<>();

        for (int i = array.length - 1; i >= 0; i--) {
            if (set.contains(array[i])) {
                minimumIndex = i;
            } else {
                set.add(array[i]);
            }
        }
        return minimumIndex;
    }

    public static void main(String[] args) throws java.lang.Exception {
        int[] array = {1, 2, 3, 4, 3, 6, 2};
        int min = getFirstRepeatingElementArray(array);
        if (min != -1)
            System.out.println("The first repeating element in array is " + array[min]);
        else
            System.out.println("There are no repeating elements");
    }

}
