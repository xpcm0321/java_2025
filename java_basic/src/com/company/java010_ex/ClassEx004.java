package com.company.java010_ex;

import java.util.Scanner;

// 1. 클래스는 부품객체
// 2. 클래스는 상태(멤버변수)와 행위(멤버함수)
// 3. 생성자 호출 초기화
class TV{
	// 상태 - 멤버변수  채널 / 볼륨
	String channel; int volume;
	// 행위 - 멤버함수 채널, 볼륨 입력: input() / 출력 : show()
	void input() {
		// 변수-입력-처리-출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("channel 입력 : "); this.channel = scanner.next();
		System.out.print("volume 입력 : "); this.volume = scanner.nextInt();
	}
	void show() { System.out.println(this.channel + "\t" + this.volume); }
	public TV(String channel, int volume) { this.channel = channel; this.volume = volume; }
	TV(){} // 기본 생성자 : 컴파일러 TV() 기본 자동생성,
	       // but,,,,, 생성자를 개발자가 손대는 순간 자동생성 취소
}
public class ClassEx004 {
	public static void main(String[] args) {
		TV t1 = new TV("JDBC", 8);
		t1.show();
		TV t2 = new TV();  // 1. new 객체생성  2. 생성자 불러서 초기화  3. t2 = 2번지
		t2.input();
		t2.show();
	}
}
/*
------------------------------- runtime 
[method:정보, static, final]  TV.class / ClassEx004.class  #1
---------------------------------------------
[heap]               				| [stack]
29번 :								   t2.show() { 2번지의 channel 출력, 2번지의 volume 출력 }
28번 : 2번지{ channel=youtube, volume=10 } ← t2.input() { 2번지의 channel 출력, 2번지의 volume 출력 }
27번 : 2번지{ channel=null, volume=0 } ← t2 : 2번지
26번 :								   t1.show() { 1번지의 channel 출력, 1번지의 volume 출력 }
25번 : 1번지{ channel=JDBC, volume=8 } ← t1 : 1번지
					 				| main  #2
---------------------------------------------
*/

/*
class TV{
상태 - 멤버변수  채널 / 볼륨 String channel; int volume;
행위 - 멤버함수 : 채널, 볼륨 입력: input() / 출력 : show()
}

public static void main(String[] args) {
  TV t1 = new TV("JDBC", 8);
  t1.show();
  TV t2 = new TV();
  t2.input();
  t2.show();
}
*/