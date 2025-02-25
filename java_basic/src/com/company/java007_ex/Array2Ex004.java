package com.company.java007_ex;

public class Array2Ex004 {
	public static void main(String[] args) {
		char [][] arr = new char[2][3];  //2층 3칸
		
//		char data = 'A';
//		for (int ch = 0; ch < arr.length; ch++) {  // #1. 층의 정보
//			for (int kan = 0; kan < arr[ch].length; kan++) { // #2. 칸의 정보
//				arr[ch][kan] = data++;
//				System.out.print(arr[ch][kan] + "\t");
//			}
//			data = 'B';
//			System.out.println(); // #3. 한 층이 끝나고 나면 해야 할 일
//		}
		char data = 'A';
		for (int c = 0; c < arr.length; c++) {
			for (int kan = 0; kan < arr[c].length; kan++) {
				arr[c][kan] = data++;
			}
			data = 'B';
		}
		for (int c = 0; c < arr.length; c++) {
			for (int kan = 0; kan < arr[c].length; kan++) {
				System.out.print(arr[c][kan] + "\t");
			}
			System.out.println();
		}
	}
}
/*
연습문제12)  array
패키지명 : com.company.java007_ex
클래스명 :  Array2Ex004
배열을 이용하여 다음의 프로그램을 작성하시오.   
1. new 연산자 이용하여 다차원배열만들기
2. for + length 이용해서 대입   
3. for + length 이용해서 출력 
   A   B   C
   B   C   D
*/