package com.company.java013_ex;
// Q1. 상속도 그리기
// Q2. 각클래스에서 사용할 수 있는 멤버변수 / 멤버메서드
/*
  Object
    ↑
   Papa     { money = 10000 / sing(GOD-거짓말) }
    ↑
   Son2     { money = 1500 / sing(빅뱅-거짓말) }
*/

class Papa extends Object {
	int money = 10000;
	public Papa() { super(); }
	public void sing() { System.out.println("GOD-거짓말"); }
}

class Son2 extends Papa {
	int money = 1500;
	public Son2() { super(); }
	@ Override
	public void sing() { System.out.println("빅뱅-거짓말"); }
}

public class Polymorphism005 {
	public static void main(String[] args) {
		// Q8. 부모 = 자식 관계 / 업, 다운캐스팅선택 / 타입캐스팅 필요여부
		//>> 부모는 자식을 담을 수 있다.     업캐스팅 / 타입캐스팅 필요 X
		Papa mypapa = new Son2(); // 부모 = 자식
		// Q3. Papa mypapa 의미?  { money = 10000 / sing() } 쓸 수 있게 해줄게!
		// Q4. 인스턴스화한 실제 메모리 빌려온 그림
		//     1번지{ money = 1500 / sing(빅뱅-거짓말) } - { money = 10000 / -------- }
		
		//>> mypapa = 1번지{ money = 1500 / [sing(빅뱅-거짓말) } - { money = 10000] / -------- }
		System.out.println(mypapa.money); // Q5. 출력 10000
		mypapa.sing(); // Q6. 출력  빅뱅-거짓말
		// Q7. mypapa.money를 이용해서 1500 출력되게 해주세요.
		System.out.println(((Son2)mypapa).money); // 1500
	}
}
/*
Object
  ↑
 Papa     money = 10000 / sing()GOD-거짓말
  ↑
 Son2     money = 1500 / sing()빅뱅-거짓말
*/