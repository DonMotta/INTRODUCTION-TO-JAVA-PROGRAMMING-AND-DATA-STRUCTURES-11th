//LISTING 11.1
package com.chapter11.listing;

public abstract class GeometricObject {

	private String color = "White";
	private boolean filled;
	private java.util.Date dateCteated;

	protected GeometricObject() {

		dateCteated = new java.util.Date();

	}

	protected GeometricObject(String color, boolean filled) {

		dateCteated = new java.util.Date();
		this.color = color;
		this.filled = filled;

	}

	public String getColor() {

		return color;
		
	}

	public void setColor(String color) {

		this.color = color;

	}

	public boolean isFilled() {

		return filled;
	}

	public void setFilled(boolean filled) {

		this.filled = filled;
		
	}

	public java.util.Date getDateCreated() {

		return dateCteated;
	}

	public String toString() {
		
		return "Created on " + dateCteated + "\ncolor " + color + " and filled : " + filled;
	}
	
	public abstract double getArea();
	
	
	public abstract double getPerimeter();

	
	
	
	
	

}
