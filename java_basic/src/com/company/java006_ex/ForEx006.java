package com.company.java006_ex;

import java.util.Scanner;

public class ForEx006 {
	public static void main(String[] args) {
		// 변수
		int num1 = 0, num2 = 0;
		char ch = ' ';
		double result = ' ';
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		for (;;) {
			System.out.print("1. 정수를 하나 입력해주세요 > ");
			num1 = scanner.nextInt();
			if (num1 >= 0 && num1 <= 100) {break;}
		}
		
		for (;;) {
			System.out.print("2. 정수를 하나 입력해주세요 > ");
			num2 = scanner.nextInt();
			if (num2 >= 0 && num2 <= 100) {break;}
		}
		
		for (;;) {
			System.out.print("연산자를 입력해주세요(+, -, *, /) > ");
			ch = scanner.next().charAt(0);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {break;}
		}
		
		// 처리
		if (ch == '+') {
			result = num1 + num2;
		} else if (ch == '-') {
			result = num1 - num2;
		} else if (ch == '*') {
			result = num1 * num2;
		} else if (ch == '/') {
			result = num1 / (double) num2;
		}	
		
//		switch (ch) {
//		case '+' :
//			result = num1 + num2;
//			break;
//		case '-' :
//			result = num1 - num2;
//			break;
//		case '*' :
//			result = num1 * num2;
//			break;
//		case '/' :
//			result = num1 / num2;
//			break;
//		}
		
		// 출력
		System.out.println("" + num1 + ch + num2 + " = " + (ch != '/' ? "" + (int) result : String.format("%.2f", result)));
	}
}
/*
연습문제6)  for 무한반복
패키지명 : com.company.java004_ex
클래스명 :  ForEx006
출력내용 :  계산기

1)  각 연산자에 맞게 계산처리
2)  숫자1, 숫자2는 0~100사이만 입력가능하게 아니면 무한반복
3)  연산자는 +, - ,*, /만 입력가능하게 아니면 무한반복
     

1. 정수를 하나 입력해주세요 > 10
2. 정수를 하나 입력해주세요 > 3
3. 연산자를 입력해주세요(+,-,*,/) > +
10+3=13
 
*/