package com.company.java009_ex;

public class Repeat006 {
	public static void hi() { System.out.println("hi"); }
	public static void hi(int i) { System.out.println("hi " + i + "님!"); }
	public static String hi(String str) { return "hi " + str; }
	
	public static void main(String[] args) {
		hi(); // hi 출력
		hi(1); // hi 1 님! 출력
		System.out.println(hi("sally")); // hi sally 출력
	}
}
/*
7) 다음의 메서드를 정의 하시오.
 
public static void main(String[] args){
    hi();   // hi 출력
    hi(1);   // hi 1 님! 출력
    System.out.println( hi("sally") );   // hi sally 출력

}
*/