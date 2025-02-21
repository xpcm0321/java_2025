package com.company.java005_ex;

import java.util.Scanner;

public class Repeat006 {

	public static void main(String[] args) {
		// ReapeatEx006 - 무한반복을 하는데 9를 입력받으면 종료
		Scanner scanner = new Scanner(System.in);
		
		for (;;) {
			System.out.println("숫자 9를 입력하시오 > ");
			int a = scanner.nextInt();
			if (a == 9 ) {break;}
		}
		for (int i = 1; i <= 10; i++) {
			if (i == 3) {break;}
			System.out.print(i + "\t");
		}
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
			if (i == 3) {continue;}
			System.out.print(i + "\t");
		}

	}

}
