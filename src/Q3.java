// Q3. Separate students whose names start with 'A' using List, Lambda & Stream API

import java.util.*;

public class Q3 {
    public static void main(String[] args) {

        // List of student names
        List<String> students = Arrays.asList(
                "Ava", "Luna", "Aria", "Kai", "Atlas",
                "Ezra", "Aurora", "Ivy", "Asher", "Rowan"
        );

        // Filtering names starting with 'A'
        List<String> aStudents = students.stream()
                .filter(name -> name.startsWith("A")) // condition
                .toList();

        // Printing result
        System.out.println("Students with names starting with A:");
        System.out.println(aStudents);
    }
}