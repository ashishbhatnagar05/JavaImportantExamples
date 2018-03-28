package com.java.multithreading;

import org.junit.Ignore;
import org.junit.Test;

public class WorkerTest {

	@Test
	@Ignore
	public void test() {
		Worker sut = new Worker();
		Thread t1 = new Thread(sut, "T1");
		Thread t2 = new Thread(sut, "T2");
		Thread t3 = new Thread(sut, "T3");
		t1.start();
		t2.start();
		t3.start();
	}

	@Test
	public void test2() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			Worker2 sut = new Worker2();
			Thread t1 = new Thread(sut, "T1");
			Thread t2 = new Thread(sut, "T2");
			Thread t3 = new Thread(sut, "T3");
			t1.start();
			t2.start();
			t3.start();
			Thread.sleep(200);
			System.out.println();
		}
	}
}
