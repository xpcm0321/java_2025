package com.company.java018_ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

class UserInfo {
	private int no;
	private String name;
	private int age;
	
	public UserInfo() {
		super();
	}
	public UserInfo(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserInfo [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class Repeat002 {
	public static void main(String[] args) {
		// ArrayList + Iterator
		ArrayList<UserInfo> list = new ArrayList<>();
		list.add(new UserInfo(1, "iron", 45));
		list.add(new UserInfo(2, "hulk", 38));
		list.add(new UserInfo(3, "captain", 120));
		
		Iterator <UserInfo> iter1 = list.iterator(); // 1. 모으기
		int total = 0;
		while(iter1.hasNext()) {  // 2. 처리대상확인
			UserInfo temp = iter1.next();
			total += temp.getAge(); // 총 나이 누적
			System.out.println(temp.getName() + "/" + temp.getAge());
		}
		System.out.println("총나이 : " + total);
		System.out.println("평균나이 : " + total/list.size());
		System.out.println();
		System.out.println();
		
		// HashSet + Iterator
		HashSet<UserInfo> set = new HashSet<>();
		set.add(new UserInfo(1, "iron", 45));
		set.add(new UserInfo(2, "hulk", 38));
		set.add(new UserInfo(3, "captain", 120));
		
		Iterator <UserInfo> iter2 = set.iterator(); // 1. 모으기
		total = 0;
		while(iter2.hasNext()) {  // 2. 처리대상확인
			UserInfo temp = iter2.next();
			total += temp.getAge();
			System.out.println(temp.getName() + "/" + temp.getAge());
		}
		System.out.println("총나이 : " + total);
		System.out.println("평균나이 : " + total/set.size());
		System.out.println();
		System.out.println();
		
		// HashMap + Iterator
		HashMap<Integer, UserInfo> map = new HashMap<>();
		map.put(1, new UserInfo(1, "iron", 45));
		map.put(2, new UserInfo(2, "hulk", 38));
		map.put(3, new UserInfo(3, "captain", 120));
		
		System.out.println(map.entrySet());
		// [1=UserInfo [no=1, name=iron, age=45], 2=UserInfo [no=2, name=hulk, age=38], 3=UserInfo [no=3, name=captain, age=120]]
		Iterator <Entry <Integer, UserInfo>> iter3 = map.entrySet().iterator(); // 1. key=value
		while(iter3.hasNext()) {
			UserInfo temp = iter3.next().getValue();
			total += temp.getAge();
			System.out.println(temp.getName() + "/" + temp.getAge());
		}
		System.out.println("총나이 : " + total);
		System.out.println("평균나이 : " + total/set.size());
	}
}
