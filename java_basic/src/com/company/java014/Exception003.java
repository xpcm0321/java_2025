package com.company.java014;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception003 {
	public static void main(String[] args) {
		int a = -1;
		Scanner scanner = new Scanner(System.in);
		// 1을 입력받을 때까지 무한반복
		while(true) {
			try {
			System.out.println("숫자1 입력 > ");
			a = scanner.nextInt();  // 1. nextInt() 숫자입력받기를 기다림
									// 2. 'a'
			if(a==1) {break;}
			} catch(InputMismatchException e) {
				scanner.next();  // 3. a 처리
				System.out.println("숫자만입력가능합니다.");
			}
		}
		System.out.println("결과물 : " + a);
	}
}
/*
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:964)
	at java.base/java.util.Scanner.next(Scanner.java:1619)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
	at com.company.java014.Exception003.main(Exception003.java:12)
*/