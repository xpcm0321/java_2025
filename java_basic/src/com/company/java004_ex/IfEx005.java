package com.company.java004_ex;

import java.util.Scanner;

public class IfEx005 {
	public static void main(String[] args) {
		// 변수 - 입력 - 처리 - 출력
		// 문자한개를 입력받아 대문자이면 소문자로, 소문자면 대문자로 변경해서 출력
		
		// 변수
		char ch = ' ';
		Scanner scanner = new Scanner(System.in);

		// 입력
		System.out.print("문자를 입력하세요 > ");
		ch = scanner.next().charAt(0);
		
		// 처리
		// 출력
		// if (대문자이면) {소문자}로, else if(소문자)면 {대문자}로
		if (ch >= 'A' && ch <= 'Z') { // 대문자이면 소문자로, 소문자면 대문자로
			System.out.println(ch = (char) (ch + 32));
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch = (char) (ch - 32));
		} else { // 추가한 거
			System.out.println("알파벳만 입력해주세요!");
		}
	}
}
/*
연습문제5)
패키지명 : com.company.java004_ex
클래스명 : IfEx005
출력내용 : 문자한개를 입력받아 대문자이면 소문자로, 소문자면 대문자로 변경해서 출력하는 프로그램 작성
             ※ a = 'A' + 32
*/