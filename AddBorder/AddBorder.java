package AddBorder;
import java.util.Arrays;

public class AddBorder {

    static String[] addBorder(String[] array) {
        String[] resultArray = new String[array.length + 2];
        int arrayLength = resultArray.length;
        String star = "*";
        int starLength = array[0].length() + 2;
        String stars = star.repeat(starLength);
        resultArray[0] = stars;
        resultArray[arrayLength - 1] = stars;
        for (int i = 1; i < resultArray.length - 1; i++) {
            resultArray[i] = "*" + array[i - 1] + "*";
        }
        return resultArray;
    }

    public static <T> void main(String[] args) {
        String[] array = new String[]{"aa", "**", "zz"};
        String[] result = addBorder(array);
        System.out.println(Arrays.toString(result));
    }
}
