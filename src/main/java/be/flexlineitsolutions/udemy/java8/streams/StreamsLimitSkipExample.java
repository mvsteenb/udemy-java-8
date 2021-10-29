package be.flexlineitsolutions.udemy.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

	public static Optional<Integer> limit(List<Integer> integers) {
		return integers.stream()
				.limit(3)
				.reduce((x,y) -> x+y);
	}

	public static Optional<Integer> skip(List<Integer> integers) {
		return integers.stream()
				.skip(3)
				.reduce((x,y) -> x+y);
	}

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(6, 7, 8, 9, 10);

		Optional<Integer> limit = limit(integers);

		if (limit.isPresent()) {
			System.out.println("Result : " + limit.get());
		}
		else {
			System.out.println("No input is passed !");
		}

		Optional<Integer> skip = skip(integers);

		if (skip.isPresent()) {
			System.out.println("Result : " + skip.get());
		}
		else {
			System.out.println("No input is passed !");
		}
	}

}
