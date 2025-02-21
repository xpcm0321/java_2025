package com.company.java005_ex;

import java.util.Scanner;

public class ForEx002 {

	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원하는 단을 입력해주세요 > ");
		a = scanner.nextInt();
		
		for ( int i = 1; i <= 9; i++ ) {
			System.out.println(a + " * " + i + " = " + (a*i));
		}
//		System.out.println(a + "*" + 1 + "=" + (a*1));
//		System.out.println(a + "*" + 2 + "=" + (a*2));
//		System.out.println(a + "*" + 3 + "=" + (a*3));
	}
}
/*
연습문제2)  
패키지명 : com.company.java005_ex
클래스명 :  ForEx002
출력내용 :   for 이용

   사용자에게 단을 입력받아 해당하는 
   단을 출력해주는 프로그램을 작성하시오. FOR문을 이용하시오.
*/