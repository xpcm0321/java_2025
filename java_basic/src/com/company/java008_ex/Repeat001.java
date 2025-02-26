package com.company.java008_ex;

public class Repeat001 {
	public static void main(String[] args) {
		byte b1 = 1;
		byte b2 = 2;
		
		byte result1 = (byte) (b1 + b2);
		int result2 = b1 + b2;
		// 답1 : byte result1 = (byte) (b1 + b2);  byte result1 = b1 + b2;
		// 답2 : int result2 = b1 + b2;            byte result2 = b1 + b2;
		// byte 는 1byte. b1과 b2를 더하면 2byte가 되기 때문에 byte result 가 넘쳐서 타입캐스팅을 해야 한다.
	}
}
/*
1) 클래스명 : Repeat001
다음 오류를 해결하시오.  오류가 나는 이유는?
byte b1=1;   byte b2=2;   byte result = b1+b2;
*/