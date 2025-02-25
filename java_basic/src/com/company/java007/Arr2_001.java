package com.company.java007;

import java.util.Arrays;

public class Arr2_001 {
	public static void main(String[] args) {
		int [][] arr = { {1, 2, 3},  // 00 01 02
				         {4, 5, 6}   // 10 11 12
		};
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));     // [[I@2f92e0f4, [I@28a418fc]
		System.out.println(Arrays.deepToString(arr)); // [[1, 2, 3], [4, 5, 6]]
		
		// ver-1 눈에 보이는 대로
		System.out.print(arr[0][0] + "\t");
		System.out.print(arr[0][1] + "\t");
		System.out.print(arr[0][2] + "\t");
		System.out.println();
		
		System.out.print(arr[1][0] + "\t");
		System.out.print(arr[1][1] + "\t");
		System.out.print(arr[1][2] + "\t");
		System.out.println();
		
		// ver-2 칸 정리
		for (int kan = 0; kan < 3; kan++) {
			System.out.print(arr[0][kan] + "\t");  //15~17번째 줄 줄이기
		} System.out.println();
		
		for (int kan = 0; kan < 3; kan++) {
			System.out.print(arr[1][kan] + "\t");  //20~22번째 줄 줄이기
		} System.out.println();
		
		// ver-3 층 정리
		for (int ch = 0; ch < 2; ch++) {
			for (int kan = 0; kan < 3; kan++) {
				System.out.print(arr[ch][kan] + "\t");  //15~17번째 줄 줄이기
			} System.out.println();
		} // 이중 for 완성!
	} // end main
} // end class
