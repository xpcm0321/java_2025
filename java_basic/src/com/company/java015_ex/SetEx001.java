package com.company.java015_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// set : 주머니, 순서 X, 중복허용 X / add, get(X) 향상된 for문 / Iterator, size, remove, contains
public class SetEx001 {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		colors.add("green");
		
		// 1. 향상된 for문
		for (String c : colors) { System.out.println(c); }
		System.out.println();
		// 2. Iterator
		Iterator <String> iter = colors.iterator();  // 1. set 요소들 모으기
		while(iter.hasNext()) {  // 2. 처리대상확인
			System.out.println(iter.next());  // 3. 객체요소 한 개씩 꺼내오기
		}
		System.out.println();

		// 3. 개수
		System.out.println(colors.size());
	}

}
/*
연습문제1)  Collection  Framework
패키지명 : com.company.java015_ex
클래스명 : SetEx001
다음과 같이 코드를 작성하시오.
 1.  Hash이용해서 colors 만들기
 2. red, green, blue ,green 데이터 추가
 3. 출력
 4. 갯수출력  
*/