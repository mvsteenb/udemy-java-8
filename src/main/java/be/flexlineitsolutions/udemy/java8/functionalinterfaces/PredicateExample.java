package be.flexlineitsolutions.udemy.java8.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> isEvenNumber = (i) -> i%2 == 0;
	static Predicate<Integer> isDivisibleBy5 = (i) -> i%5 == 0;

	public static void predicateAnd() {
		System.out.println("Predicate And result is: " + isEvenNumber.and(isDivisibleBy5).test(10));  // predicate chaining
		System.out.println("Predicate And result is: " + isEvenNumber.and(isDivisibleBy5).test(8));  // predicate chaining
	}

	public static void predicateOr() {
		System.out.println("Predicate Or result is: " + isEvenNumber.or(isDivisibleBy5).test(10));  // predicate chaining
		System.out.println("Predicate Or result is: " + isEvenNumber.or(isDivisibleBy5).test(8));  // predicate chaining
	}

	public static void predicateNegate() {
		System.out.println("Predicate Negate result is: " + isEvenNumber.or(isDivisibleBy5).negate().test(8));  // predicate chaining
	}

	public static void main(String[] args) {
		System.out.println(isEvenNumber.test(4));

		predicateAnd();
		predicateOr();
		predicateNegate();
	}

}
