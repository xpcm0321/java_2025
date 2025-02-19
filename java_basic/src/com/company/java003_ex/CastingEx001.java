package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx001 {
	public static void main(String[] args) {
		// 변수 - 입력 - 처리 - 출력
		// 변수
		int num1, num2;
		double result;
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		// 숫자 입력1> _입력받기 10 ( ☆자료형을 int )
		// 숫자 입력2> _입력받기 3 ( ☆자료형을 int )
		System.out.print("숫자 입력1 > ");
		num1 = scanner.nextInt();
		
		System.out.print("숫자 입력2 > ");
		num2 = scanner.nextInt();
		
		// 처리
		result = (double) num1 / num2;
		// 출력
		// 10 / 3 = 3.33                              String.format("출력서식", 처리할 값);
		System.out.println( num1 + " / " + num2 + " = " + String.format("%.2f", result));
		System.out.printf("%d / %d = %.2f", num1, num2, (num1 / (float) num2));
	} // end main
} // end class
/*
연습문제1)
패키지명 : com.company.java003_ex
클래스명 : CastingEx001
출력내용 : Scanner 이용해서 나누기 프로그램 만들기
  숫자입력1> _입력받기 10 (☆ 자료형을 int)
  숫자입력2> _입력받기 3 (☆ 자료형을 int)

  10 / 3 = 3.33

  1단계) 변수 - 입력 - 처리 - 출력
  2단계) 정수/정수 = 정수
           정수/실수 = 실수
           실수/정수 = 실수
           실수/실수 = 실수 
*/