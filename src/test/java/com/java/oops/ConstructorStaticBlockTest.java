package com.java.oops;

import org.junit.Test;

public class ConstructorStaticBlockTest {
	@Test
	public void testDefaultConstructor() {
		ConstructorStaticBlock block = new ConstructorStaticBlock();
	}

	@Test
	public void testParameterizedConstructor() {
		ConstructorStaticBlock block = new ConstructorStaticBlock(123);
	}

}
