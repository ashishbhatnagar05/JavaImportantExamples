package com.java.labdaexpressions;

import java.util.List;

public class CollectionIterationExample {

	public void method(List<Person> persons) {
		persons.forEach(p -> System.out.println(p));
		System.out.println("OR");
		persons.forEach(System.out::println);
		persons.stream()
		.filter(p -> p.getLastname().startsWith("b"))
		.forEach(p -> System.out.println(p.getFirstname()));

	}
}
