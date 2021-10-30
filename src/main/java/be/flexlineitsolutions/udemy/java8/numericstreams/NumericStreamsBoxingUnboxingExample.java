package be.flexlineitsolutions.udemy.java8.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {

	public static List<Integer> boxing() {  // intstream of 10 elements
		return IntStream.rangeClosed(1, 10)
				// int
				.boxed()
				// Integer
				.collect(Collectors.toList());
	}

	public static int unboxing(List<Integer> integers) {
		// wrapper to primitive
		return integers.stream()
				// wrapper Integer Values
				.mapToInt(Integer::intValue)  // intstream (intValue of the wrapper class)
				.sum();
	}

	public static void main(String[] args) {

		System.out.println("Boxing: " + boxing());

		List<Integer> integers = boxing();
		System.out.println("Unboxing: " + unboxing(integers));

	}

}
