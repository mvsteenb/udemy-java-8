package be.flexlineitsolutions.udemy.java8.parallelstream;

import java.util.stream.IntStream;

public class SumClient {

	public static void main(String[] args) {
		Sum sum = new Sum();
		IntStream.rangeClosed(1, 1000)
				.parallel()
				.forEach(sum::performSum);
		System.out.println(sum.getTotal()); // ----> DIFFERENT RESULT !!!!!
	}

}
