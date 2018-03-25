package com.java.labdaexpressions;

import org.junit.Before;
import org.junit.Test;

import com.ashish.labdaexpressions.LambdaIntroduction;

public class LambdaIntroductionTest {

	private LambdaIntroduction sut;

	@Before
	public void setup() {
		sut = new LambdaIntroduction();
	}

	@Test
	public void testSuccess() {
		sut.instanceMethod();

	}
}
