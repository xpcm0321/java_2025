package com.company.java003;

import java.util.Scanner;

public class Operator001 {
	public static void main(String[] args) {
		// 먼저()  값 ( +, -, *, /, %, ++, -- ) 비교 ( ==(같다), !=(같지 않다), >(초과), <(미만), >=(이상), <=(이하) ) 조건 (&&, ||, ?:) 대입 ( = )
		// 1. 값 ( +, -, *, /, %, ++, -- )
		int a = 10, b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);  // 몫   3
		System.out.println(a % b);  // 나머지 1
		System.out.println("----------------------");
		
		// Q1. 나머지 연산자 - 짝수니? 홀수니?
		// Q2. 3의 배수?
		
		// A1. 나머지 연산자 - 짝수니? 홀수니?
		// 짝수 : 0(짝수) 1(짝수) 2(짝수) 3(홀수) - 2로 나눴을 때 나머지가 0이라면 짝수, 나머지가 1이라면 홀수
		// 0 % 2 == 0  0이면 짝수
		// 1 % 2 == 1  1이면 홀수
		// 2 % 2 == 0  0이면 짝수
		System.out.println( 0 % 2 + " " + 1 % 2 + " " + 2 % 2 + " " + 3 % 2);
		
		// A2. 3의 배수
		// 1 % 3 == 1  나머지 1
		// 2 % 3 == 2  나머지 2
		// 3 % 3 == 0  나머지 3   // 3의 배수라면 0 / 나머지는 0, 1, 2
		System.out.println( 1 % 3 + " " + 2 % 3 + " " + 3 % 3); // 1 2 0
		System.out.println("----------------------");
		
		// 2. 비교( ==, !=, >(초과), <(미만), >=(이상), <=(이하) )
		// Q1. 나머지 연산자 - 짝수니? 홀수니?
		// Q2. 3의 배수?
		System.out.println(10 > 3);  // true
		System.out.println(10 < 3);  // false
		// a = 10  a가 짝수니?  == 2로 나누었을 때 나머지 연산 시 0  ==  a % 2 == 0
		System.out.println( a % 2 == 0 ); // 짝수 표현 true
		System.out.println( a % 2 == 1 ); // 홀수 표현 false
		// b = 3  b가 3의 배수니?  == 3으로 나머지 연산 시 0이 나와야 한다.
		System.out.println( b % 3 == 0 );
		System.out.println("----------------------");
		
		
		// 3. 조건 ( &  &&(조건1, 조건2 모든 조건 만족 시)  |  ||(조건1, 조건2 여러 조건 중 하나))
		System.out.println( true & true );    // true
		System.out.println( true && true );   // true  모든 조건 만족 시
		System.out.println( false & true );   // & 처음이 false여도 뒤에 조건까지 읽음
		System.out.println( false && true );  // && 처음 조건이 false이면 뒤에 조건은 읽지 않음 Dead code
		System.out.println("-----------------------");
		
		System.out.println( true | true );    // 하나라도 조건에 맞으면 OK
		System.out.println( true || true );   // Dead code
		System.out.println( false | true );   // 
		System.out.println( false || true );  // 
		System.out.println("-----------------------");
		
		// 4.  (조건)? 참 : 거짓
		System.out.println( (a > b)? "a > b" : "a < b" );
		System.out.println( (3 % 2 == 0)? "짝수" : "홀수" );
		System.out.println("-----------------------");
		
		int num1 = 10, num2 = 7;
		// q1) 2의 배수이면서 5의 배수라면 true / false
		System.out.println(num1 % 2 == 0 && num1 % 5 == 0);
		System.out.println(num2 % 2 == 0 && num2 % 5 == 0);
		System.out.println("-----------------------");
		
		// q2) 2의 배수이거나 3의 배수라면 true / false
		System.out.println(num1 % 2 == 0 || num1 % 3 == 0);
		System.out.println(num2 % 2 == 0 || num2 % 3 == 0);
		System.out.println("-----------------------");
		
		// q3) 숫자를 입력받아 0보다 크면 양수, 0보다 작으면 음수, 아니라면 0	
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 > ");
		num = scanner.nextInt();
		
		System.out.println( (num > 0) ? "양수" : (num < 0) ? "음수" : "0" );
		System.out.println("-----------------------");
		
		// 5. 대입
		a = 10;
		System.out.println( a+=b );  // 1) a+b  2)  a= 1번한 결과
		System.out.println( a-=b );
		System.out.println( a*=b );
		System.out.println( a/=b );
		System.out.println( a%=b );
		System.out.println("-----------------------");
		
		// () 값 비교조건 대입
		
		// 6. ++, -- ( 단항 )
		int a1 = 1, b1 = 1, c1 = 1, d1 = 1;
		//                    ←
		System.out.println(++a1);  // 2   1)증가 2)출력
		System.out.println(a1);    // 2
		
		//                  ←
		System.out.println(b1++);  // 1   1)출력 2)증가
		System.out.println(b1);    // 2
		
		//                    ←
		System.out.println(--c1);  // 0   1)감소 2)출력
		System.out.println(c1);    // 0
		
		//                  ←
		System.out.println(d1--);  // 1   1)출력 2)감소
		System.out.println(d1);    // 0
		
	} //end main
} // end class
