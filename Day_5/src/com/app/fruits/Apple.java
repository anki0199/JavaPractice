package com.app.fruits;

public class Apple extends Fruit {
	public Apple(String c, double w, String n, boolean fresh) {
		super(c, w, n, fresh);
	}
	
	@Override
	public String toString() {
		return "name: " + super.getName() + " color: " + super.getColor() + " weight: " + super.getWeight();
	}
	
	public String taste() {
		return "sweet n sour";
	}
	
	public void jam() {
	System.out.println(super.getName());
	System.out.println("making jam");
	}
}
