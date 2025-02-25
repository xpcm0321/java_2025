package com.company.java007_ex;

public class Array2Ex002 {
	public static void main(String[] args) {
		int [][] arr2 = { {101, 102, 103}, {201, 202, 203} };
		
		for (int ch = 0; ch < arr2.length; ch++) {             // 1. 몇 층? int ch=0; ch<2; ch++
			for (int kan = 0; kan < arr2[ch].length; kan++) {  // 2. 몇 칸
				System.out.print(arr2[ch][kan] + "\t");
			} System.out.println();  // 3. 한 층이 끝나고 나면 해야 할 일
		}
	}
}
/*
연습문제10)  array
패키지명 : com.company.java007_ex
클래스명 :  Array2Ex002
배열을 이용하여 다음의 프로그램을 작성하시오.   
  
   int[][] arr2={{101,102,103},{201,202,203}};

   이중for 이용해서 출력하기
*/