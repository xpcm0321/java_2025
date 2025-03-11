package com.company.java015_ex;

class Papa extends Object {
	int money = 10000;
	public Papa() { super(); }
	public void sing() {
		System.out.println("GOD-거짓말");
	}
}

class Son2 extends Papa{
	int money = 1500;
	public Son2() { super(); }
	@Override
	public void sing() {
		System.out.println("빅뱅-거짓말");
	}
}

public class SelfTest007 {
	public static void main(String[] args) {
		Papa mypapa = new Son2();
		// Papa mypapa =                            { money = 10000 / sing() }
		// new Son2() - { money = 1500 / sing() } - { money = 10000 / ------ }   @Override
		System.out.println(mypapa.money); // money = 10000
		mypapa.sing();  // 빅뱅-거짓말
		
		// 1500 출력
		System.out.println(((Son2)mypapa).money);
	}
}
/*
Object
  ↑
Papa { money = 10000 / sing() }
  ↑
Son2 { money = 1500 / sing() }
*/