package com.chapter13.listings.listing13;

public class Circle extends GeometricObject {
	
	private double radius;
	private String color;
	private boolean filled;
	

	public Circle(double radius) {
		
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		
		this.color = color;
		this.radius = radius;
		this.filled = filled;
		
	}
	
	public double getRadius() {
		
		return radius;
	}
	
	

	public double getArea() {

		return radius;
	}

	public double getPerimeter() {

		return 0;
	}

}
