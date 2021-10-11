package be.flexlineitsolutions.udemy.java8.functionalinterfaces;

import java.util.Locale;
import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase(Locale.ROOT);
    static Function<String, String> addSomeString = (name) -> name.concat("default");

    public static void main(String[] args) {
        System.out.println("Result is: " + function.apply("java 8"));

        System.out.println("Result of andthen is: " + function.andThen(addSomeString).apply("java 8")); // first function, then addSomeString

        System.out.println("Result of andthen is: " + function.compose(addSomeString).apply("java 8")); // first addSomeString, then function
    }

}
