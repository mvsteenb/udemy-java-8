package be.flexlineitsolutions.udemy.java8.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

	public static long checkPerformanceResults(Supplier<Integer> supplier, int numberOfTimes) {
		long startTime = System.currentTimeMillis();
		for (int i=0; i < numberOfTimes; i++) {
			supplier.get();
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

	public static int sumSequentialStream() {
		return IntStream.rangeClosed(1, 1000000).sum();
	}

	public static int sumParallelStream() {
		return IntStream.rangeClosed(1, 1000000)
				.parallel()                          // split the data into multiple parts
				.sum();
	}

	public static void main(String[] args) {

		System.out.println("Available processors: " + Runtime.getRuntime().availableProcessors());

		System.out.println("Sequential stream result: " + checkPerformanceResults(ParallelStreamExample::sumSequentialStream, 20));
		System.out.println("Parallel stream result: " + checkPerformanceResults(ParallelStreamExample::sumParallelStream, 20));
	}

}
