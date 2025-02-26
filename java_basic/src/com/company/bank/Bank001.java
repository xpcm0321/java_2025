package com.company.bank;

import java.util.Scanner;

public class Bank001 {
	public static void main(String[] args) {
		// 변수
		// add = 추가, che = 조회, in = 입금, out = 출금, del = 삭제, clo = 종료
		// id = 아이디, pwd = 비밀번호, age = 나이, cash = 잔액, input = 입력
		// total = 뱅크 / 추가 / 조회 / 입금 / 출금 / 삭제 / 종료
		String menu = 
				"===== BANK =====\n" +
				   "*  1. 추가\n" +
				   "*  2. 조회\n" + 
				   "*  3. 입금\n" + 
				   "*  4. 출금\n" + 
				   "*  5. 삭제\n" + 
				   "*  9. 종료\n";
		
		String clo="";
		int age = 0, cash = 0, input, in = 0, out = 0;
		char del = ' ', id = ' ', pwd = ' ';
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		// 처리
		for (;;) {
			System.out.println(menu);
			System.out.print("입력 >>> ");
			input = scanner.nextInt();
			System.out.print("ID > ");
			id = scanner.next().charAt(0);
			System.out.print("Password > ");
			pwd = scanner.next().charAt(0);
			
			if (id == pwd) {
				switch (input) {
				case 1 :
					System.out.println("나이 입력 > ");
					age = scanner.nextInt();
					System.out.println("잔액 입력 > ");
					cash += scanner.nextInt();
					break;
				case 2 :
					System.out.println("== 계좌 조회");
					System.out.println("나이 : " + age);
					System.out.println("잔액 : " + cash);
					continue;
				case 3 :
					System.out.println("입금 : ");
					in += scanner.nextInt();
					System.out.println("== 입금 완료");
					System.out.println("잔액 : " + cash);
					continue;
				case 4 :
					System.out.println("출금 : ");
					out -= scanner.nextInt();
					System.out.println("== 출금 완료");
					System.out.println("잔액 : " + cash);
					continue;
				case 5 :
					System.out.println("계좌를 삭제하시겠습니까? (Y/N)");
					del = scanner.next().charAt(0);
					if (del == 'y' || del == 'Y') {
						System.out.println();
					} else if (del == 'n' || del == 'N') {
						System.out.println();
					}
					break;
				case 9 :
					System.out.println("종료기능 입니다.");
					clo = scanner.next();
					break;
				}
			} else {
				switch (input) {
				case 2 : case 3 : case 4 : case 5 :
					System.out.println("다시 한 번 확인해주세요.");
					break;
				}
			}
		}
		// 출력
	}
}