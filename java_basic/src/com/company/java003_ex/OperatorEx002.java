package com.company.java003_ex;

import java.util.Scanner;

public class OperatorEx002 {
	public static void main(String[] args) {
		int x;
		char ch = ' ';
		
		Scanner scanner = new Scanner(System.in);
		
		// int형 변수 x가 3보다 크고 10보다 작을 때 true인 조건식
		System.out.println("3~10까지의 숫자 중 아무거나 입력하세요 > ");
		x = scanner.nextInt();
		System.out.print( (x > 3) && (x < 10) );
		
		// char형 변수 ch가 'a' 또는 'A'일 때 true인 조건식
		System.out.println("\n대문자A나 소문자a를 입력하세요 > ");
		ch = scanner.next().charAt(0);
		System.out.println( (ch == 'a') || (ch == 'A') );
		
		// char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식
		System.out.println("\n숫자(0 ~ 9) 중 입력하세요 > ");
		ch = scanner.next().charAt(0);
		System.out.println( (ch >= '0') && (ch <= '9') );
		
		// char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		System.out.println("\n대문자나 소문자를 입력하세요 > ");
		ch = scanner.next().charAt(0);
		
		// 유니코드로 변환           대문자 A~Z(65~90)           소문자 a~z(97~122)
		System.out.println( (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) );
		
		// int x = 5;
		// System.out.println( "q1 : " + ( x > 3 && x < 10 ) );
		// char ch = '\u0000';
		// ch = 'a';
		// System.out.println( "q2 : " + ( ch == 'a' || ch == 'A' ) );
		// System.out.println( "q3 : " + ( ch >= '0' && ch <= '9' ) );
		// System.out.println( "q4 : " + ( ch >= 'A' && ch <= 'Z' ) ||
							          //   ch >= 'a' && ch <= 'z' ) );
	}
}
/*
연습문제2)
클래스명 : OperatorEx002
 q1-1 int형 변수 x가 3보다 크고 10보다 작을 때 true인 조건식
 q1-2 char형 변수 ch가 'a' 또는 'A'일 때 true인 조건식
 q1-3 char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식
 q1-4 char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식 
*/