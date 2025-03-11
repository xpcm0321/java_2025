package com.company.java015_ex;

class Coffee012 {
	String name;
	int price;
	int num;

	public Coffee012() {
		this.name = "아메리카노";
		this.num = 1;
		this.price = 2000;
	}

	public Coffee012(String name, int num, int price) {
		this.name = name;
		this.num = num;
		this.price = price;
	}

	public void show() {
		System.out.println("=====커피\r\n" + "커피명 : " + this.name + "\r\n" + "커피잔수 : " + this.num + "\r\n" + "커피가격 : "
				+ this.price + "\r\n");
	}
}

public class SelfTest001 {
	public static void main(String[] args) {
		Coffee012 a1 = new Coffee012("까페라떼" , 2, 4000);
		a1.show();
		Coffee012 a2 = new Coffee012();
		a2.show();
	}
}
/*
Repeat001.java                   <  javac Repeat001.java
Coffee.class , Repeat001.class   <  java  Repeat001 
------------------------------------------------------------
[method : 정보보관]
[1번지]Coffee.class  
[2번지]Repeat001.class  ##1
------------------------------------------------------------
[heap : 동적]                        |       [stack : 지역]
[2000]번지                         <----[a2 | 2000번지]
{ name="아메리카노", num=1 , price=1500 }                                   
[1000]번지                         <----[a1 | 1000번지]
{  name="까페라떼", num=2, price=4000  }   [main          ]
------------------------------------------------------------
*/

/*
클래스명 : Coffee012
커피 이름과 가격 출력
*/
