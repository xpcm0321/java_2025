package com.company.java008_ex;

public class Repeat003 {
	public static void main(String[] args) {
		int [] arr = new int [3];
		
		int data = 10;
		for (int ch = 0; ch < arr.length; ch++) {
			arr[ch] = data;
			data += 10;
		}
		
		for (int ch = 0; ch < arr.length; ch++) {
			System.out.print(arr[ch] + "\t");
		}
	}
}
/*
3) 클래스명 : Repeat003
0. new를 이용하여 다음과 배열을 작성한다.
1. 배열명 : arr
2. 값     : 10,20,30
3. for + length 를 이용하여  배열안의 10,20,30을 출력하시오.
*/