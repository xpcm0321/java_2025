package com.company.java006_ex;

import java.util.Scanner;

public class Repeat002 {
	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력 > ");
		a = scanner.nextInt();
		
		switch (a) {
		case 10 :
			System.out.println("10이다.");
			break;
		case 20 :
			System.out.println("20이다.");
			break;
		case 30 :
			System.out.println("30이다.");
			break;
		}
	}
}
/*
switch ver - a가 10이면 10이다, 20이면 20이다, 30이면 30이다.
*/