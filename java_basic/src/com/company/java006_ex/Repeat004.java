package com.company.java006_ex;

import java.util.Scanner;

public class Repeat004 {
	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		
		for (;;) {
			System.out.println("숫자 입력 > ");
			a = scanner.nextInt();
			if (a == 1) { break; }
		}
	}
}
/*
무한반복을 이용하여 1을 입력받을 때까지 무한반복이 되는 프로그램 작성
*/