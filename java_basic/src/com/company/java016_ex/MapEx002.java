package com.company.java016_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class UserInfo3 {
	private String name;
	private int age;
	
	public UserInfo3() { super(); }
	public UserInfo3(String name, int age) { super(); this.name = name; this.age = age; }
	
	@Override public String toString() { return "UserInfo [name=" + name + ", age=" + age + "]"; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
}

public class MapEx002 {
	public static void main(String[] args) {
		Map<Integer, UserInfo3> map = new HashMap<>();
		map.put(1, new UserInfo3("아이언맨", 50));
		map.put(2, new UserInfo3("헐크", 40));
		map.put(3, new UserInfo3("캡틴", 120));
		map.put(1, new UserInfo3("아이언맨-new", 50));
		
		// int a = 1;     // 기초값 - 객체의 기능사용 불가
		// Integer e = 1; // 객체 - 객체의 기능사용 가능     객체 = 기초값 - boxing - wrapper 클래스
		// System.out.println(a + "/" + e.byteValue());
		
		// 향상된 for 1										   key		   map! key 주세요!
		for ( Integer key : map.keySet() ) {
			System.out.println(key + "/" + map.get(key));
		}
		System.out.println();
		System.out.println();
		
		// 향상된 for 2
		for ( Entry<Integer, UserInfo3> m : map.entrySet() ) {
			System.out.println(m.getKey() + "/" + m.getValue());
		}
		System.out.println();
		System.out.println();
		
		// keySet
		Iterator<Integer> iter = map.keySet().iterator();  // iter → [1, 2, 3] 1. 모으기
		while (iter.hasNext()) {  // 2. 처리대상확인
			Integer key = iter.next();  // 3. 꺼내오기
			System.out.println(key + "/" + map.get(key));
		}
		System.out.println();
		System.out.println();
		
		// entrySet
		Iterator <Entry <Integer, UserInfo3>> miter = map.entrySet().iterator();  // 1. 모으기
		while (miter.hasNext()) {  // 2. 처리대상확인
			Entry <Integer, UserInfo3> temp = miter.next();  // 3. 꺼내오기
			System.out.println(temp.getKey() + "/" + temp.getValue());
		}
		
	}
}
/*
연습문제2)  Collection  Framework
패키지명 : com.company.java016_ex
클래스명 : MapEx002
Q1. HashMap만들기
Q2. 아래데이터 넣기
map.put(  1,  new UserInfo("아이언맨"    , 50) );  // 1 넣어도 Integer( 클래스, 객체 )
map.put(  2,  new UserInfo("헐크"       , 40) );  // wrapper 클래스
map.put(  3,  new UserInfo("캡틴"       , 120) ); // boxing
map.put(  1,  new UserInfo("아이언맨-new", 50) ); 

Q3. Iterator로 출력하기 - 사용자정보 
*/