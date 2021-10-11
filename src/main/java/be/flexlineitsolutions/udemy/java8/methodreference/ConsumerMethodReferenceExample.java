package be.flexlineitsolutions.udemy.java8.methodreference;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> c1 = System.out::println;
    static Consumer<Student> c2 = Student::printListOfActivities;

    public static void main(String[] args) {
        StudentDatabase.getAllStudents().forEach(c1);

        StudentDatabase.getAllStudents().forEach(c2);
    }

}
