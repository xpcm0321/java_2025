package com.company.java010_ex;

import java.util.Scanner;

class Calc {
	// 멤버변수
	static String name = "**계산기**";
	int num1, num2;
	char op;
	double result;

	//멤버함수
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 1 > ");
		this.num1 = scanner.nextInt();
		System.out.print("숫자 2 > ");
		this.num2 = scanner.nextInt();
		System.out.print("연산자 > ");
		this.op = scanner.next().charAt(0);
	}

	void opcalc() {
		switch (op) {
		case '+' :
			result = (num1 + num2);
			break;
		case '-' :
			result = (num1 - num2);
			break;
		case '*' :
			result = (num1 * num2);
			break;
		case '/' :
			result = (num1 / (float) num2);
			break;
		}
		/*
		switch (op) {
		case '+' :
			System.out.println("" + num1 + op + num2 + " = " + (num1 + num2));
			break;
		case '-' :
			System.out.println("" + num1 + op + num2 + " = " + (num1 - num2));
			break;
		case '*' :
			System.out.println("" + num1 + op + num2 + " = " + (num1 * num2));
			break;
		case '/' :
			System.out.println("" + num1 + op + num2 + " = " + (num1 / (float) num2));
			break;
		} */
		
		/*
		if (op == '+') {
			result = (num1 + num2);
		} else if (op == '-') {
			result = (num1 - num2);
		} else if (op == '*') {
			result = (num1 * num2);
		} else if (op == '/') {
			result = (num1 / (float) num2);
		} */
	}

	void show() {
		 opcalc();
		// System.out.println();
		System.out.println( "" + num1 + op + num2 + " = " + ( op != '/' ? ("" + (int) result) : String.format("%.2f", result)) );
	}

	public Calc() {}
	public Calc(int num1, int num2, char op) {
		this.num1 = num1; this.num2 = num2; this.op = op;
	}
}

public class ClassEx007 {
	public static void main(String[] args) {
		System.out.println(Calc.name);  // 클래스명.static변수 - new를 이용해서 사용X
		Calc c1 = new Calc(10, 3, '+');
		c1.show();
		
		System.out.println(c1.name);  // 클래스명.static변수
		// The static field Calc.name should be accessed in a static way
		Calc c2 = new Calc();
		c2.input();
		c2.show();
	}
}
/* 소스파일													-- 컴파일(번역) -- 바이트코드
   ClassEx007.java [ class Calc{} / class ClassEx007{} ]                Calc.class / ClasEx007.class
## Class Loader
num1, num2, op, result : 인스턴스 변수
------------------------------- [ ## runtime ] 
[method : 정보, static, final / 공유]
  #1.  Calc.class / ClassEx007.class / Calc.name[**계산기**](class 변수) / main
---------------------------------------------
[heap: 동적]								| [stack:임시]
85번 2번지{num1(인스턴스변수):0, num2:0, op:+, result:0.0} ←     c2 : 2번지
83번												 c1.show();
82번 1번지{num1:10, num2:3, op:+, result} ←        c1 : 1번지
80번							  			println( Calc.name ); // **계산기**
										| #2. main
---------------------------------------------
*/

/*
연습문제4)  class
패키지명 : com.company.java010_ex
클래스명 :  ClassEx007
-- 생성자 작성하시오.
class Calc{
   //상태-멤버변수  :  int num1, num2;  char op;  double result;
   //행위-멤버함수  :  void input()   입력받기
   //               void opcalc() +더하기계산, -라면 -계산  , *라면 *계산 , /라면 /계산 
   //                      void show()    연산출력   
}
public class ClassEx007{
   public static void main(String[] args) {
   Calc  c1= new Calc(10,3,'+');  
   c1.show();
   
   Calc  c2= new Calc();  
   c2.input();   
   c2.show(); 
   }
}
출력내용)
10+3=3

숫자1> 10
숫자2> 3
연산자> /
10/3=3.33
*/