package com.company.java009_ex;

public class Repeat003 {
	public static void main(String[] args) {
		for (int i = 100; i <= 300; i+=100) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		int i = 100;
		while (i <= 300) {
			System.out.print(i + "\t");
			i += 100;
		}
		System.out.println();
		
		i = 100; 
		do {
			System.out.print(i + "\t");
			i += 100;
		} while (i <= 300);
	}
}
/*
3) 클래스명 : Repeat003
for, while, do while 3가지 버젼으로    100 200 300  출력
*/