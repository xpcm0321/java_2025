package com.company.java009_ex;

public class Method005_ex {
	public static int add(int x, int y) { return x + y; }
	
	public static int add(byte x, byte y) { return x + y; }  // 1
	public static int add(short x, short y) { return x + y; }  // 2
	// public static long add(int x, int y) { return x + y; }  // 3
	public static long add(long x, long y) { return x + y; }  // 4
	
	public static void main(String[] args) {
		// 1, 2, 3, 4 에서 오류나는 번호와 이유는?
		// 메서드 오버로딩 : 이름이 같고, 파라미터가 다름
		// 3. 위에 있는 public static int add(int x, int y) { return x + y; }랑 파라미터가 같아서

	}

}
