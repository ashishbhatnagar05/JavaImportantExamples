package com.java.oops;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MethodHidingTest {
	private MethodHiding sut;

	@Before
	public void setup() {
		sut = new MethodHiding();
	}

	@Test
	public void testMethodHiding() {
		Assert.assertEquals("MethodHiding", sut.method());
	}
}
