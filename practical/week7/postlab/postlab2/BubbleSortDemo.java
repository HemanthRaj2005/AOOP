package BubbleSort;
import java.util.Arrays;  
public class BubbleSortDemo {  
    public static void main(String[] args) {  
       
        Integer[] integers = { 5, 2, 8, 1, 9 };  
        System.out.println("Integers before sorting: " + Arrays.toString(integers));  
        BubbleSort.sort(integers);  
        System.out.println("Integers after sorting: " + Arrays.toString(integers));  

   
        Double[] doubles = { 3.7, 1.2, 4.9, 2.5, 5.1 };  
        System.out.println("\nDoubles before sorting: " + Arrays.toString(doubles));  
        BubbleSort.sort(doubles);  
        System.out.println("Doubles after sorting: " + Arrays.toString(doubles));  

        String[] strings = { "apple", "banana", "cherry", "date", "elderberry" };  
        System.out.println("\nStrings before sorting: " + Arrays.toString(strings));  
        BubbleSort.sort(strings);  
        System.out.println("Strings after sorting: " + Arrays.toString(strings));  
    }  
}