package com.company.java003_ex;

import java.util.Scanner;

public class Repeat003 {
	public static void main(String[] args) {
		// 변수
		int kor, eng, math, sum;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.print("국어 점수를 입력하세요 > ");
		kor = scanner.nextInt();
		
		System.out.print("영어 점수를 입력하세요 > ");
		eng = scanner.nextInt();
		
		System.out.print("수학 점수를 입력하세요 > ");
		math = scanner.nextInt();
		
		// 처리
		sum = kor + eng + math;
		avg = (float) sum / 3;
		
		// 출력
		System.out.printf("총점 : %d \n평균 : %.2f", sum, avg);
	}
}