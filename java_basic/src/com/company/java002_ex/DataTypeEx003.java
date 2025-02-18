package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx003 {
	public static void main(String[] args) {
		// 변수-입력-처리-출력
		// 변수 ( 7자리 float / 15자리 double)
		float pi = 0.0f;
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.print("파이 값을 입력하시오 > ");
		pi = scanner.nextFloat();
		
		// 처리  X
		// 출력
		System.out.println("파이 값은 " +pi+ "입니다.");
		System.out.printf("파이 값은 %f 입니다.\n", pi);
		System.out.printf("파이 값은 %.2f 입니다.\n", pi);
		System.out.printf("파이 값은 %.3f 입니다.\n", pi);
	}
}