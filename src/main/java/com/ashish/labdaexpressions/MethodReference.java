package com.ashish.labdaexpressions;

public class MethodReference {

	public void method() {
		Thread t1 = new Thread(MethodReference::printHello);// same as () -> printHello()
		Thread t2 = new Thread(() -> printHello());
		t1.start();
		t2.start();
	}

	public static void printHello() {
		System.out.println("Hello");
	}

}
