package be.flexlineitsolutions.udemy.java8.lambdas;

public class RunnableLambdaExample {

	public static void main(String[] args) {

		// prior to java 8

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Running 1");
			}
		};

		new Thread(runnable).start();

		// java 8 lambda
		// () -> {};

		Runnable runnableLambda = () -> {
			System.out.println("Inside runnable 2");
		};

		new Thread(runnableLambda).start();

		// or:

		Runnable runnableLambda2 = () -> System.out.println("Inside runnable 2");
		new Thread(runnableLambda2).start();

		// or:

		new Thread(() -> System.out.println("Inside runnable 2")).start();

	}

}
