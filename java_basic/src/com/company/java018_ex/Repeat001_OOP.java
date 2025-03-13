package com.company.java018_ex;

class Milk {
	private String name;
	private int price;

	public Milk() {
		this.name = "white";
		this.price = 1300;
	}
	public Milk(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Milk [name=" + name + ", price=" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

public class Repeat001_OOP {
	public static void main(String[] args) {
		Milk m1 = new Milk("choco", 1200);
		System.out.println(m1);
		Milk m2 = new Milk();
		System.out.println(m2);
	}
}
