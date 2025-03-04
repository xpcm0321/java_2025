package com.company.java011;  // 1. java001 폴더

import com.company.java011_ex.Cat;

class Cat2 extends Cat{ // Cat2 : java011 / Cat : java011_ex
	public void show() {
		public_ = 10;
		protected_ = 20;  // extends 사용가능 - 상속받은 자식만 쓸 수 있음
		// package_ = 30; // 같은 폴더에서 사용가능 - 폴더가 다름
		// private_ = 40; // Cat 클래스에서만 사용가능 - getter / setter
		System.out.println(public_ + "/" + protected_);
	}
}  // 2. extends Cat의 기능 사용[상속]

public class Modifier2_protected {
	public static void main(String[] args) {
		Cat2 cat2 = new Cat2();
		cat2.show();
		
		cat2.public_ = 100; // 아무데서나 접근 가능
		// cat2.protected_ = 200; // extends 키워드를 받은 적이 없음 extends Cat(extends Cat2)
	}
}
/*
-------------------------------------
[method:정보]
-------------------------------------
[heap]                   | [stack]
                         |  main  //##2
-------------------------------------
 */