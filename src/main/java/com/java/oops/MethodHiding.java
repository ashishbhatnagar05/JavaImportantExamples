package com.java.oops;

public class MethodHiding extends MethodHidingParent {

	public static String method() {
		return "MethodHiding";
	}
}

class MethodHidingParent {
	public static String method() {
		return "MethodHidingParent";
	}
}
