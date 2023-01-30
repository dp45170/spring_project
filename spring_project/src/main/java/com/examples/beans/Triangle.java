package com.examples.beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Triangle {
	
	private static final Logger LOGGER = LogManager.getLogger(Triangle.class);
	
	private String name;
	private int height;
	
	public Triangle() {
		super();
		LOGGER.debug("default constructor called");
	}

	public Triangle(String name, int height) {
		super();
		LOGGER.debug("(name, height) constructor called");
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		LOGGER.debug("triangle setName called");
		this.name = name;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		LOGGER.debug("triangle setHeight called");
		this.height = height;
	}

	public void draw() {
		System.out.println(this.getName()+" triangle drawn of height "+this.getHeight());
	}

}
