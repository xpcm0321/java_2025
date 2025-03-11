package com.company.java015_ex;

class Sawon005 {
	// (1) 인스턴스 변수, heap area, new O, 실체화, this 각각
	int pay = 10000;
	
	// (2) 클래스 변수, method area, new X, 공유
	static int su = 10;
	
	// (3) 클래스 변수(static) - 인스턴스 사용 불가
	// static int basicpay = pay;
	
	// (4) 클래스 변수, method area, new X, 공유
	static int basicpay2;
	static { basicpay2 = 20000; } // 초기화블록
	
	// (5) 클래스 메서드, method, new X, 공유   Sawon005.showSu();
	public static void showSu() {System.out.println(su);}
	// public static void showPay() {System.out.println(this.pay);}
	
	// (6) 인스턴스 메서드, heap area, new O, 실체화, this
	public void showAll001() {
		System.out.println(su);
		System.out.println(this.pay);
	}
	// (7) 클래스(static) 변수, 인스턴스 사용불가
	public static void showAll002() {
		// showAll001(); // static X
		// System.out.println(this.pay);
	}
}

public class SelfTest003 {
	public static void main(String[] args) {
		Sawon005 sola = new Sawon005();
		sola.showAll001();
	}
}
/*
클래스 작성하고 에러가 난다면 에러나는 이유 적기
*/