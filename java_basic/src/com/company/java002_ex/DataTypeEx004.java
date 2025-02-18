package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx004 {
	public static void main(String[] args) {
		// 변수-입력-처리-출력
		// 변수
		int kor, eng, math, total;
		double avg;
		Scanner scanner = new Scanner(System.in);
		
		// 입력 - 국, 영, 수
		// 국어점수를 입력하시오. _입력받기 100
		System.out.print("국어 점수를 입력하세요 > ");
		kor = scanner.nextInt();
		
		// 영어점수를 입력하시오. _입력받기 100
		System.out.print("영어 점수를 입력하세요 > ");
		eng = scanner.nextInt();
		
		// 수학점수를 입력하시오. _입력받기 99
		System.out.print("수학 점수를 입력하세요 > ");
		math = scanner.nextInt();
		
		// 처리 - 총점, 평균 A = B (B를 처리해ㅓ A에 담기 - 대입)
		total = kor + eng + math;
		avg = (float) total / 3;   // 정수/정수 = 정수   299/3  몫 해경방안) 정수/실수, 실수/정수  // avg = total / 3.0
		
		// 출력 - 총점, 평균 출력
		System.out.printf("총점 : %d \n평균 : %.2f", total, avg);
		
	}
}