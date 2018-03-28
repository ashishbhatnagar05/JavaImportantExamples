package com.java.labdaexpressions;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.java.labdaexpressions.CollectionIterationExample;
import com.java.labdaexpressions.Person;

public class CollectionIterationExampleTest {

	private CollectionIterationExample sut;

	@Before
	public void setup() {
		sut = new CollectionIterationExample();
	}

	@Test
	public void testSuccess() {
		List<Person> persons = Arrays.asList(new Person("ashish", "bhatnagar", 19), new Person("amit", "jain", 23),
				new Person("aman", "gupta", 22));
		sut.method(persons);
	}
}
