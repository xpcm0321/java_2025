package com.company.java011_ex;

public class Score2Print {
	public void show(Score2[] std) {
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n"
				+ "이름\t 국어\t 영어\t 수학\t 평균\t 합격여부\r\n"
				+ ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("%s\t %d\t %d\t %d\t %.2f\t %s", std[0].getName(), std[0].getKor(), std[0].getEng(), std[0].getMath(), std[0].getAvg(), std[0].getPass());
	}
}