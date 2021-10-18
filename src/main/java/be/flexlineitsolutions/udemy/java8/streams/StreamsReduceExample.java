package be.flexlineitsolutions.udemy.java8.streams;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static int performMultiplication(List<Integer> integerList) {
        return integerList.stream()
            // a=1, b=1 (from stream) => result 1 is returned
            // a=1, b=3 (from stream) => result 3 is returned
            // a=3, b=5 (from stream) => result 15 is returned
            // a=15, b=7 (from stream) => result 105 is returned
            .reduce(1, (a,b) -> a*b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a,b) -> a*b);
    }

    public static Optional<Student> getHighestGPAStudent() {
        return StudentDatabase.getAllStudents().stream()
                .reduce((s1, s2) -> {
                    if (s1.getGpa() > s2.getGpa()) {
                        return s1;
                    }
                    else {
                        return s2;
                    }
                });
    }

    public static Optional<Student> getHighestGPAStudentCleaner() {
        return StudentDatabase.getAllStudents().stream()
                .reduce((s1, s2) -> s1.getGpa()> s2.getGpa() ? s1 : s2);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 7);

        System.out.println(performMultiplication(integers));

        Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
        if (result.isPresent()) {
            System.out.println(result.get());
        }

        Optional<Student> studentOptional = getHighestGPAStudent();
        if (studentOptional.isPresent()) {
            System.out.println(studentOptional.get());
        }

    }

}
