package com.company.java005_ex;

public class ForEx003_1 {

	public static void main(String[] args) {
		// 변수
		int sum = 0;
		String result = "";
		
		// 입력
		// 처리 1~10까지의 합을 구하시오.
		// ver-1
		// sum에 1누적 / "" 1 출력
		// sum에 2누적 / "" 2 출력
		// sum에 3누적 / "" 3 출력
		
		// ver-2
//		sum += 1; System.out.print("" + 1);
//		sum += 2; System.out.print("" + 2);
//		sum += 3; System.out.print("" + 3);
		
		// ver-3 {}  {변수}  for (시작; 종료; 변화)
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print((i == 1 ? "" : " + ") + i);
		}
		// 출력
 		System.out.println(" = " + sum);
	}
} // ctrl + shift + f 줄 정렬
/*
연습문제3)  
패키지명 : com.company.java005_ex
클래스명 :  ForEx003
출력내용 :   for 이용
1~10까지의 합을 구하시오.
3번문제 업그레이드 : upgrade)  시간나면 도전!
1+2+3+4+5+6+7+8+9+10=55
*/