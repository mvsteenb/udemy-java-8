package be.flexlineitsolutions.udemy.java8.parallelstream;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ParallelStreamBoxedExample {

	public static int sequentialSum(List<Integer> integerList) {

		long startTime = System.currentTimeMillis();
		int sum = integerList
				.stream()
				.reduce(0, (x,y) -> x+y);
		long endTime = System.currentTimeMillis();
		System.out.println("Duration in sequential stream : " + (endTime-startTime));

		return sum;
	}

	public static int parallelSum(List<Integer> integerList) {

		long startTime = System.currentTimeMillis();
		int sum = integerList
				.parallelStream()                    // SLOWER THAN sequential stream !!!! -- always check which performs better !
				.reduce(0, (x,y) -> x+y);    // effort to perform the unboxing from Integer to int !!!

		long endTime = System.currentTimeMillis();
		System.out.println("Duration in parallel stream : " + (endTime-startTime));

		return sum;
	}

	public static void main(String[] args) {

		List<Integer> integerList = IntStream.rangeClosed(1, 10000)
				.boxed()
				.collect(toList());

		sequentialSum(integerList);
		parallelSum(integerList);

	}

}
