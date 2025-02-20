package com.company.java004_ex;

import java.util.Scanner;

public class IfEx007_1 {
	public static void main(String[] args) {
		// 계산기
		// 변수 - 입력 - 처리 - 출력
		
		// 변수
		int num1, num2;
		char ch;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.println("1. 정수를 하나 입력해주세요 > ");
		num1 = scanner.nextInt();
		
		System.out.println("2. 정수를 하나 입력해주세요 > ");
		num2 = scanner.nextInt();
		
		System.out.println("3. 연산자를 하나 입력해주세요(+, -, *, /) > ");
		ch = scanner.next().charAt(0);
		
		// 처리
		if (ch == '+') {
			result = "" + (num1 + num2);
		} else if (ch == '-') {
			result = "" + (num1 - num2);
		} else if (ch == '*') {
			result = "" + (num1 * num2);
		} else if (ch == '/') {
			result = String.format("%.2f", (num1 / (float) num2));
		}
		
		// 출력
		System.out.println("" + num1 + ch + num2 + " = " + result);
	}
}
/*
연습문제7)
패키지명 : com.company.java004_ex
클래스명 : IfEx007
출력내용 : 계산기

1. 정수를 하나 입력해주세요 > 10
2. 정수를 하나 입력해주세요 > 3
3. 연산자를 하나 입력해주세요(+, -, *, /) > +
10 + 3 = 13

1. 정수를 하나 입력해주세요 > 10
2. 정수를 하나 입력해주세요 > 3
3. 연산자를 하나 입력해주세요(+, -, *, /) > -
10 - 3 = 7
*/