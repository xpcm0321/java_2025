package com.company.java018_ex;

class MilkPrint {
	private String name;
	private int price;
	
	public MilkPrint() {
		super();
	}
	public MilkPrint(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "MilkPrint [name=" + name + ", price=" + price + "]";
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
	public void show(Milk[] milks) {
		for (int i = 0; i < milks.length; i++) {
			System.out.println(milks[i].getName() + "/" + milks[i].getPrice());
		}
	}
}

public class Repeat001_OOP2 {
	public static void main(String[] args) {
		Milk[] milks = new Milk[3];   // milks = [null, null, null]
		milks[0] = new Milk("white", 1000);  // milks[0] = 1번지 {"white", 1000}
		milks[1] = new Milk("choco", 1200);
		milks[2] = new Milk("banana", 1500);
		
		MilkPrint print = new MilkPrint();
		print.show(milks);
		// 리턴값 메서드명 파라미터
		// void  show(Milk[] milks);  // milks = [1번지, 2번지, 3번지]
	}
}
