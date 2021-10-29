package be.flexlineitsolutions.udemy.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

	public static int findMaxValue(List<Integer> integers) {
		return integers.stream()
				// 6  -> y
				// 7  -> y
				// 8  -> y
				// 9  -> y
				// 10 -> y
				// x variable hold the max value for each element in the iteration
				.reduce(0, (x, y) -> x>y ? x : y);
	}

	public static Optional<Integer> findMinValue(List<Integer> integers) {
		return integers.stream()
				// 6  -> y
				// 7  -> y
				// 8  -> y
				// 9  -> y
				// 10 -> y
				// x variable hold the max value for each element in the iteration
				.reduce((x, y) -> x<y ? x : y);
	}

	public static Optional<Integer> findMaxValueOptional(List<Integer> integers) {
		return integers.stream()
				// 6  -> y
				// 7  -> y
				// 8  -> y
				// 9  -> y
				// 10 -> y
				// x variable hold the max value for each element in the iteration
				.reduce((x, y) -> x>y ? x : y);
	}

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(6, 7, 8, 9, 10);
		System.out.println("max value is : " + findMaxValue(integers));
		System.out.println("max value is : " + findMaxValue(new ArrayList<>()));

		Optional<Integer> maxValueOptional = findMaxValueOptional(integers);
		if (maxValueOptional.isPresent()) {
			System.out.println("max value optional is : " + maxValueOptional.get());
		}
		else {
			System.out.println("No max value found");
		}

		Optional<Integer> maxValueOptional2 = findMaxValueOptional(new ArrayList<>());
		if (maxValueOptional2.isPresent()) {
			System.out.println("max value optional is : " + maxValueOptional2.get());
		}
		else {
			System.out.println("No max value found: " + maxValueOptional2);
		}

		Optional<Integer> minValue = findMinValue(integers);
		if (minValue.isPresent()) {
			System.out.println("min value is : " + minValue.get());
		}
		else {
			System.out.println("No min value found: " + minValue);
		}


	}

}
