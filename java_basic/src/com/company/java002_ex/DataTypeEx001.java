package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx001 {
	public static void main(String[] args) {
		// GIGO
		// 변수 - 입력 - 처리 - 출력
		// 1. 변수
		int age = 0;
		Scanner sc = new Scanner(System.in);
		
		// 2. 입력
		// 당신의 나이를 입력하시오 > _입력받기
		System.out.println("당신의 나이를 입력하시오 > ");
		age = sc.nextInt();
		
		// 3. 처리 X
		// 4. 출력
		// 내 나이는 ** 입니다.
		System.out.println("내 나이는 " +age+ " 입니다.");
		System.out.printf("내 나이는 %d 입니다.", age);
	}
}