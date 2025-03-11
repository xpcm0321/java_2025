package com.company.java016;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Collection004_map {
	public static void main(String[] args) {
		//  key      value - add(X) put, get, size, remove, contains
		Map<String, String> map = new HashMap<>();
		map.put("one", "하나");
		map.put("two", "두울");
		// map.put("one", "세엣"); key 값이 같으면 덮어씀
		map.put("three", "세엣");
		
		System.out.println(map);
		System.out.println(map.get("one")); // 2. 가져오기
		System.out.println(map.size()); // 3. 갯수
		System.out.println(map.remove("three")); // 4. 삭제 key Object(객체)
		System.out.println(map.containsKey("one"));
		System.out.println(map.keySet());  // [one, two] 키들 모으기
		System.out.println(map.values());  // [하나, 두울] 값들 모으기
		System.out.println(map.entrySet()); // [one=하나, two=두울] key 와 value 값을 한 번에 가져오기
		// Set <Entry <String, String>>
		
		System.out.println();
		System.out.println();
		// 출력  향상된 for
		for( Entry <String, String> e : map.entrySet() ) {
			System.out.println(e.getKey() + "/" + e.getValue());
		}
		System.out.println();
		System.out.println();
		
		// iter - ver1
		// 1. key 모으기  2. 처리대상확인 hasNext  3. 값 꺼내오기 next
		Iterator <String> iter = map.keySet().iterator();  // iter → [one, two]
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + "/" + map.get(key));
		}
		System.out.println();
		System.out.println();
		
		// iter - ver2
		// 1. entry 모으기  2. 처리대상확인  3. 값 꺼내오기  [one=하나, two=두울]
		Iterator <Entry <String, String>> eter = map.entrySet().iterator();  // iter → [one=하나, two=두울] 모으기
		while (eter.hasNext()) {  // 2. 처리대상확인 hasNext
			Entry <String, String> temp = eter.next();  // 3. 값 꺼내오기 next
			System.out.println(temp.getKey() + "/" + temp.getValue());
		}
	}
}
/*
  List : ##5.   기차      인덱스여부 [ O ],  중복허용여부 [ O ],
                         [ add, get(index), size, remove, contains ] 
  Set  : ##6.   주머니    인덱스여부 [ X ],  중복허용여부 [ X ],
                         [ add, get(X) 향상된 for/Iterator, size, remove, contains ]
  Map  : ##7.   사전      [ key(키), value(값) ] - 쌍(Entry),
                         [ put, get(key), size, remove, contains ] 
*/