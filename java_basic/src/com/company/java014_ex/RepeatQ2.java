package com.company.java014_ex;

import java.util.ArrayList;

/*  1. 클래스는 부품객체
	2. 멤버변수 / 멤버함수
	Q2. 상속도
		Object										   Object(){#3    }#4
		  ↑
		 Papa      money=10			/--------            Papa(){#2    }#5
		  ↑
		 Son       money=150/car=2  /toString(오버라이드)    Son(){#1    }#6  @Override
*/

class Papa {
	int money = 10;
	public Papa() {}
	public Papa(int money) { this.money = money; }
	@Override public String toString() { return "Papa [money=" + money + "]"; }
}
class Son extends Papa {
	int money = 150;
	int car = 2;
	public Son() { super(); }
	public Son(int money) { this.money = money; }
	public Son(int money, int car) { this.money = money; this.car = car; }
	@Override public String toString() { return "Son [money=" + money + ", car=" + car + "]"; }
}

public class RepeatQ2 {
	public static void main(String[] args) {
		// 3. 출력되는 화면, 만약 컴파일시 에러가 나면 오류가 나는 이유
		Papa p1 = new Papa();  // [money=1, toString] = 1번지 Papa(){ money=10 / toString }
		System.out.println(p1); // Papa [money= 10]
		
		// 4. 출력되는 화면, 만약 컴파일시 에러가 나면 오류가 나는 이유
		Son s2 = new Son(); // Son s2 [money=150,car=2/toString]-[money=10/toString]
		// s2 = 2번지 {money=150,car=2/toString}-{money=10/-------}
		System.out.println(s2); // Son [money= 150, car= 2]
		
		// 5. 출력되는 화면, 만약 컴파일시 에러가 나면 오류가 나는 이유
		// Son s3 = new Papa();    // Son s3 [money=150,car=2/toString]-[money=10/toString]
		// 자식은 부모를 담을 수 있는데 호출을 해야 함
		//     s3 = 3번지                                          Papa(){money=10/toString}
		// error = Type mismatch: cannot convert from Papa to Son
		// System.out.println(s3);
		// 해결방안1) new Papa(); 앞에 (Son)을 타입캐스팅(변수를 청소한 적이 없기 때문에 안 됨)
		// 해결방안2) Son을 Papa로 변경 / 아니면 Papa를 Son으로 변경
		
		// 6-1. 출력되는 화면, 만약 컴파일시 에러가 나면 오류가 나는 이유
		Papa p4 = new Son();                            // [money=1, toString]
		// s2 = 4번지 Son(){money=150,car=2/toString}-Papa(){money=10/-------}   @Override
		System.out.println(p4); // Son [money= 150, car=2]
		// 6-2. 출력되는 화면
		System.out.println(p4.money); // 10
		
		// 7-1. 출력되는 화면, 만약 컴파일시 에러가 나면 오류가 나는 이유
		Papa p5 = new Son(); // 1. 부모 = 자식  / 업캐스팅 / 타입캐스팅 필요 X
		Son s5 = (Son) p5;   // 2. 자식 = 부모  / 다운캐스팅 / 타입캐스팅 필요 O / 부모는 자식 생성자를 호출한 적이 있어야 함
		// Son             s5 [money=150,car=2/toString]-[money=10/toString]
		//     p5 = 5번지 Son(){money=150,car=2/toString}-Papa(){money=10/-------}
		System.out.println(s5); // Son [money= 150, car=2]
		// 7-2. 출력되는 화면
		System.out.println(s5.money); // 150
		System.out.println(((Papa)s5).money); // 10
		System.out.println(((Papa)s5).toString()); // Son [money= 150, car=2]
		
		ArrayList<String> list = new ArrayList<>(); // 다음주진행  ctrl + shift + o (import)
		// public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
		
	}
}
// 오버로딩과 오버라이딩의 차이
// 오버로딩 : 비슷한 동작을 수행하는 메서드들을 같은 이름으로 일관되는 작업하는 것
// 오버로딩 : 메서드의 이름을 같게, argument(인수, 인자, 재료) 자료형과 갯수를 다르게 해서 구분 / 비슷한 기능
// 오버라이딩 : 상속 시 자식클래스에서 맞게 메서드를 수정하는 것
// 오버라이딩 : 상속 시 부모의 메서드를 자식에게 맞게 수정해서 사용