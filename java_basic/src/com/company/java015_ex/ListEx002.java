package com.company.java015_ex;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx002 {
	public static void main(String[] args) {
		ArrayList<String> numbers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		
		System.out.println("1, 2, 3 중에 입력해주세요 > ");
		int num = sc.nextInt();
		
		if (num == 1) {
			System.out.println(numbers.get(0));
		} else if (num == 2) {
			System.out.println(numbers.get(1));
		} else if (num == 3) {
			System.out.println(numbers.get(2));
		}
		System.out.println();
		
		switch (num) {
		case 1:
			System.out.println(numbers.get(0));
			break;
		case 2:
			System.out.println(numbers.get(1));
			break;
		case 3:
			System.out.println(numbers.get(2));
			break;
		}
		System.out.println();
		
		// for (int i = 1; i < 3; i++) {}
		for (int i = 0; i < numbers.size(); i++) {
			if (num == i) {
				System.out.println(numbers.get(i - 1));
				break;
			}
		}
		System.out.println();
		
		System.out.println(numbers.get(num-1));
	}
}
/*
연습문제2)  Collection  Framework
패키지명 : com.company.java015_ex
클래스명 : ListEx002
1.  numbers ArrayList 만들기
2.  one, two, three 데이터 추가
3.  사용자에게 1,2,3 입력받기
4.  1을입력받으면 one 출력
    2를입력받으면 two 출력
    3을입력받으면 three 출력
*/