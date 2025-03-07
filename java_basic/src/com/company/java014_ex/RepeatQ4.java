package com.company.java014_ex;

interface Animal {
	String NAME = "홍길동";	// 1. public static final 상수- method area
	void eat();				// 2. public abstract     추상메서드 {}
}
class Saram implements Animal {
	@Override public void eat() {
		// NAME = "아이유"; error1 변하지 않는 상수!
		// interface 에서 이미 바꿀 수 없는 값으로 설정을 해서 Saram 클래스에서 바꿀 수 없음
		System.out.println(NAME + "이 밥을 먹어요.");
	}
}

public class RepeatQ4 {
	public static void main(String[] args) {
		// Animal ani = new Animal(); error2 new {} 구현부가 없어서 new 사용불가
		Animal ani = null;
		ani = new Saram(); ani.eat();
	}
}