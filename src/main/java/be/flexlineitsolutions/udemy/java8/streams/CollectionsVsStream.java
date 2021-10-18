package be.flexlineitsolutions.udemy.java8.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStream {

    public static void main(String[] args) {

        //
        // collections

        ArrayList<String> names = new ArrayList<>();
        names.add("Mario");
        names.add("Monica");
        names.add("Phoebe");

        names.remove(0);
        System.out.println(names);

        //
        // streams

        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
        nameStream.forEach(System.out::println);    // will throw an exception -- you can only travel the stream once !!

    }

}
