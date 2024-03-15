package HomeWork38;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HomeWork38 {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);  // Output: C1 C2


        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> output = input.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        List<String> inputString = Arrays.asList("apple", "banana", "cherry");
        List<Integer> outputString = inputString.stream().map(String::length).collect(Collectors.toList());

        List<Integer> inputInteger = Arrays.asList(1, 2, 3, 4, 5);
        long count = inputInteger.stream().filter(i -> i % 2 == 0).count();

    }
}
