package com.company.java015_ex;

import java.util.Scanner;

public class SelfTest010 {
	public static int nextInt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1을 입력하세요 > ");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		int one = 0;
		while (true) {
			one = nextInt();
			if (one == 1) {
				break;
			}
		}
	}
}