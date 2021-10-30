package be.flexlineitsolutions.udemy.java8.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

	public static void main(String[] args) {

		int sum = IntStream.rangeClosed(1, 50).sum();
		System.out.println("Sum is : " + sum);

		OptionalInt max = IntStream.rangeClosed(1, 50).max();
		System.out.println("Max is : " + (max.isPresent() ? max.getAsInt() : 0));

		OptionalInt max2 = IntStream.rangeClosed(0, 0).max();
		System.out.println("Max is : " + (max2.isPresent() ? max2.getAsInt() : 0));

		OptionalLong min = LongStream.rangeClosed(1, 50).min();
		System.out.println("Min is : " + (min.isPresent() ? min.getAsLong() : 0));

		OptionalDouble avg = IntStream.rangeClosed(1, 50).average();
		System.out.println("Avg is : " + (avg.isPresent() ? avg.getAsDouble() : 0));
	}

}
