package com.company.java016_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class UserInfo2 {
	private String name;
	private int age;
	
	public UserInfo2() { super(); }
	public UserInfo2(String name, int age) { super(); this.name = name; this.age = age; }
	
	@Override public String toString() { return "UserInfo [name=" + name + ", age=" + age + "]"; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
}

public class HashSet001 {
	public static void main(String[] args) {
		// 주머니 : add(추가), 향상된 for/Iterator, size(갯수), remove(삭제), contains
		Set <UserInfo2> sets = new HashSet<>();
		sets.add(new UserInfo2("아이언맨", 50));
		sets.add(new UserInfo2("헐크", 40));
		sets.add(new UserInfo2("캡틴", 120));
		
		// Iterator 는 다시 복습
		// 1. sets 모으기 - Iterator / 2. 처리대상확인 - hasNext / 3. 꺼내오기 next
		Iterator <UserInfo2> iter = sets.iterator(); // 1. sets 모으기 - Iterator
		while (iter.hasNext()) { // 2. 처리대상확인 - hasNext
			UserInfo2 u = iter.next(); // 3. 꺼내오기 next
			System.out.println(u.getName() + "/" + u.getAge());
		}
		System.out.println();
		System.out.println();
		
		for (UserInfo2 u : sets) { System.out.println(u.getName() + "/" + u.getAge()); }
	}
}