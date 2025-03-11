package com.company.java016_ex;

import java.util.HashMap;

public class MapEx002_ex {
	public static void main(String[] args) {
		String [] data = { "A", "D", "B", "D", "B", "D", "B", "C", "E", "C", "B" };
		HashMap<String, Integer> map = new HashMap<>();
		/*
		 * map.put(data[0], 1);
		 * map.put(data[2], 4);
		 * map.put(data[7], 2);
		 * map.put(data[1], 3);
		 * map.put(data[8], 1);
		 */
		
		int cnt = 0;
		char ch = '#';
		for (int i = 0; i < map.size(); i++) {
			map.put(data[i], 1);
			map.put(data[i], 4);
			map.put(data[i], 2);
			map.put(data[i], 3);
			map.put(data[i], 1);
		}
	}
}
/*
1. 주어진조건
   String[] data = { "A","D","B","D","B","D","B","C","E","C","B" };
   HashMap<String, Integer> map = new HashMap<>();

2. 다음과 같이 출력하시오.
{A=1, B=4, C=2, D=3, E=1}
A:#1
B:####4
C:##2
D:###3
E:#1
보험왕 > [B]
*/