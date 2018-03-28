package com.java.multithreading;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
/*1: All worker threads will give same hashcode for person and logger, but different for internal method specific name in log method 
 * 
 */

public class Worker2 implements Runnable {
	// All the treads are using same instance. Kind a like prototype scope. It is
	// not thread safe
	private Person person = new Person();

	// use synchronized method or block
	public void method() {
		// Person person = new Person();// Thread safe as each thread has its own scope
		// of this object
		person.setName(new StringBuffer(Thread.currentThread().getName()));
		System.out.println("Thread: " + Thread.currentThread().getName() + " name: " + person.getName());
		Assert.assertEquals(person.getName().toString(), Thread.currentThread().getName());

		// System.out.println(Thread.currentThread().getName() + " : " +
		// person.hashCode());
		// Object obj=new Object();
		// person.log(obj);

	}

	@Override
	public void run() {
		method();
	}
}

class Person {
	StringBuffer name;

	Logger logger = new Logger();

	public Person() {
		super();
	}

	public StringBuffer getName() {
		return name;
	}

	public void setName(StringBuffer name) {
		this.name = name;
	}

	public void log(Object obj) {
		// System.out.println(Thread.currentThread().getName() + " : " +
		// logger.hashCode());
		// StringBuffer name = new StringBuffer(Thread.currentThread().getName());
		// System.out.println(Thread.currentThread().getName() + " : " +
		// name.hashCode());
		// System.out.println(Thread.currentThread().getName() + " : " +
		// obj.hashCode());
		// logger.log(name);
	}

}

class Logger {
	public void log(StringBuffer name) {
		System.out.println(Thread.currentThread().getName() + " : " + name);
		Assert.assertEquals(name.toString(), Thread.currentThread().getName());
	}
}