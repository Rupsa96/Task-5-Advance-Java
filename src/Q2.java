// Q2. Write a program to check whether the Strings in the List are empty or not
// and print the list having non-empty strings.
// Given List: ["abc", "", "bc", "efg", "abcd", "", "jkl"]

import java.util.*;

public class Q2 {
    public static void main(String[] args) {

        // Creating list with empty strings
        List<String> listStrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Filtering non-empty strings
        List<String> nonEmptyList = listStrings.stream()
                .filter(str -> !str.isEmpty()) // keep only non-empty strings
                .toList(); // convert stream to list

        // Printing result
        System.out.println(nonEmptyList);
    }
}