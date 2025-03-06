package com.company.java011_ex;

public class SelfTest015 {

	public static void main(String[] args) {
		int [] arr = new int [5];
		
		int data = 1;
		for (int ch = 0; ch < arr.length; ch++) {
			arr[ch] = data++;
			System.out.print(arr[ch] + "\t");
		}
		
		System.out.println();
		data = 1;
		for (int kan = 0; kan < arr.length; kan++) {
			arr[kan] = data++;
			System.out.print(arr[kan] + "\t");
		}
	}

}
/*
[SelfTest015] 배열(1)
		    1. 숫자형공간이 5개인  배열 arr 만들기
		    2. for구문을 이용하여  1~5까지 입력
		    3. for구문을 이용하여  1~5까지 출력
*/