package com.company.java002_ex;

public class VarEx001 {
	public static void main(String[] args) {
		// 내가 한 답
//		int apple = 1000;
//		System.out.printf("사과 가격은 %d원입니다.", apple);
//		
//		apple = 2000;
//		System.out.printf("\n사과 가격은 %d원입니다.", apple);
		
		// 답
		int apple = 0; // 1-1
		apple = 1000;  // 1-2
		
		System.out.println("사과 가격은" + apple + "원입니다");
		System.out.printf("사과 가격은 %d원입니다.", apple);  // 1-3
		
		apple = 2000; // 1-4
		
		System.out.println("사과 가격은" + apple + "원입니다"); // 1-5
		System.out.printf("사과 가격은 %d원입니다.", apple);
	}
}