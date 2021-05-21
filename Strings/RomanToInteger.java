package Strings;

public class RomanToInteger {

    static int getValue(char letter ) {
        if(letter == 'I') return 1;
        if(letter == 'X') return 10;
        if(letter == 'L') return 50;
        if(letter == 'V') return 5;
        if(letter == 'M') return 1000;
        if(letter == 'C') return 100;
        if(letter == 'D') return 500;
        return 0;
    }

    static int convert(String str) {
        int n = str.length();
        int count = 0;
        for(int i = 0; i < n ; i++) {
                if(i + 1 < n) {
                    char character = str.charAt(i);
                    char nextChar = str.charAt(i + 1);
                    if( getValue(character) >= getValue(nextChar)){
                        count = count + getValue(character);
                    }else {
                        count = count - getValue(character);
                    }
                }else {
                    count = count + getValue(str.charAt(i));
                }
        }
        return count;
    }

    public static void main(String[] args) {
        String string = "CMXVI";
        int res = convert(string);
        System.out.println(res);
    }
}
