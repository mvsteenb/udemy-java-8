package be.flexlineitsolutions.udemy.java8.streams;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities() {
        return StudentDatabase.getAllStudents().stream()   // stream <Student>
            .map(Student::getActivities)                   // stream <List<String>>
            .flatMap(List::stream)                         // stream <String>
            .collect(Collectors.toList());
    }

    public static List<String> printUniqueStudentActivities() {
        return StudentDatabase.getAllStudents().stream()   // stream <Student>
            .map(Student::getActivities)                   // stream <List<String>>
            .flatMap(List::stream)                         // stream <String>
            .distinct()
            .collect(Collectors.toList());
    }

    public static Long printUniqueStudentActivityCount() {
        return StudentDatabase.getAllStudents().stream()
            .map(Student::getActivities)
            .flatMap(List::stream)
            .distinct()
            .count();
    }

    public static List<String> printSortedUniqueStudentActivities() {
        return StudentDatabase.getAllStudents().stream()
            .map(Student::getActivities)
            .flatMap(List::stream)
            .sorted()
            .collect(Collectors.toList());
    }

    public static List<String> printSortedReversedUniqueStudentActivities() {
        return StudentDatabase.getAllStudents().stream()
            .map(Student::getActivities)
            .flatMap(List::stream)
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(printUniqueStudentActivities());
        System.out.println(printUniqueStudentActivityCount());
        System.out.println(printSortedUniqueStudentActivities());
        System.out.println(printSortedReversedUniqueStudentActivities());
    }

}
