package week7inlab;
interface MinMax<T extends Comparable<T>> {
    T min(T[] array);
    T max(T[] array);
}
class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {

    @Override
    public T min(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T min = array[0]; 
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    @Override
    public T max(T[] array) {
        if (array == null || array.length == 0) {
            return null; 
        }

        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {3, 5, 7, 2, 8, 6};
        MinMaxImpl<Integer> intMinMax = new MinMaxImpl<>();
        System.out.println("Integer Array Min: " + intMinMax.min(intArray));
        System.out.println("Integer Array Max: " + intMinMax.max(intArray));

        String[] strArray = {"apple", "orange", "banana", "pear"};
        MinMaxImpl<String> strMinMax = new MinMaxImpl<>();
        System.out.println("String Array Min: " + strMinMax.min(strArray));
        System.out.println("String Array Max: " + strMinMax.max(strArray));

        Character[] charArray = {'a', 'z', 'e', 'k', 'm'};
        MinMaxImpl<Character> charMinMax = new MinMaxImpl<>();
        System.out.println("Character Array Min: " + charMinMax.min(charArray));
        System.out.println("Character Array Max: " + charMinMax.max(charArray));

        Float[] floatArray = {3.5f, 1.2f, 7.8f, 0.4f};
        MinMaxImpl<Float> floatMinMax = new MinMaxImpl<>();
        System.out.println("Float Array Min: " + floatMinMax.min(floatArray));
        System.out.println("Float Array Max: " + floatMinMax.max(floatArray));
    
    }}