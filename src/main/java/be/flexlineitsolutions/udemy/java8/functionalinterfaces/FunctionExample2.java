package be.flexlineitsolutions.udemy.java8.functionalinterfaces;

public class FunctionExample2 {

    public static String performConcat(String str) {
        return FunctionExample.addSomeString.apply(str);
    }

    public static void main(String[] args) {
        String res = performConcat("Hello");
        System.out.println(res);
    }

}
