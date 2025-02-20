package com.company.java004_ex;

import java.util.Scanner;

public class IfEx005_1 {
	public static void main(String[] args) {
		// 변수 - 입력 - 처리 - 출력
		// 문자한개를 입력받아 대문자이면 소문자로, 소문자면 대문자로 변경해서 출력
		
		// 변수
		char ch = ' ';
		Scanner scanner = new Scanner(System.in);
		String result = "알파벳만 입력해주세요!"; 

		// 입력
		System.out.print("문자를 입력하세요 > ");
		ch = scanner.next().charAt(0);
		
		// 처리
		// if (대문자이면) {소문자}로, else if(소문자)면 {대문자}로
		if (ch >= 'A' && ch <= 'Z') { // 대문자이면 소문자로, 소문자면 대문자로
			result = "" + ( ch += 32 );
		} else if (ch >= 'a' && ch <= 'z') {
			result = "" + ( ch -= 32 );
		}
		
		// 출력
		System.out.println(result);
	}
}
/*
연습문제5)
패키지명 : com.company.java004_ex
클래스명 : IfEx005
출력내용 : 문자한개를 입력받아 대문자이면 소문자로, 소문자면 대문자로 변경해서 출력하는 프로그램 작성
             ※ a = 'A' + 32
*/