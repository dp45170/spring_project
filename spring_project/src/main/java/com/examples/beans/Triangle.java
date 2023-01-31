package com.examples.beans;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Triangle {
	
	private static final Logger LOGGER = LogManager.getLogger(Triangle.class);
	
	private String name;
	private int height;
//	private Point pointA;
//	private Point pointB;
//	private Point pointC;
	private List<Point> points;
	
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

//	public Point getPointA() {
//		return pointA;
//	}
//
//	public void setPointA(Point pointA) {
//		this.pointA = pointA;
//	}
//
//	public Point getPointB() {
//		return pointB;
//	}
//
//	public void setPointB(Point pointB) {
//		this.pointB = pointB;
//	}
//
//	public Point getPointC() {
//		return pointC;
//	}
//
//	public void setPointC(Point pointC) {
//		this.pointC = pointC;
//	}
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}


	public void draw() {
		System.out.println(this.getName()+" triangle drawn of height "+this.getHeight());
		System.out.println("Point A = "+getPoints().get(0).getX()+", "+getPoints().get(0).getY());
		System.out.println("Point A = "+getPoints().get(1).getX()+", "+getPoints().get(1).getY());
		System.out.println("Point A = "+getPoints().get(2).getX()+", "+getPoints().get(2).getY());
//		System.out.println("Point B = "+getPointA().getX()+", "+getPointA().getY());
//		System.out.println("Point B = "+getPointB().getX()+", "+getPointB().getY());
//		System.out.println("Point C = "+getPointC().getX()+", "+getPointC().getY());
	}


}
