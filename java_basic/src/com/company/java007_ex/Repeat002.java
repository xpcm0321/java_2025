package com.company.java007_ex;

import java.util.Scanner;

public class Repeat002 {

	public static void main(String[] args) {
		char ch = ' ';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요 > ");
		ch = scanner.next().charAt(0);
		
		switch (ch) {
		case 'a':
			System.out.println("apple");
			break;
		case 'b' :
			System.out.println("banana");
			break;
		case 'c' :
			System.out.println("coconut");
			break;
		}

	}

}
