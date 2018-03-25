package com.java.labdaexpressions;

import org.junit.Before;
import org.junit.Test;

import com.ashish.labdaexpressions.MethodReference;


public class MethodReferenceTest {

	private MethodReference sut;

	@Before
	public void setup() {
		sut = new MethodReference();
	}

	@Test
	public void testSuccess() {
		sut.method();
	}
}
