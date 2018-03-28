package com.java.multithreading;

import org.junit.Assert;

public class Worker implements Runnable {
	private Integer value;
	
	
	public Worker() {
		super();
		value = 0;
	}

	public void run() {
		System.out.println("run method");
		synchronized (this) {
			changeValue();
			Assert.assertTrue(checkValue());
		}
	}

	// if we are checking/getting value, it will not work fine if the method is
	// synchronized
	public boolean checkValue() {
		System.out.println("checkValue: " + Thread.currentThread().getName() + " value: " + value);
		if (Thread.currentThread().getName().equals("T1")) {
			if (value != 1)
				return false;
		} else if (Thread.currentThread().getName().equals("T2")) {
			if (value != 2)
				return false;
		} else if (Thread.currentThread().getName().equals("T3")) {
			if (value != 3)
				return false;
		}
		return true;
	}

	// if we are changing value, it will work fine if the method is synchronized
	public void changeValue() {
		if (Thread.currentThread().getName().equals("T1")) {
			value = 1;
		} else if (Thread.currentThread().getName().equals("T2")) {
			value = 2;
		} else if (Thread.currentThread().getName().equals("T3")) {
			value = 3;
		}
		System.out.println("          changeValue: " + Thread.currentThread().getName() + " value: " + value);
	}
}