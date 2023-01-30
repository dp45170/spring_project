package com.examples.beans;

public class Triangle {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("triangle setName called");
		this.name = name;
	}

	public void draw() {
		System.out.println(this.getName()+" triangle is drawn.");
	}

}
