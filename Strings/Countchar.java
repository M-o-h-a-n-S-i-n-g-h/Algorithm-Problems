package Strings;

public class Countchar {
    static int getCount (String S, int N)
    {
        // your code here
        int[] hm = new int[26];
        int count =0;
        for(int i=0;i<S.length();i++)
        {
            if(i!=0 && (S.charAt(i) == S.charAt(i-1))) continue;
            int c = S.charAt(i)-97;
            hm[c]++;
        }

        for(int a : hm)
        {
            if(a==N)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int result = getCount("dfewlnldef", 2);
        System.out.println(result);
    }
}
