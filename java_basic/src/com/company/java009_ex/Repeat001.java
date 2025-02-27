package com.company.java009_ex;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String[] args) {
		char ch = ' ';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자를 입력해주세요 > ");
		ch = scanner.next().charAt(0);
		
		if (ch == 'j') {
			System.out.println("java");
		} else if (ch == 'h') {
			System.out.println("html");
		} else if (ch == 'c') {
			System.out.println("css");
		}
	}
}
/*
1) 클래스명 : Repeat001
문자를 한개 입력받아
if ver -  'j'이면  java,  'h'이면   html,   'c'이면 css
*/