package be.flexlineitsolutions.udemy.java8.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

	public static int sumOfNumbers(List<Integer> integerList) {
		return integerList.stream()
				.reduce(0, (x, y) -> x+y);   // unboxing to convert Integer to int !!!
	}

	public static int sumOfIntNumbers() {
		return IntStream.rangeClosed(1, 6)   // 1, 2, 3, 4, 5, 6
				.sum();
	}

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println("sum of numbers: " + sumOfNumbers(integerList));
		System.out.println("sum of N numbers using IntStream: " + sumOfIntNumbers());

	}

}
