package com.company.java003;

import java.util.Scanner;

public class Casting002 {
	public static void main(String[] args) {
		// #1. 문자초기와
		// 문자는 저장 시 숫자 / 출력 시 문자
		char ch1 = ' '; // 공백 한 개라도 있어야 함
		char ch2 = '\u0000';
		
		System.out.println("step1 : " + ch1 + "\t" + ch2);  //    \t 탭 누른 효과
		System.out.println("step2 : " + (int)ch1 + "\t" + (int)ch2);
		
		// #2. 문자의 연산자
		char c = 'A';
		System.out.println("step3 : " + c + "\t" + (int)c);  // 65
		
		System.out.println("step4 : " + (c + 1) );  // 66
		// 1)     +   더하기 연산
		// 2) 숫자 + 숫자    더하기
		// 3)  'A' + 1   = 'A' (char | 2byte) + 1(int | 4byte)
		// 4)  결과물 int
		System.out.println("step5 : " + (char)(c + 1) );   // B
		// A(65) - B(66) - C(67)
		
		// byte - short(2byte) / char(2byte) - int
		// byte ex1= 1;
		// error) byte result1 = ex1 + 10;  // byte(1) + int(4)
		// 해결) int result1 = ex1 + 10;
		
		// Q1) 대문자'A'를 소문자'a'로 변환시키기
		System.out.println("A1-1 : " + 'A' + "\t" + (int)'A');  // A 65
		System.out.println("A1-2 : " + 'a' + "\t" + (int)'a');  // a 97
		// a A + 32
		System.out.println("A1-3 : " + (char)('A' + 32));   //char : 2byte + int : 4byte
		
		char q1 = 'A';
		System.out.println("A1-4 : " + (q1+=32));
		// q1 += 32    +더하기를 하고 =대입 q1의 자료형은 char
				
 		// #3. 문자열
		// 자료형의 분류는 기본형(값)과 참조형(주소)
		String str1 = "abc";  // 객체 사용 시              str1 주소
		Scanner scanner = new Scanner(System.in); // scanner 주소
		
		System.out.println(str1);
		System.out.println(scanner);
		
		System.out.println(str1.charAt(0)); //a
		System.out.println(str1.charAt(1)); //b
		System.out.println(str1.charAt(2)); //c
		
		// char ch = scanner.nextChar(); //X
		String str = scanner.next();
		System.out.println("입력한 문자열 : " + str);
		
		char ch = scanner.next().charAt(0);
		      //  scanner.next() 문자열 입력 / charAt(0) 첫번째 문자
		System.out.println("입력한 문자 : " + ch);
		
		// Q2. 대문자 입력 받아서 소문자로 변경하는 프로그램  CastingEx003.java
		
	} //end main
} // end class
