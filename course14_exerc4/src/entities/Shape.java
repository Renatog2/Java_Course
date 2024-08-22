package entities;

import entities.enums.Color;

/* O Abstract na declaração vai impedir de se instanciar um objeto diretamente nessa classe, sendo obrigatório a utlização de uma que
 * extende dessa super classe
 */
public abstract class Shape {
	private Color color;
	
	
	// Constructors
	public Shape() {
		
	}
	
	public Shape(Color color) {
		this.color = color;
	}
	
	
	// Getters and Setters
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	
	// Methods
	// Esse método ser abstrato vai obrigar todas as outras classes (Que extendem dessa) a terem uma sobreposição dele declarada.
	public abstract double area();
	
	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
}
