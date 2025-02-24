package com.company.java006_ex;

public class RepeatEx008 {
	public static void main(String[] args) {
		// for , while , do while 3가지 버젼으로 1~10까지 3의 배수의 합 : 18
		// ver-1  1이 3의 배수라면 합을 더해 주변 수에 누적
		//        2가 3의 배수라면 합을 더해 주변 수에 누적
		//        3이 3의 배수라면 합을 더해 주변 수에 누적
		
		// ver-2  if(1이 3의 배수라면) {합을 더해 주변 수에 누적}  if(1%3==0) {sum +=1;}
		//        if(2가 3의 배수라면) {합을 더해 주변 수에 누적}  if(2%3==0) {sum +=2;}
		//        if(3이 3의 배수라면) {합을 더해 주변 수에 누적}  if(3%3==0) {sum +=3;}
		
		// for문 : 1~10까지 3의 배수의 합
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("1~10까지 3의 배수의 합 : " + sum + "\n");

		// while문 : 1~10까지 3의 배수의 합
		sum = 0;
		int j = 1;

		while (j <= 10) {
			if (j % 3 == 0) {
				sum += j;
			}
			j++;
		}
		System.out.println("1~10까지 3의 배수의 합 : " + sum + "\n");

		// do while문 : 1~10까지 3의 배수의 합
		sum = 0;
		int k = 1;

		do {
			if (k % 3 == 0) {
				sum += k;
			}
			k++;
		} while (k <= 10);
		System.out.println("1~10까지 3의 배수의 합 : " + sum + "\n");
	}
}
/*
연습문제8) for/while/do while
for , while , do while 3가지 버젼으로 1~10까지 3의 배수의 합 : 18
 */