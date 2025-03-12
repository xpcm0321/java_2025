package com.company.java017_ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

class Milk {
	private int no;
	private String name;
	private int price;
	
	public Milk() { super(); }
	public Milk(int no, String name, int price) { super(); this.no = no; this.name = name; this.price = price; }
	
	@Override public String toString() { return "Milk [no=" + no + ", name=" + name + ", price=" + price + "]"; }
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
	
	@Override public int hashCode() { return Objects.hash(name, no, price); }
	@Override public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Milk other = (Milk) obj;
		return Objects.equals(name, other.name) && no == other.no && price == other.price;
	}	
}

public class Repeat002 {
	public static void main(String[] args) {
		// 2. dto 를 이용하여 ArrayList + Iterator 이용해서 만들기 >>> ArrayList<Milk>
		List<Milk> list = new ArrayList<Milk>();
		list.add(new Milk(1, "white", 1000));
		list.add(new Milk(2, "choco", 1200));
		list.add(new Milk(3, "banana", 1300));
		
		System.out.println("===========================\r\n" + "NO\tNAME\tPRICE\r\n" + "===========================");
		Iterator<Milk> iter1 = list.iterator();
		while(iter1.hasNext()) {
			Milk temp = iter1.next();
			System.out.println(temp.getNo() + "\t" + temp.getName() + "\t" + temp.getPrice());
		}
		
		// 3. dto 를 이용하여 ArrayList + Iterator 이용해서 만들기 >>> HashSet<Milk>
		Set<Milk> set = new HashSet<Milk>();
		set.add(new Milk(1, "white", 1000));
		set.add(new Milk(2, "choco", 1200));
		set.add(new Milk(3, "banana", 1300));
		set.add(new Milk(3, "banana", 1300));
		
		Iterator <Milk> iter2 = set.iterator();
		while(iter2.hasNext()) {
			Milk temp = iter2.next();
			System.out.println(temp.getNo() + "\t" + temp.getName() + "\t" + temp.getPrice());
		}
		
		// 4. dto 를 이용하여 ArrayList + Iterator 이용해서 만들기 >>> HashMap<Integer, Milk>
		Map<Integer, Milk> map = new HashMap<>();
		map.put(1, new Milk(1, "white", 1000));
		map.put(2, new Milk(2, "choco", 1200));
		map.put(3, new Milk(3, "banana", 1300));
		
		System.out.println(map.entrySet());
		
		Iterator <Entry <Integer, Milk>> iter3 = map.entrySet().iterator();
		while(iter3.hasNext()) {
			Entry <Integer, Milk> key_value = iter3.next();
			System.out.println(key_value.getKey());
			System.out.println(key_value.getValue());
			Milk temp = key_value.getValue();
			System.out.println(temp.getNo() + "\t" + temp.getNo() + "\t" + temp.getPrice());
		}
	}
}
/*
1. dto
  class Milk {
    private int no; private String name; private int price;
  }

2. dto 를 이용하여 ArrayList + Iterator 이용해서 만들기 >>> ArrayList<Milk>
3. dto 를 이용하여 ArrayList + Iterator 이용해서 만들기 >>> HashSet<Milk>
4. dto 를 이용하여 ArrayList + Iterator 이용해서 만들기 >>> HashMap<Integer, Milk> 
*/