package com.company.java009_ex;

import java.util.Arrays;

public class MethodEx006 {
	public static void upper(char [] ch) {
		System.out.println( "2. upper. 배열의 주소 : " + System.identityHashCode(ch) );
		for (int i = 0; i < ch.length; i++) {
			ch[i] -= 32;
		}
	}
	
	public static void main(String[] args) {
		char[] ch = { 'a', 'b', 'c' };
		System.out.println( "main. 배열의 주소 : " + System.identityHashCode(ch) );
		upper(ch);  // A, B, C
		System.out.println( "main. 배열값 : " + Arrays.toString(ch) );
	}
}
/*
연습문제5)  method
패키지명 : com.company.java008_ex
클래스명 :  MethodEx006

public class MethodEx006{ 
    char[] ch = {'a','b','c'};
    upper(ch);   
    System.out.println( "main. 배열값 : " + Arrays.toString(ch) );
}
*/