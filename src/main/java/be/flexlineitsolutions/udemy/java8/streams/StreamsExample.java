package be.flexlineitsolutions.udemy.java8.streams;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        //
        // student name and their activities in a map

        Map<String, List<String>> studentMap = StudentDatabase.getAllStudents().stream().collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println("All students in map: " + studentMap);

        //
        // student name and their activities in a map, filtered

        System.out.println("---- filtered streams");
        Map<String, List<String>> studentMap2 = StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel() >= 3)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println("Filtered students: " + studentMap2);

        //
        // using predicates

        System.out.println("---- predicates");
        Predicate<Student> studentPredicate = student -> student.getGradeLevel() >= 3;
        Predicate<Student> studentGpaPredicate = student -> student.getGpa() >= 3.9;
        Map<String, List<String>> studentMap3 = StudentDatabase.getAllStudents().stream()
                .filter(studentPredicate)
                .filter(studentGpaPredicate)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println("Filtered students: " + studentMap3);

        //
        // using parallel streams

        System.out.println("---- parallel streams");
        Map<String, List<String>> studentMap4 = StudentDatabase.getAllStudents().parallelStream()
                .filter(studentPredicate)
                .filter(studentGpaPredicate)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println("Filtered students: " + studentMap4);

        //
        // debugging streams (use peek)

        System.out.println("---- peek");
        Map<String, List<String>> studentMap5 = StudentDatabase.getAllStudents().stream()
                .peek(System.out::println)
                .filter(studentPredicate)
                .peek(s -> System.out.println("After 1st filter: " + s))
                .filter(studentGpaPredicate)
                .peek(s -> System.out.println("After 2nd filter: " + s))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println("Filtered students: " + studentMap5);
    }

}
