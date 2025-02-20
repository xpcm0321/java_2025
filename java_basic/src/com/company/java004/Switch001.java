package com.company.java004;

import java.util.Scanner;

public class Switch001 {
	public static void main(String[] args) {
		// 변수
		int a;
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.print("숫자 입력 > ");
		a = scanner.nextInt();
		
		// 처리 (if / switch / for, while, do while)
		// if ver = a가 1이면 1이다, 2이면 2이다, 3이면 3이다
		if ( a == 1 ) {                // if
			System.out.println("1이다");
		} else if ( a == 2 ) {         // else 아니라면
			System.out.println("2이다");
		} else if ( a == 3 ) {
			System.out.println("3이다");
		}
		
		System.out.println();
		System.out.println();
		
		// switch는 break를 만날 때 나옴
		switch (a) {
		case 1 :
			System.out.println("1이다");    // a==1
			break;
		case 2 :
			System.out.println("2이다");    // a==2
			break;
		case 3 :
			System.out.println("3이다");    // a==3
			break;
		}
		
		// 출력
	} // end main
} // end class

//if ver = a가 1이면 1이다, 2이면 2이다, 3이면 3이다