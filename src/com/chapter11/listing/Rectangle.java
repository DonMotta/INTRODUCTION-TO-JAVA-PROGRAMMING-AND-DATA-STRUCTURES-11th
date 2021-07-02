//LISTING 11.3
package com.chapter11.listing;

public class Rectangle extends GeometricObject {
	
	private double width;
	private double height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double width, double hieght) {
	
		this.width = width;
		this.height = hieght;
		
	}
	
	public Rectangle(double width, double hieght, String color, boolean filled) {
		
		this.width = width;
		this.height = hieght;
		setColor(color);
		setFilled(filled);
		
	}
	
	public double getWidth() {
		
		return width;
	}
	
	public void setWidth(double width) {
		
		this.width = width;
		
	}
	
	public double getHeight() {
		
		return height;
	}
	
	public void setHeight(double hieght) {
		
		this.height = hieght;
		
	}

	public double getArea() {

		return width * height;
	}

	public double getPerimeter() {

		return 2 * (width + height);
	}

}
