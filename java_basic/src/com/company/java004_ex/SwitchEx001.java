package com.company.java004_ex;

import java.util.Scanner;

public class SwitchEx001 {

	public static void main(String[] args) {
		// 변수
		int a;
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.println("숫자 입력 > ");
		a = scanner.nextInt();
		
		//처리 a == 3 / a == 6 / a == 9/ a == 12
		switch (a) {
		case 3:
			System.out.println("봄");
			break;
		case 6:
			System.out.println("여름");
			break;
		case 9:
			System.out.println("가을");
			break;
		case 12:
			System.out.println("겨울");
			break;
		}

	}

}
/*
연습문제1)
패키지명: com.company.java004_ex
클래스명: SwitchEx001
출력내용: switch 이용
   숫자 한 개 입력받아
   3이면 봄
   6이면 여름
   9이면 가을
   12이면 겨울
*/