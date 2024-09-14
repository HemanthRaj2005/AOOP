package MaxMin;
import java.util.Arrays;

public class Generic{
 public static void main(String[] args) {
     
     Integer[] intArray = {2, 8, 1, 5, 10};
     MinMaxImpl<Integer> intMinMax = new MinMaxImpl<>();
     System.out.println("Minimum number in the integer array: " + intMinMax.findMin(intArray));
     System.out.println("Maximum number in the integer array: " + intMinMax.findMax(intArray));

   
    String[] strArray = {"apple", "orange", "banana", "pear"};
     MinMaxImpl<String> strMinMax = new MinMaxImpl<>();
      System.out.println("Minimum number in the string array: " + strMinMax.findMin(strArray));
     System.out.println("Maximum  number in the string array: " + strMinMax.findMax(strArray));

     
     Character[] charArray = {'c', 'a', 'e', 'b', 'd'};
     MinMaxImpl<Character> charMinMax = new MinMaxImpl<>();
      System.out.println("Minimum number in the charater array:" + charMinMax.findMin(charArray));
     System.out.println("Maximum number in the charater array:" + charMinMax.findMax(charArray));

    
     Float[] floatArray = {3.4f, 1.2f, 5.6f, 2.1f};
     MinMaxImpl<Float> floatMinMax = new MinMaxImpl<>();
     System.out.println("Minimum number in the float array: " + floatMinMax.findMin(floatArray));
     System.out.println("Maximum  number in the float array: " + floatMinMax.findMax(floatArray));
 }
}

