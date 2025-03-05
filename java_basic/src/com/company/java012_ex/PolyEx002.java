package com.company.java012_ex;
/*
   1. 클래스는 부품객체
   2.     상태와 행위
   3. 상속 - 재사용
	Object
	   ↑
	Parent7 { x = 100 / method() }
	   ↑
	Child7 { x = 200 / method() }
*/
class Parent7 extends Object {
	int x = 100;
	public Parent7() { super(); }
	void method() { System.out.println("Parent Method"); }
}
class Child7 extends Parent7 {
	int x = 200;
	public Child7() { super(); }
	@Override void method() { System.out.println("Child Method"); }
}

public class PolyEx002 {
	public static void main(String[] args) {
		Parent7 p = new Child7();
		// Q3. Parent7 p 보장하는 범위 { x = 100 / method() }
		// Q4. 인스턴스화 했을때 사용가능한 범위 : new Child7()
		// 1번지 : { x = 200 / method() Child Method } - { x = 100 / ------ }
		// p 1번지 : { x = 200 / [ method() Child Method } - { x = 100 ] / ------ }
		
		Child7 c = new Child7();
		// c 2번지 = { x = 200 / method() Child Method } - { x = 100 / ------ }
		
		System.out.println("p.x = " + p.x); // Q5. 출력되는 내용 100
		p.method(); // Q6. 출력되는 내용 Child Method
		System.out.println("c.x = " + c.x); // Q7. 출력되는 내용 200
		c.method(); // Q8. 출력되는 내용 Child Method
		// Q9. c.x를 이용해 부모의 x 꺼내오기 100
		System.out.println("p.x = " + ((Parent7) c).x);
	}
}
/*
연습문제2)  다형성
패키지명 : com.company.java012_ex
클래스명 : PolyEx002
다음과 같이 코드를 작성하시오.
class Parent7  extends Object{
   int x = 100;
   public Parent7() { super(); }
   void method() { System.out.println("Parent Method"); }
} 
class Child7 extends Parent7 {
   int x = 200;
   public Child7() { super(); }
   @Override  void method() { System.out.println("Child Method"); }
}
public class PolyEx002 {
   public static void main(String[] args) {
      Parent7 p = new Child7();     
      // Q3.  Parent7 p   보장하는 범위   
      // Q4. 인스턴스화 했을때 사용가능한 범위 : new Child7()  
      
                            Child7 c = new Child7();     
      System.out.println("p.x = " + p.x);  // Q5. 출력되는 내용   
      p.method();  // Q6. 출력되는 내용     
      System.out.println("c.x = " + c.x);   // Q7. 출력되는 내용  
      c.method();   // Q8. 출력되는 내용   
   }
}
*/