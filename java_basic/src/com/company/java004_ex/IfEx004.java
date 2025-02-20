package com.company.java004_ex;

import java.util.Scanner;

public class IfEx004 {
	public static void main(String[] args) {
		// 변수 - 입력 - 처리 - 출력
		// 문자한개를 입력받아 대문자인지, 소문자인지 판별하는 프로그램 작성
		
		// 변수
		char ch = ' ';  // ch = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.print("문자를 입력하세요 > ");
		// ch = 'A';   문자 한 개 'A' / String str = "abc" 문자열
		ch = scanner.next().charAt(0);
		
		// 처리
		// 출력
		if ( (ch >= 'A' && ch <= 'Z') ) {
			System.out.println("대문자입니다.");
		} else if ( (ch >= 'a' && ch <= 'z') ) {
			System.out.println("소문자입니다.");
		} else { // 추가한 거
			System.out.println("알파벳만 입력가능합니다!");
		}
	}
}
/*
연습문제4)
패키지명 : com.company.java004_ex
클래스명 : IfEx004
출력내용 : 문자한개를 입력받아 대문자인지, 소문자인지 판별하는 프로그램 작성
             ※ 대문자 ch >= 'A' && ch <= 'Z' / 소문자 ch >= 'a' && ch <= 'z'
*/