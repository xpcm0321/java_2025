package com.company.java005_ex;

public class ForEx005 {

	public static void main(String[] args) {
		// 1~10까지 3의 배수 갯수를 출력
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			if ( i % 3 == 0 ) {
				total++;
			}
		}
		System.out.println("1~10까지 3의 배수 개수 : " + total + "개");
		
		// 소문자 a~z 까지 모음(a, e, i, o, u)의 갯수를 출력
//		for (int i ='a'; i <= 'z'; i++) {
//			System.out.print( (char) i);
//		}
	}
}

/*
연습문제5)  
패키지명 : com.company.java005_ex
클래스명 :  ForEx005
출력내용 :   for 이용
소문자 a~z 까지 모음의 갯수를 출력
*/