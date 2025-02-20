package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008 {
	public static void main(String[] args) {
		// 변수 - 입력 - 처리 - 출력
		// 성적처리 프로그램
		
		// 변수
		// stdid : 학번, pass : 합격 / 불합격, sch : 장학생
		// kor : 국어, eng : 영어, math : 수학, total : 총합, level : 레벨
		// avg : 평균
		
		String stdid, pass, sch = "", level;
		int kor, eng, math, total;
		double avg;
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.println("학번을 입력하시오 > ");
		stdid = scanner.next();
		
		System.out.println("국어 점수를 입력하시오 > ");
		kor = scanner.nextInt();
		
		System.out.println("영어 점수를 입력하시오 > ");
		eng = scanner.nextInt();
		
		System.out.println("수학 점수를 입력하시오 > ");
		math = scanner.nextInt();
		
		// 처리
		total = kor + eng + math;
		avg = total / 3.0;
		
		// 출력
		// 출력-1  if(평균이 60점이상이고 각과목이 40점 미만이면 아니)라면 { 합격 } 아니면 else { 불합격 }
		if ( (avg >= 60) && (kor > 40) && (eng > 40) && (math > 40)) {
//			System.out.println("합격");
			pass = "합격";
		} else {
//			System.out.println("불합격");
			pass = "불합격";
		}
		
		// 출력-1  if(평균이 95점이상)이면 { 장학생 }
		if (avg >= 95) {
//			System.out.println("장학생");
			sch = "장학생";
		}
		
		// 출력-1  if(평균이 90점이상)이면 { 수 }, else if(80점이상)이면 { 우 }, else if(70점이상)이면 { 미 }, else if(60점이상)이면 { 양 }, 아니라면 else { 가 }
		if (avg >= 90) {
//			System.out.println("수");
			level = "수";
		} else if (avg >= 80) {
//			System.out.println("우");
			level = "우";
		} else if (avg >= 70) {
//			System.out.println("미");
			level = "미";
		} else if (avg >= 60) {
//			System.out.println("양");
			level = "양";
		} else {
//			System.out.println("가");
			level = "가";
		}
		// ver2
		// level = (avg >= 90) ? "수" : (avg >= 80) ? "우" : (avg >= 70) ? "미" : (avg >= 60) ? "양" : "가";
		
		System.out.println("=================================================================================== \r\n"
				+ "학번\t 국어\t 영어\t 수학\t 총점\t 평균\t 합격여부\t 레벨\t 장학생\r\n"
				+ "=================================================================================== ");
//		System.out.println(stdid + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + avg + "\t" + pass + "\t" + level + "\t" + sch);
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %.2f\t %s\t %s\t %s\t", stdid, kor, eng, math, total, avg, pass, level, sch);
	}
}
/*
연습문제8)  ※ 숙제
패키지명 : com.company.java004_ex
클래스명 :  IfEx008
출력내용 :  성적처리 프로그램입니다.

1. 총점 구하기
2. 평균 구하기
3. 평균이 60점이상이고  각과목이 40점 미만이면 아니라면 합격/ 아니면 불합격
4. 평균이 95점이상이면 장학생
5. 평균이 90점이상이면 수, 80점이상이면 우, 70점이상이면 미, 60점이상이면 양, 아니라면 가 

학번 입력 > std111
국어점수 입력 > 100
수학점수 입력 > 100
영어점수 입력 > 99
=================================================================================== 
학번   국어   영어   수학   총점   평균   합격여부   레벨   장학생
=================================================================================== 
std111   100   100   99   299   99.67   합격   수   장학생
*/