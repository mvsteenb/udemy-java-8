package be.flexlineitsolutions.udemy.java8.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

	public static void main(String[] args) {

		//
		// sort list of names in alphabetical order

		List<String> stringList = Arrays.asList("Phoebe", "Mario", "Monica", "Xena", "Roxanna");

		//
		// prior to Java 8

		Collections.sort(stringList);
		System.out.println("Sorted list using collections.sort(): " + stringList);

		//
		// Java 8

		stringList.sort(Comparator.naturalOrder());
		System.out.println("Sorted list using collections.sort(): " + stringList);

		stringList.sort(Comparator.reverseOrder());
		System.out.println("Sorted list using collections.sort(): " + stringList);
	}

}
