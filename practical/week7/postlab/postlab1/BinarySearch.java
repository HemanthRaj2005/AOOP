package generic;

import java.util.Arrays;  

public class BinarySearch<T extends Comparable<T>> {  
    public int search(T[] arr, T target) {  
        return binarySearch(arr, target, 0, arr.length - 1);  
    }  

    private int binarySearch(T[] arr, T target, int left, int right) {  
        if (left > right) {  
            return -1; 
        }  

        int mid = left + (right - left) / 2;  
        int comparison = target.compareTo(arr[mid]);  

        if (comparison == 0) {  
            return mid; // target found  
        } else if (comparison < 0) {  
            return binarySearch(arr, target, left, mid - 1); 
        } else {  
            return binarySearch(arr, target, mid + 1, right);  
        }  
    }  
}