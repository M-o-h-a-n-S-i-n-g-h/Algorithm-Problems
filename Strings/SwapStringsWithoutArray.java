package Strings;

public class SwapStringsWithoutArray {

    static String swapStrings(String str) {
        str += " ";
        String ans = " ";
        String space = " ";
        String temp = " ";
        String temp1 = " ";
        int spaceCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 32) {
                temp += str.charAt(i);
            } else {
                spaceCount++;
                if (spaceCount % 2 == 0) {
                    ans += temp + temp1;
                } else {
                    temp1 = temp;
                }
                temp = space;
            }
        }
        if(spaceCount % 2 == 1) {
            ans += temp1;
        }
        return ans;
    }


    public static void main(String[] args) {
        String input = "one two three four";
        String result = swapStrings(input);
        System.out.println(result);
    }
}
