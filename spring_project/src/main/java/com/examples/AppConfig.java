package com.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.examples.beans.Point;
import com.examples.beans.Triangle;

@Configuration
public class AppConfig {
	
	@Bean
	public Triangle triangle() {
		Triangle t = new Triangle("Equilateral", 20);
		return t;
	}
	
	@Bean
	public Point pointA() {
		return new Point(10, 10);
	}
	@Bean
	public Point pointB() {
		return new Point(20, 20);
	}
	@Bean
	public Point pointC() {
		return new Point(30, 30);
	}
	

}
