package be.flexlineitsolutions.udemy.java8.defaults;

import java.util.List;

public interface Multiplier {

	int multiply(List<Integer> list);

	default int size(List<Integer> list) {
		System.out.println("Inside interface");
		return list.size();
	}

	static boolean isEmpty(List<Integer> list) {
		return list != null && list.size() > 0;
	}

}
