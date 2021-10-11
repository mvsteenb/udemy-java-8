package be.flexlineitsolutions.udemy.java8.functionalinterfaces;

import be.flexlineitsolutions.udemy.java8.data.Student;
import be.flexlineitsolutions.udemy.java8.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));

        Supplier<List<Student>> listSupplier = () -> StudentDatabase.getAllStudents();

        System.out.println("Student is: " + studentSupplier.get());
        System.out.println("Students are: " + listSupplier.get());
    }

}
