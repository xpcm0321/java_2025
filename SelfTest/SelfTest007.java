package com.company.java011_ex;

import java.util.Scanner;

public class SelfTest007 {
	public static void main(String[] args) {
		String alpha = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("알파벳을 입력해주세요 > ");
		alpha = scanner.next();

		switch (alpha) {
		case "A" : case "a" :
			System.out.println("apple");
			break;
		case "B" : case "b" :
			System.out.println("banana");
			break;
		case "C" : case "c" :
			System.out.println("coconut");
			break;
		}
	}
}
/*
[SelfTest007] SWITCH
		 	a,b,c중에 입력해주세요
		 	a또는 A라면 apple
		 	b또는 B라면 banana
		 	c또는 C라면 coconut
		 	그이외 대소문자 관계없이 a,b,c만 입력가능합니다 
*/