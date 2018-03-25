package com.java.labdaexpressions;

import java.util.function.BiConsumer;

public class LabdaExceptionHandling {

	public void method() {
		int[] numbers = { 1, 2, 3, 4, 5 };
		int key = 0;
		process(numbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
	}

	private void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (Integer number : numbers)
			consumer.accept(number, key);
	}

	private <T, U> BiConsumer<T, U> wrapperLambda(BiConsumer<T, U> consumer) {
		return (v, k) -> {
			try {
				consumer.accept(v, k);
			} catch (ArithmeticException ex) {
				System.out.println("Exception: " + ex.getMessage());
			}
		};

	}

}
