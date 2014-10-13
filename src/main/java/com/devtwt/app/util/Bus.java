package com.devtwt.app.util;

// TODO
public class Bus {
	
	String className = "";
	
	public Bus(String className) {
		this.className = className;
	}
	
	public Object getInstance() {
		return (this.className).getClass();
	}
}
