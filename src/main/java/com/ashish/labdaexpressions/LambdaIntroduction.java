package com.ashish.labdaexpressions;

public class LambdaIntroduction {
	/*
	 * 1: Lambda Expressions kind a looks like anonymous inner class, the concept of
	 * both kind a is same but they both are different. 2: Developers uses interface
	 * with lambdas to offer backward compatibility. We could use old interfaces and
	 * use lambdas to define their behavior . 3: Java 8 has interface with abstract
	 * and non-abstract methods. To avoid confusion they introduce functional
	 * interface to have just one abstract method. Put @FunctionalInterface on top of interface.
	 */

	public void instanceMethod() {
		// simple lambda functional variables
		PrintLambda printHello = () -> System.out.println("Hello!!!!! from lambda expression");
		AddLambda addIntegers = (int a, int b) -> a + b;

		printHello.foo();

		PrintLambda usingInnerClass = new PrintLambda() {

			@Override
			public void foo() {
				System.out.println("Hello from annonymous inner class");

			}
		};
		usingInnerClass.foo();

		System.out.println(addIntegers.foo(2, 3));
		// lambda expressions use Type Inference
		printLambda(s -> s.length());

		// backward compatibility
		Thread myThreadlambda = new Thread(() -> System.out.println("running"));
		myThreadlambda.start();

	}

	public void printLambda(StringLengthLambda l) {
		System.out.println(l.getStringLength("ashish is awewsome"));
	}

}
// lambda interface should have only one method so that compiler can
// differentiate which function to choose

@FunctionalInterface
interface StringLengthLambda {
	int getStringLength(String str);
}

@FunctionalInterface
interface PrintLambda {
	void foo();
}

@FunctionalInterface
interface AddLambda {
	int foo(int a, int b);
}