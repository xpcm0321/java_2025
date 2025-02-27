package com.company.java009_ex;

public class Repeat005 {
	public static void main(String[] args) {
		char [][] arr2 = new char[2][3];
		
		char data = 'a';
		for (int ch = 0; ch < arr2.length; ch++) {
			for (int kan = 0; kan < arr2[ch].length; kan++) {
				arr2[ch][kan] = data++;
			}
		}
		
		for (int ch = 0; ch < arr2.length; ch++) {
			for (int kan = 0; kan < arr2[ch].length; kan++) {
				System.out.print(arr2[ch][kan] + "\t");
			}
			System.out.println();
		}
	}
}
/*
5) 클래스명 : Repeat005
0. new를 이용하여 다음과 배열을 작성한다.
1. 배열명 : arr2
2. 값     :  {a,b,c}, {d,e,f}
3. for + length 를 이용하여  배열안의 값을을 출력하시오.
*/