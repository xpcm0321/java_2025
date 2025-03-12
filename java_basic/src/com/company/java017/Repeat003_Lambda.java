package com.company.java017;

interface InterTest21 { void test(); }
interface InterTest22 { void test(int a); }
interface InterTest23 { int test(); }
interface InterTest24 { int test(int a); }

public class Repeat003_Lambda {
	public static void main(String[] args) {
		// 람다식으로 구현
		// Q1. test1.test();						// 안녕
		/*
		InterTest21 test1 = ()->{
			System.out.println("안녕");
		};
		*/
		InterTest21 test1 = ()-> System.out.println("안녕");
		test1.test();
		// Q2. test2.test(2);						// 안녕안녕
		/*
		InterTest22 test2 = (a)->{
			System.out.println("안녕".repeat(a));
		};
		*/
		InterTest22 test2 = a-> System.out.println("안녕".repeat(a));
		test2.test(2);
		// Q3. System.outl.println(test3.test());   // 3
		/*
		InterTest23 test3 = ()->{
			return 3;
		};
		*/
		InterTest23 test3 = ()-> 3;
		System.out.println(test3.test());
		// Q4. System.outl.println(test4.test(3));	// 30
		/*
		InterTest24 test4 = (a)->{
			return a*10;
		};
		*/
		InterTest24 test4 = a-> a*10;
		System.out.println(test4.test(3));
	}
}
