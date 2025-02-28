package com.company.java010_ex;

// 1. 클래스는 부품객체
// 2. 상태(멤버변수)와 행위(멤버함수)
class Card {
	// 상태-멤버변수 : int cardNum; boolean insMembership;
	int cardNum; boolean isMembership;
	// 행위-멤버함수 : X
	// Card() {} 생략되어 있음. 컴파일러가 자동 생성
	// alt + shift + s (밑에서 2, 3, 4)
	@Override
	public String toString() {
		return "Card [cardNum=" + cardNum + ", isMembership=" + isMembership + "]";
	}
	// 1. Card() : 생성자 오버로딩 시 컴파일러가 기본 생성자 자동 생성 취소 
	// 2. Card() : 기본 생성자 기본 셋팅 - cardNum = 1; 멤버쉽 = true 
	public Card() { this.cardNum = 1; this.isMembership = true; }  
	public Card(int cardNum, boolean isMembership) { super(); this.cardNum = cardNum; this.isMembership = isMembership; }
}
public class ClassEx005 {
	public static void main(String[] args) {
		Card c1 = new Card();
		System.out.println(c1); // Card [cardNum=0, isMembership=true]

		Card c2 = new Card(3, false);
		System.out.println(c2);
	}
}
/*
연습문제3)  class
패키지명 : com.company.java010_ex
클래스명 :  ClassEx005
-- 생성자 작성하시오.
class Card{
   //상태-멤버변수  : 채널/볼륨 int cardNum; boolean  isMembership;   
   //행위-멤버함수  : 채널, 볼륨 입력: input() / 출력 : show()
}
public class ClassEx005{
   public static void main(String[] args) {
   Card  c1= new Card(); 
   System.out.println(c1);  
   }
}

출력내용 :
Card[cardNum=0, isMembership=false]
*/