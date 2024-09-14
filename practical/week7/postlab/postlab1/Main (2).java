package generic;

public class Main {  
    public static void main(String[] args) {  
    
        Integer[] integers = {1, 3, 5, 7, 9};  
        BinarySearch<Integer> integerSearch = new BinarySearch<>();  
        System.out.println("Integer search: " + integerSearch.search(integers, 1)); 

    
        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};  
        BinarySearch<Double> doubleSearch = new BinarySearch<>();  
        System.out.println("Double search: " + doubleSearch.search(doubles, 2.2));

        
        String[] strings = {"apple", "banana", "cherry", "date", "elderberry"};  
        BinarySearch<String> stringSearch = new BinarySearch<>();  
        System.out.println("String search: " + stringSearch.search(strings, "date")); 
    }  
}