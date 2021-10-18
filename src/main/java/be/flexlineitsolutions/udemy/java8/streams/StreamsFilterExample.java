package be.flexlineitsolutions.udemy.java8.streams;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static List<Student> filterStudents() {
        return StudentDatabase.getAllStudents().stream()
                .filter(s -> s.getGender().equals("female"))
                .filter(s -> s.getGpa() >= 3.9)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);
    }

}
