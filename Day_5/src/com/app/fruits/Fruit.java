package com.app.fruits;

public class Fruit {
//	color : String , weight : double , name:String, fresh : boolean
	private String color;
	private double weight;
	private String name;
	private boolean fresh=true;

	public Fruit(String c, double w, String n, boolean fresh) {
		color = c;
		weight = w;
		name = n;
		this.fresh = fresh;
	}
	
	
	public boolean isFresh() {
		return fresh;
	}


	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String toString() {
		System.out.println("fr");
		return "name: " + name + " color: " + color + " weight: " + weight;
	}
	
	public String taste() {
		return "no specific taste";
	}

	
}
