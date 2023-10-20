package com.app.fruits;

public class Orange extends Fruit {
	public Orange(String c, double w, String n, boolean fresh) {
		super(c, w, n, fresh);
	}

	@Override
	public String toString() {
		return "name: " + super.getName() + " color: " + super.getColor() + " weight: " + super.getWeight();
	}

	public String taste() {
		return "sour";
	}
	
	public void juice() {
		System.out.println(super.getName());
		System.out.println("weight is:" + super.getWeight());
		System.out.println("Extracting juice");
		
	}
}
