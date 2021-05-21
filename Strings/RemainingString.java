package Strings;

public class RemainingString {
    static String printString(String S, char ch, int count) {
        int times = 0;
        int i;
        String str =  "Empty string";
        if(count == 0) return S;
        for ( i = 0; i < S.length(); i++) {
            if (S.charAt(i) == ch){
                times++;
            }
            if (times == count) break;
        }
        if(times < count) return str;
        if(i < S.length() - 1) return S.substring(i + 1);
        return str;
    }

    public static void main(String[] args) {
        String res = printString("LVoYVoLVV",'V', 2);
        System.out.println(res);
    }
}
