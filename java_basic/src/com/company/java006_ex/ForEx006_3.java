package com.company.java006_ex;

import java.util.Scanner;

public class ForEx006_3 {
	public static void main(String[] args) {
		// 변수
		int num1 = -1, num2 = -1;
		char ch = ' ';
		double result = ' ';
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		/* break (빠져나와!) / continue (밑에꺼 skip)
		 for (;;) { // 1-1. 무한반복
		     // #todo if(잘못썼으면) {숫자1 입력받기} -> if(!(num1 >= 0 && num1 <= 100)) {숫자1 입력받기}
		     // #todo if(잘못썼으면) {숫자2 입력받기}
		     // #todo if(잘못썼으면) {연산자 입력받기}
		     // 1-2. 빠져나올 조건 - 빠져나오기 break
		 }
		 */
		for (;;) {
			if (!(num1 >= 0 && num1 <= 100)) {  // 잘 쓴 범위가 아니라면 입력시도 / 잘 쓴 범위만 입력 X
				System.out.println("1. 정수를 하나 입력해주세요 > ");
				num1 = scanner.nextInt();
			}
			
			// if (!(num2 >= 0 && num2 <= 100))
			else if (num2 < 0 || num2 > 100) {
				System.out.print("2. 정수를 하나 입력해주세요 > ");
				num2 = scanner.nextInt();
			}
			
			else if (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
				System.out.print("연산자를 입력해주세요(+, -, *, /) > ");
				ch = scanner.next().charAt(0);
				continue;
			} else { break; } // num1, num2, ch 잘 쓴 경우
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
//			result = num1 / (double) num2;
//			break;
//		}
		
		// 출력
		System.out.println("" + num1 + ch + num2 + " = " + (ch != '/' ? "" + (int) result : String.format("%.2f", result)));
//		switch (ch) {
//		case '+' :
//			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//			break;
//		case '-' :
//			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//			break;
//		case '*' :
//			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
//			break;
//		case '/' :
//			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
//			break;
//		}
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

무한반복 1개만 쓰기
 
*/