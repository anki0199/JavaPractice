package com.app.fruits;

public class Mango extends Fruit {
	public Mango(String c, double w, String n, boolean fresh) {
		super(c, w, n, fresh);
	}
	
	

	@Override
	public String toString() {
		return "name: " + super.getName() + " color: " + super.getColor() + " weight: " + super.getWeight();
	}

	public String taste() {
		return "sweet";
	}
	
	public void pulp() {
		System.out.println(super.getName());
		System.out.println("color is:" + super.getColor());
		System.out.println("creating pulp");
		
	}
}
