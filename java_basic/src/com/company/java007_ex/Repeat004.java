package com.company.java007_ex;

public class Repeat004 {

	public static void main(String[] args) {
		// 4) 클래스명 : Repeat004
		// 1. 배열명 : arr
		// 2. 값 : 1, 2, 3
		// 3. for + length 를 이용하여 배열안의 1, 2, 3 
		int[] arr = {1, 2, 3};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

	}

}
