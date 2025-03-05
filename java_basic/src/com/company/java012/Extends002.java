package com.company.java012;
// 1. 클래스는 부품객체
// 2. 상태(멤버변수)와 행위(멤버함수)
/*
Object											Object(){#3    }#4
 ↑
Green  name(private)							Color() {#2    }#5 name 인스턴스변수 사용가능
 ↑
Green  num(private)  / void show(){}			Green() {#1    }#6 num 인스턴스변수 사용가능
*/

class Color extends Object {
	private String name;
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
}
class Green extends Color {
	private int num;
	
	public int getNum() { return num; }
	public void setNum(int num) { this.num = num; }
	public void show() {
		System.out.println("= name : " + getName() + "\n= num : " + this.num);
	}
}

public class Extends002 {
	public static void main(String[] args) {
		Green mygreen = new Green();
		mygreen.setName("LIGHT_GREEN");
		mygreen.setNum(5);
		mygreen.show();
		// mygreen.name = "LIGHT_GREEN"; mygreen.num=5; mygreen.show();
	}

}
