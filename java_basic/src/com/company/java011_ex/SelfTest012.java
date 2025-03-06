package com.company.java011_ex;

import java.util.Scanner;

public class SelfTest012 {
	public static void main(String[] args) {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		for (;;) {
			System.out.print("숫자를 입력해주세요 > ");
			num = scanner.nextInt();
			while (num >= 100) { break; }
		}
	}
}
/*
[SelfTest012] while
		 * 1~100사이를 입력할때까지 무한반복하기 
		 * 만약 1~100사이를 입력하면 빠져나오기
*/