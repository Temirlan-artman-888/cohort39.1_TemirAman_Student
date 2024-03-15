package HomeWork26;

import java.util.Arrays;

public class HomeWork26<T> {

    private T value;

    public HomeWork26(T value) {
        this.value = value;
    }

    public static <T> void swap(T[] array, int indexOne, int indexTwo) {
        if (indexOne >= 0 && indexOne < array.length && indexTwo >= 0 && indexTwo < array.length) {
            T temp = array[indexOne];
            array[indexOne] = array[indexTwo];
            array[indexTwo] = temp;
        } else {
            System.out.println("Variables are wrong");
        }
    }

    public static void main(String[] args) {
        Integer[] integersArray = {10,20,30,40,50};
        System.out.println("Current variables are " + Arrays.toString(integersArray));

        swap(integersArray,0,3);
        System.out.println("Variables after swap method " + Arrays.toString(integersArray));

        String[] stringArrays = {"ten","twenty","thirty","forty","fifty"};
        System.out.println("Current string variables are " + Arrays.toString(stringArrays));

        swap(stringArrays,1,3);
        System.out.println("Variables are " + Arrays.toString(stringArrays));


    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
