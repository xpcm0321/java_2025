package com.company.java009;

import java.util.Arrays;

public class Method004 {
	public static void show(int a) { System.out.println(a * 10); }
	
	public static void show(int a, int b, int c) {
		System.out.println(a * 100 + "\t" + b * 100 + "\t" + c * 100);
		}
	
	public static void main(String[] args) {
		int [] a = {1, 2, 3};
		// [heap]1번지{0:1, 1:2, 2:3}  ← [stack]a:1번지
		
		// public static 리턴값 메서드명(파라미터) { 해야할 일 }
		// public static void show(int a) { System.out.println(a * 10); }
		show ( 1 );
		show(a[0]);   // 10출럭
		
		// public static void show(int a, int b, int c) { 해야할 일 값 * 100 }
		show (1, 2, 3); // 값 - value → call by value
		show(a[0], a[1], a[2]);   // 100, 200, 300출럭
		
		System.out.println( "main1. 배열 값 : " + Arrays.toString(a) );
		System.out.println( "main2. 배열의 주소값 : " + System.identityHashCode(a) );  // 531885035
		
		// public static void show(int [] a) {}
		show(a);  // 주소 - reference → call by reference
		System.out.println( "main4. 배열 값 : " + Arrays.toString(a) );
		// Q1. 위에 메서드 작성
		// Q2. 메서드 이름이 같고, 파라미터가 다르면 ? ( 오버로딩 )
	}
	public static void show(int [] a) {
		System.out.println( "show3. 배열의 주소값 : " + System.identityHashCode(a) );
		// a[0] += 10; a[1] += 10; a[2] += 10;
		for (int i = 0; i < a.length; i++) {
			a[i] += 10;
		}
	}
}
