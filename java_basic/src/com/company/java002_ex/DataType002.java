package com.company.java002_ex;

import java.util.Scanner;

public class DataType002 {
	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("좋아하는 수(정수)를 입력하시오 > ");
		a = scanner.nextInt();
		
		System.out.printf("좋아하는 숫자는 %d 입니다.", a);
	}
}