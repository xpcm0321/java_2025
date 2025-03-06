package com.company.java013_ex;

// 6. 컴파일에러
// 클래스는 부품객체 (상태-멤버변수 와 행위-멤버함수)
// 멤버변수(클래스변수, 인스턴스변수, 지역변수) / 멤버함수(클래스메서드, 인스턴스메서드)

// 변수 초기화 단계
// 			 		기본값 명시적초기화 초기화블록 생성자
// classValue   	1)0     2)20      3)20      4)X
// instanceValue 	5)0     6)10      7)10      8)10
class MemberCall001 { // 지역변수 int a, int b
	int instanceValue = 10; // 인스턴스변수, heap area, new O, this
	static int classValue = 20; // 클래스변수, method area, new X, 공유, 클래스명.변수명
	
	int instanceValue2 = classValue; // 인스턴스변수(5) = 클래스변수(먼저) (1)
	// 1
	// static int classValue2 = instanceValue; // 1 Cannot make a static reference to the non-static field instanceValue
	// error - static은 instacne 사용불가
	// static jvm 로딩시 메모리 할당받음(바로사용), instance는 new를 사용해 메모리 할당받고 객체 생성 후 사용해야 함.
	// int instanceValue에 static 붙이기
	// 1)라인 A
	
	static void staticMethod1() {
		System.out.println(classValue);
		// System.out.println(instanceValue); // 2 Cannot make a static reference to the non-static field instanceValue
		// static은 instance 사용불가
		// int instanceValue에 static붙이기
		// 2)라인 B
	} // 2
	// static jvm 로딩시 메모리 할당받음(바로사용), instance는 new를 사용해 메모리 할당받고 객체 생성 후 사용해야 함.
	
	void instanceMethod1() {
		System.out.println(classValue);
		System.out.println(instanceValue); // 3)라인 C
	} // 3
	/* static void staticMethod2() {
		System.out.println(classValue);
		instanceMethod1(); // 4)라인 D
		// 3 Cannot make a static reference to the non-static method instanceMethod1() from the type MemberCall001
		// void instanceMethod1()에 static 붙이기
		// static jvm 로딩시 메모리 할당받음(바로사용), instance는 new를 사용해 메모리 할당받고 객체 생성 후 사용해야 함.
	} // 4 */
	
	void instanceMethod2() { // 인스턴스메서드 - heap area - new O - this 각각
		staticMethod1(); // 5)라인 E
	} // 5
}

// 접근제어자 사용범위를 작은순서에서 -> 큰순서로 적으시오 : private( 클래스내부 ) < package ( default : 폴더내부 ) < protected( extends : 상속 ) < public( 아무데서나 사용가능 )

public class Repeat002_OOP {
	public static void main(String[] args) {
	}
}
