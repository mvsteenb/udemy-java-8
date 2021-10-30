package be.flexlineitsolutions.udemy.java8.numericstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {

	public static void main(String[] args) {

		System.out.println("Int range count: " + IntStream.range(1, 50).count());
		IntStream.range(1, 50).forEach(value -> System.out.print(value + ", "));
		System.out.println();
		System.out.println("Int range closed count: " + IntStream.rangeClosed(1, 50).count());
		IntStream.rangeClosed(1, 50).forEach(value -> System.out.print(value + ", "));

		System.out.println("");
		System.out.println("----");

		System.out.println("Long range count: " + LongStream.range(1, 50).count());
		LongStream.range(1, 50).forEach(value -> System.out.print(value + ", "));
		System.out.println();
		System.out.println("Long range closed count: " + LongStream.rangeClosed(1, 50).count());
		LongStream.rangeClosed(1, 50).forEach(value -> System.out.print(value + ", "));

		System.out.println("");
		System.out.println("----");
		IntStream.rangeClosed(1,50).asDoubleStream().forEach(value -> System.out.print(value + ", "));
	}

}
