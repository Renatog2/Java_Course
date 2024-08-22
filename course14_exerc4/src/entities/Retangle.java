package entities;

import entities.enums.Color;

public class Retangle extends Shape {
	private Double width;
	private Double height;
	
	
	// Constructors
	public Retangle() {
		super();
	}
	
	public Retangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	
	// Getters and Setters
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	
	
	// Methods
	@Override
	public double area() {
		return width * height;
	}
	
	@Override
	public String toString() {
		return "Retangle [width=" + width + ", height=" + height + ", Color=" + getColor() + "]";
	}
}
