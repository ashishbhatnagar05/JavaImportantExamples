package com.java.labdaexpressions;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ashish.labdaexpressions.LambdaExcercise1;
import com.ashish.labdaexpressions.Person;

public class LambdaExcercise1Test {
	private LambdaExcercise1 sut;

	@Before
	public void setup() {
		sut = new LambdaExcercise1();
	}

	@Test
	public void testSuccess() {
		List<Person> persons = Arrays.asList(new Person("ashish", "bhatnagar", 19), new Person("amit", "jain", 23),
				new Person("aman", "gupta", 22));
		sut.methodUsingOldApproach(persons);
	}
	
	@Test
	public void testSuccessUsingLambda() {
		List<Person> persons = Arrays.asList(new Person("ashish", "bhatnagar", 19), new Person("amit", "jain", 23),
				new Person("aman", "gupta", 22));
		sut.methodUsingLambdaApproach(persons);
	}

	
	@Test
	public void testSuccessUsingLambdaUsingPredicate() {
		List<Person> persons = Arrays.asList(new Person("ashish", "bhatnagar", 19), new Person("amit", "jain", 23),
				new Person("aman", "gupta", 22));
		sut.methodUsingLambdaApproachUsingPredicate(persons);
	}
}
