package Strings;

public class Specialarrayreversal {

    static String specialReversal(String str) {
        char[] characters = str.toCharArray();
        int n = str.length();
        int i = 0;
        int j = n - 1;

        while(i < j) {
            char currentCharacter = characters[i];
            char nextCharacter = characters[j];

            if(!Character.isAlphabetic(currentCharacter)){
                i++;
            }else if(!Character.isAlphabetic(nextCharacter)) {
                j--;
            }else {
                char temp = characters[i];
                characters[i] = characters[j];
                characters[j] = temp;
                i++;
                j--;
            }
        }
        return new String(characters);
    }

    public static void main(String[] args) {
        String string = "A&x#";
        String res = specialReversal(string);
        System.out.println(res);
    }
}
