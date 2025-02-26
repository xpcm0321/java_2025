package com.company.java008_ex;

public class Array2Ex008 {
	public static void main(String[] args) {
		int [][] arr2 = new int [4][4];
		
		int data = 1;
		/* for (int ch = 0; ch < arr2.length; ch++) {
			for (int kan = 0; kan < arr2[ch].length; kan++) {
				arr2[ch][kan] = data++;
			}
			data = 1;
		}
		
		for (int ch = 0; ch < arr2.length; ch++) {
			for (int kan = 0; kan < arr2[ch].length; kan++) {
				System.out.print(arr2[ch][kan] + "\t");
			}
			System.out.println();
		} */
		
		for (int ch = 0; ch < arr2.length; ch++) {
			for (int kan = 0; kan < arr2[ch].length; kan++) {
				arr2[ch][kan] = data++;
				System.out.print(arr2[ch][kan] + "\t");
			}
			data = 1;
			System.out.println();
		}
		
	}
}
/*
연습문제16)  array
패키지명 : com.company.java007_ex
클래스명 :  Array2Ex008
> 2차원배열   4*4
1.  new 로 만들고 
2.  데이터 넣기  for+length
3.  데이터 출력  for+length
1   2   3   4
1   2   3   4
1   2   3   4
1   2   3   4
*/