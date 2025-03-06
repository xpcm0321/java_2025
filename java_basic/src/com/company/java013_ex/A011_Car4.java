package com.company.java013_ex;

// 8. DTO
// 8-1. private(클래스내부) - getters/setters
// 8-2. 객체의 상태를 표현하는 출력 = toString

//color 접근제어자가 private(클래스내부) 이므로 ( getters / setters )를 작성해 데이터를 셋팅하고, 데이터를 가져오고
//System.out.println(컬러객체명)시 Car4[color=red]가 출력되게 만들려면 (toString)메서드가 필요함

// 9 오류해결
class Car4 extends Object {
	private String color; // private 수정하지말기
	
	public Car4() { super(); }
	@Override public String toString() { return "Car4 [color=" + color + "]"; }
	
	// 9-1
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
}

public class A011_Car4 {
	public static void main(String[] args) {
		Car4 c1 = new Car4();
		// c1.color = "red"; 9-2
		c1.setColor("red");
		System.out.println(c1); // Car4[color=red]
	}
}
// 10. 상속하는 이유 : 클래스의 재사용
// 11. 상속의 형태 : class 자식클래스 extends 부모클래스