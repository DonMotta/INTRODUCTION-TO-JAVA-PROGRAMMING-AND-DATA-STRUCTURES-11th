package com.chapter13.listings.listing13_01;

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

}
