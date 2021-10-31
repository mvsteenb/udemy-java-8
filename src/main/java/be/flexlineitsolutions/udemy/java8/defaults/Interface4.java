package be.flexlineitsolutions.udemy.java8.defaults;

public interface Interface4 {

	default void methodA() {
		System.out.println("Inside method A" + Interface4.class);
	}
}
