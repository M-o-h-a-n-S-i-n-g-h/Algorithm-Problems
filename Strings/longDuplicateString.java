package Strings;

// TODO: Not done
public class longDuplicateString {

    static int longDupString(String str) {
        if(str.equals("")) return  0;
        if(str.length() == 1) return 1;
        int maxSum = 1;
        int sum = 0;
        for(int i = 0; i < str.length() - 1; i++) {
            if(i == str.length() - 1) {
                maxSum += 1;
                break;
            }
            if(str.charAt(i) == str.charAt(i + 1)) {
                sum += 1;
            }else {
                maxSum = Math.max(sum, maxSum);
                sum = 1;
            }
        }
        return maxSum;
    }


    public static void main(String[] args) {
        String str = "aa";
        int result = longDupString(str);
        System.out.println(result);
    }
}
