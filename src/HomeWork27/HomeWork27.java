package HomeWork27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class HomeWork27 {

    public static void main(String[] args) throws Exception {
        ArrayList<String> shortArrayString = new ArrayList<>(20);

        shortArrayString.add("short");
        shortArrayString.add("shorter");
        shortArrayString.add("shortest");

//        shortStringView(shortArrayString);
//        removeShortString(10, shortArrayString);
//        shortStringView(shortArrayString);

        ArrayList<Integer> randomNumber = new ArrayList<>();
//        fillRandomArrayNumbers(randomNumber);


    }

    public static void shortStringView(ArrayList<String> shortString) {
        System.out.println("Short strings are ");
        for (String element : shortString) {
            System.out.println(element.toUpperCase());
        }
    }

    public static void removeShortString(int size, ArrayList<String> shortString) throws Exception {
        Iterator<String> shortStringIterator = shortString.iterator();

        while (shortStringIterator.hasNext()) {
            String iteratorString = shortStringIterator.next();
            if (iteratorString.length() == size) {
                shortStringIterator.remove();
            } else if (size <= 0) {
                throw new Exception("Incorrect number of size");
            }
        }


    }

    public static void fillRandomArrayNumbers(ArrayList<Integer> randomArrayNumbers) {
        Random newRandom = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumbers = newRandom.nextInt(10);
            randomArrayNumbers.add(randomNumbers);

        }
        int max = Collections.max(randomArrayNumbers);
        int min = Collections.min(randomArrayNumbers);
        int average = (max + min) / 2;

        for (int element : randomArrayNumbers) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
        System.out.println(" max = " + max);
        System.out.println(" min = " + min);
        System.out.println(" average = " + average);

    }
}
