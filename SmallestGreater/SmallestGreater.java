package SmallestGreater;
import java.util.Arrays;

public class SmallestGreater {


    //TODO:Complete it
    static void findSmallestGreater(int[] array) {
        int[] arrayCopy = new int[array.length];
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = new int[]{6, 3, 9, 8, 10, 2, 1, 15, 7};
        findSmallestGreater(array);
    }
}

// https://practice.geeksforgeeks.org/problems/smallest-greater-elements-in-whole-array2751/0/?category[]=Arrays&category[]=Arrays&company[]=Zoho&company[]=Zoho&difficulty[]=0&page=1&query=category[]Arrayscompany[]Zohodifficulty[]0page1company[]Zohocategory[]Arrays