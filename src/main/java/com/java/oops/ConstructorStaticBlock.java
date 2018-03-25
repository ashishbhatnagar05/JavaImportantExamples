package com.java.oops;

public class ConstructorStaticBlock {

	private int id;

	public ConstructorStaticBlock(int id) {
		this();// if we didnt put this() it will not call default contructor,by default it
				// takes super()
		System.out.println("Parameterized Constructor of ConstructorStaticBlock");
		this.id = id;
	}

	public ConstructorStaticBlock() {
		super();
		System.out.println("Default Constructor of ConstructorStaticBlock");
	}

	static {
		System.out.println("static block of ConstructorStaticBlock");
	}

	{
		System.out.println("instance block of ConstructorStaticBlock");
	}
}
