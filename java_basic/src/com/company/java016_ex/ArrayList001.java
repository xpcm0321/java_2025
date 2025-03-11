package com.company.java016_ex;

import java.util.ArrayList;

class UserInfo {
	private String name;
	private int age;
	
	public UserInfo() { super(); } // 디폴트생성자
	public UserInfo(String name, int age) { super(); this.name = name; this.age = age; } // 필드
	
	// toString, getters/setters
	@Override public String toString() { return "UserInfo [name=" + name + ", age=" + age + "]"; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
}

public class ArrayList001 {
	public static void main(String[] args) {
		ArrayList <UserInfo> users = new ArrayList<>();
		users.add(new UserInfo("아이언맨", 50));
		users.add(new UserInfo("헐크", 40));
		users.add(new UserInfo("캡틴", 120));
		
		// add(추기), get(가져오기), size(갯수), remove(삭제), contains
		for (int i = 0; i < users.size(); i++) {
			UserInfo u = users.get(i);
			System.out.println(u.getName() + "/" + u.getAge());
			// System.out.println(users.get(i).getName() + "/" + users.get(i).getAge());
		}
		System.out.println();
		System.out.println();
		
		// 향상된 for   꺼내오는 자료형 : 리스트, 배열
		for (UserInfo u : users) { System.out.println(u.getName() + "/" + u.getAge()); }
	}
}
