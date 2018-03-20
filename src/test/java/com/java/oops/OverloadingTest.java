package com.java.oops;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OverloadingTest {
	private Overloading sut;

	@Before
	public void setup() {
		sut = new Overloading();
	}

	@Test
	public void testValidString() {
		Assert.assertEquals("method with param type - String", sut.method(""));

	}

	// this throws an ambiguos warning

	// @Test
	// public void testNullParameter() {
	// sut.method(null);
	// }

	@Test
	public void testStringBuffer() {
		Assert.assertEquals("method with param type - StringBuffer", sut.method(new StringBuffer("")));
	}

	@Test
	public void testValidObject() {
		Assert.assertEquals("method with param type - Object", sut.method(new Object()));

	}

}
