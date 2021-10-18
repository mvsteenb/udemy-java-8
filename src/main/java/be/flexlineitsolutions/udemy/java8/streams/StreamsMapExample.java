package be.flexlineitsolutions.udemy.java8.streams;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> namesList() {
        return StudentDatabase.getAllStudents().parallelStream()
            .map(Student::getName)
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());
    }

    public static Set<String> namesSet() {
        return StudentDatabase.getAllStudents().stream()
            .map(Student::getName)
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }

}
