package com.java.oops;

public class Overloading {

	public String method(Object obj) {
		return "method with param type - Object";
	}

	public String method(String str) {
		return "method with param type - String";
	}

	public String method(StringBuffer strBuf) {
		return "method with param type - StringBuffer";
	}
}
