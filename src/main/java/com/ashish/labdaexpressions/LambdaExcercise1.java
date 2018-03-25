package com.ashish.labdaexpressions;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExcercise1 {

	public void methodUsingOldApproach(List<Person> persons) {

		// 1: sort list by lastname
		sortByLastname(persons);
		// 2: print all elements in list
		printAll(persons);

		// 3:print all people who have lastname beginning with b
		printConditionally(persons, new Condition() {

			@Override
			public boolean test(Person person) {
				return person.getLastname().startsWith("b");
			}

		});
	}

	public void methodUsingLambdaApproach(List<Person> persons) {

		// 1: sort list by lastname
		Collections.sort(persons, (o1, o2) -> o1.getLastname().compareTo(o2.getLastname()));

		// 2: print all elements in list
		printConditionally(persons, p -> true);

		System.out.println("/////////////////");

		// 3:print all people who have lastname beginning with b
		printConditionally(persons, p -> p.getLastname().startsWith("b"));
		printConditionally(persons, p -> p.getLastname().startsWith("j"));
	}

	public void methodUsingLambdaApproachUsingPredicate(List<Person> persons) {

		// 1: sort list by lastname
		Collections.sort(persons, (o1, o2) -> o1.getLastname().compareTo(o2.getLastname()));

		// 2: print all elements in list
		printConditionallyPredicate(persons, person -> true, person -> System.out.println(person));

		System.out.println("/////////////////");

		// 3:print all people who have lastname beginning with b
		printConditionallyPredicate(persons, person -> person.getLastname().startsWith("b"),
				person -> System.out.println(person));
		printConditionallyPredicate(persons, person -> person.getLastname().startsWith("j"),
				person -> System.out.println(person));
	}

	private void sortByLastname(List<Person> persons) {
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastname().compareTo(o2.getLastname());
			}
		});
	}

	private void printConditionally(List<Person> persons, Condition condition) {
		for (Person person : persons) {
			if (condition.test(person))
				System.out.println(person);
		}

	}

	private void printConditionallyPredicate(List<Person> persons, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person person : persons) {
			if (predicate.test(person))
				consumer.accept(person);
		}

	}

	// private void printConditionally(List<Person> persons) {
	// for (Person person : persons) {
	// if (person.getLastname().startsWith("b"))
	// System.out.println(person);
	// }
	//
	// }

	private void printAll(List<Person> persons) {
		for (Person person : persons) {
			System.out.println(person);
		}

	}

	interface Condition {
		boolean test(Person person);
	}

}
