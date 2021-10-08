package be.flexlineitsolutions.udemy.java8.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {

		// prior to java 8

		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		System.out.println("Result of comparator: " + comparator.compare(3, 2));

		// using lambda's

		Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
		System.out.println("Result of comparator using lambda's : " + comparatorLambda.compare(3, 2));

		// or:

		Comparator<Integer> comparatorLambda2 = (a, b) -> a.compareTo(b);
		System.out.println("Result of comparator using lambda's : " + comparatorLambda.compare(3, 2));
	}

}
