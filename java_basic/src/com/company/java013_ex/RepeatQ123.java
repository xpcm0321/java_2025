package com.company.java013_ex;

class A11 {
	int a; // (1)  (인스턴스 변수) - heap area - new O- this 각각
	A11() {}
	A11(int a) { this.a = a;} // (2)  지역변수 - stack area
	
	// (3) void show()   인스턴스메서드
	void show() { this.a = 11; System.out.println( this.a );}
	
	// (4) static void classMethod()  (인스턴스메서드) - heap area - new - this 각각
	static void classMethod() { /* this.a = 12; */ }
	
	// (5) int show2()  (클래스메서드) - method area - new X - 공유영역 static이 jvm 로딩 시 제일 먼저 메모리상에 올라감, this는 new를 이용해 사용해야함, 순서가 안 맞음. static instance 사용불가
	int show2() { int a = 1; return a; } // 인스턴스 메서드 - heap area - new O - this 각각 Q2-2
	// 지역변수 int a에 값이 없어서 return이 안 됨
	// int show2() { int a; return a; } show2 메서드 안에 있는 int a는 지역변수
	// int a는 stack - 임시 공간 - 변수초기화가 안 됨. 주의) 개발자가 초기화를 해야함.
}
public class RepeatQ123 {
	public static void main(String[] args) {
		A11 a1 = new A11(); // (b) a1 지역변수 - stack 영역
	}
}
// 1. 위의 문제에서 (1), (2), (3), (4), (5) [클래스변수, 인스턴스변수, 지역변수, 클래스메서드, 인스턴스메서드]에서 고르시오
// 2. 클래스 A11에서 오류나는 곳 수정 후 이유
// 3. (b)번 위치에서 메모리 빌려오고, 객체 생성하는 역할 : ( new ), String은 null, int는 0으로 초기화하는 역할 : ( A11() ), new A11()한 주소르 갖고 있는 것 : ( a1 )
// 4. 기본생성자를 반드시 선언해야하는 경우 : [생성자 오버로딩, 상속]
// 5. 다음 중 오버로딩이 성립하기 위한 조건이 아닌것은? (c : 리턴 타입이 달라야 한다, d : 매개변수의 이름이 달라야한다)
// 비슷한 기능의 메서드들의 이름을 같게 만들고, argument 의 자료형과 갯수로 구분