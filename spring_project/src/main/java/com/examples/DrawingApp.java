package com.examples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.examples.beans.Triangle;

public class DrawingApp {
	
	public static void main(String[] args) {
		//Triangle t = new Triangle();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();
		Triangle t = context.getBean("triangle", Triangle.class);
		t.draw();
		context.registerShutdownHook();
		context.close();
	}

}
