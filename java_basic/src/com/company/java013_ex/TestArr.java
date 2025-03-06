package com.company.java013_ex;

// 12. DTO 역할하는 A
class A {
	private String name;
	
	public A() { super(); }
	public A(String name) { super(); this.name = name; }
	@Override public String toString() { return "A [name=" + name + "]"; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
}

// 13. 클래스배열
public class TestArr {
	public static void main(String[] args) {
		A [] arr = new A[3]; // arr [null, null, null]
		arr[0] = new A();
		arr[1] = new A();
		arr[2] = new A();
		// 주의사항!) 생성자를 호출해 인스턴스변수를 사용가능하게 만들어야 함
		
		/* for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		} */
		for (A a : arr) { System.out.println(a); }
	}
}
// 14. 오버라이딩 : 상속 시 부모메서드와 같은 메서드