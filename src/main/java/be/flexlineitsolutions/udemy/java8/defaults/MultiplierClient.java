package be.flexlineitsolutions.udemy.java8.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

	public static void main(String[] args) {

		Multiplier multiplier = new MultiplierImpl();
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		System.out.println("The result is : " + multiplier.multiply(list));
		System.out.println("The size is : " + multiplier.size(list));
		System.out.println("The list is empty : " + Multiplier.isEmpty(list));

	}

}
