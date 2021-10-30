package be.flexlineitsolutions.udemy.java8.parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamExample {

	public static int sum_sequential_Stream() {
		return IntStream.rangeClosed(1, 10000).sum();
	}

	public static int sum_parallel_Stream() {
		return IntStream.rangeClosed(1, 10000).parallel().sum();
	}

	public static void main(String[] args) {
		System.out.println(sum_sequential_Stream());
		System.out.println(sum_parallel_Stream());
	}

}
