package be.flexlineitsolutions.udemy.java8.optional;

import java.util.Optional;

public class OptionalPresentExample {



	public static void main(String[] args) {
		Optional<String> optional = Optional.ofNullable("hello optional");
		System.out.println(optional.isPresent());

		optional.ifPresent(s -> System.out.println(s));
	}

}
