package com.company.java006;

public class Repeat002_while_dowhile {
	public static void main(String[] args) {
		// 1. for  ( 반복 횟수를 알 때 )
		// 1   2   3  {반복}  {변수}  for (시작; 종료; 변화)
		for (int i = 1; i <= 3; i++) {
			System.out.print( i + "\t" );
		}
		System.out.println();
		
		// 2. while ( 반복 횟수를 모를 때 : 게시판 )  while 초기값 위로, 증감문 맨 끝
		int i = 1;
		while ( i <= 3 ) {
			System.out.print( i + "\t" );
			 i++;
		}
		System.out.println();
		
		// 3. do while ( 무조건 1번은 실행해야 할 때 )  do while 은 while 위치를 맨 끝
		i = 1;
		do {
			System.out.print( i + "\t" );
			 i++;
		} while ( i <= 3 );
		System.out.println();
		
	} // end main
} // end class