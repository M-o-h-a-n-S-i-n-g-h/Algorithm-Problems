// https://practice.geeksforgeeks.org/problems/unsorted-array4925/0/?category[]=Arrays&category[]=Arrays&company[]=Zoho&company[]=Zoho&difficulty[]=0&page=1&query=category[]Arrayscompany[]Zohodifficulty[]0page1company[]Zohocategory[]Arrays


package FindElement;

public class FindElement {

    static void findElement(int[] array) {
        int i = 1;
        while (i < array.length - 1) {
            if (array[i] > array[i - 1]) {
                if(array[i] < array[i + 1])
                    System.out.println(i);
                    i++;
            } else {
                System.out.println("No");
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 5, 7};
        findElement(array);
    }
}
