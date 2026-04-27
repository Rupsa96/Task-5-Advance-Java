// Q1. Write a program using map() method to convert a list of Strings into uppercase.
// Given List: Stream.of("aBc", "d", "ef");

import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {
    public static void main(String[] args) {

        // Creating a stream of strings
        Stream<String> names = Stream.of("aBc", "d", "ef");

        // Using map() to convert each string to uppercase
        List<String> upperList = names
                .map(str -> str.toUpperCase()) // lambda converts each string
                .collect(Collectors.toList()); // convert stream to list

        // Printing result
        System.out.println(upperList);
    }
}