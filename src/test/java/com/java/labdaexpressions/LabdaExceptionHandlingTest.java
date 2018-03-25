package com.java.labdaexpressions;

import org.junit.Before;
import org.junit.Test;

public class LabdaExceptionHandlingTest {

	private LabdaExceptionHandling sut;

	@Before
	public void setup() {
		sut = new LabdaExceptionHandling();
	}

	@Test
	public void testSuccess() {
		sut.method();
	}

}
