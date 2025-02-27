package com.company.java009_ex;

import java.util.Scanner;

public class Repeat002 {
	public static void main(String[] args) {
		char ch = ' ';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자를 입력해주세요 > ");
		ch = scanner.next().charAt(0);
		
		switch (ch) {
		case 'j' :
			System.out.println("java");
			break;
		case 'h' :
			System.out.println("html");
			break;
		case 'c' :
			System.out.println("css");
			break;
		}
	}
}
/*
2) 클래스명 : Repeat002
문자를 한개입력받아
switfh ver-   'j'이면  java,  'h'이면   html,   'c'이면 css
*/