package be.flexlineitsolutions.udemy.java8.functionalinterfaces;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (studentList, studentPredicate) -> {
      Map<String, Double> studentGradeMap = new HashMap<>();
      studentList.forEach(student -> {
          if (studentPredicate.test(student)) {
              studentGradeMap.put(student.getName(), student.getGpa());
          }
      });
      return studentGradeMap;
    };

    public static void main(String[] args) {
        System.out.println(
            biFunction.apply(
                StudentDatabase.getAllStudents(),
                (s) -> s.getGpa() >= 3.9
            )
        );
    }

}
