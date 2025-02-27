package com.company.java009_ex;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEx007 {
	public static void who_are_you(String[][] users) { // 아이디를 입력받아서 나라 조회
		// 변수
		String id = "";
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		// 아이디 입력받기
		System.out.println("아이디를 입력해주세요 > ");
		id = scanner.next();
		
		// 처리 + 출력
		// if ( 입력빋은 id가 "aaa" 같니? ) { aaa 는 한국사람입니다. }
		// if ( 입력빋은 id가 "bbb" 같니? ) { bbb 는 호주사람입니다. }
		// if ( 입력빋은 id가 "ccc" 같니? ) { ccc 는 중국사람입니다. }
		
		// if ( id.equals( users[0][0] ) { users[0][0] + "는" + user[0][2] + "사람입니다." }
		// if ( id.equals( users[1][0] ) { users[1][0] + "는" + user[1][2] + "사람입니다." }
		// if ( id.equals( users[2][0] ) { users[2][0] + "는" + user[2][2] + "사람입니다." }
		
		for (int ch = 0; ch < users.length; ch++) {
			if (id.equals(users[ch][0])) {
				result = users[ch][0] + "는" + users[ch][2] + "사람입니다.";
			}
		}
	}
	
	public static void who_pass_change(String[][] users) { // 아이디와 비밀번호가 맞으면 비밀번호 바꾸기
		// 변수
		String temp_id = "", temp_pass = ""; String result = "유저를 확인해주세요";
		Scanner scanner = new Scanner(System.in);

		// 입력
		// 아이디와 비밀번호 입력받기
		System.out.println("아이디를 입력해주세요 > ");
		temp_id = scanner.next();
		System.out.println("비밀번호를 입력해주세요 > ");
		temp_pass = scanner.next();

		// 처리
		//  1) 사용자 인증1 - if (입력받은 아이디와 "aaa" / 입력받은 비밀번호와 111같다면) { 해당 유저의 0층 }
		//               - if (입력받은 아이디와 "bbb" / 입력받은 비밀번호와 111같다면) { 해당 유저의 1층 }
		//     사용자 인증2 - if (temp_id.equals(users[0][0]) && temp_pass.equals(users[0][1]) { 0층 }
		//               - if (temp_id.equals(users[1][0]) && temp_pass.equals(users[1][1]) { 1층 }
		//  2) 맞다면 새로운 비밀번호 입력 - 변경하실 비밀번호를 입력해주세요123
		
		int find = -1; // 배열에 없는 값 넣기
		for (int ch = 0; ch < users.length; ch++) {
			if (temp_id.equals(users[ch][0]) && temp_pass.equals(users[ch][1])) {
				find = ch;
				break;
			}
		}
		
		if (find != -1) {
			System.out.print("변경하실 비밀번호를 입력해주세요 > ");
			users[find][1] = scanner.next();
			result = Arrays.toString(users[find]);
		}
		
		// 출력
		// 유저를 확인해주세요 / 정보확인 : [bbb, 123, 호주]
		System.out.println(result);
	}

	public static void main(String[] args) {
		// 변수
		String[][] users = { { "aaa", "111", "한국" }, // 00 01 02
				{ "bbb", "222", "호주" }, // 10 11 12
				{ "ccc", "333", "중국" } }; // 20 21 22
		// 입력
		who_are_you(users);
		// public static 리턴값 메서드명(파라미터) {해야할 일}
		// public static void who_are_you(String [][] users){ 아이디를 입력받아서 나라조회 }
		who_pass_change(users);
		// public static 리턴값 메서드명(파라미터) {해야할 일}
		// public static void who_pass_change(String [][] users){ 아이디,비밀번호가 맞으면 비밀번호 바꾸기}
	}

}
/*
연습문제6)  method
패키지명 : com.company.java008_ex
클래스명 :  MethodEx007

public class MethodEx007{ 
   // 변수
   String [][] users = {{ "aaa"  , "111"   , "한국"     } ,     // 00 01 02
                      { "bbb" , "222"   , "호주"       } ,       // 10 11 12
                      { "ccc"  , "333"   , "중국"      }};      // 20 21 22
   // 입력
   who_are_you(users);
   //  public static void who_are_you(String [][] users){  아이디를입력받아서 나라조회 }
   who_pass_change(users); 
   //  public static void who_pass_change(String [][] users){ 아이디,비밀번호가 맞으면 비밀번호 바꾸기}
}

출력내용) who_are_you(users);    
//  public static void who_are_you(String [][] users){  아이디를입력받아서 나라조회 }
아이디를 입력해주세요>aaa
aaa는 한국사람입니다.

출력내용)
who_pass_change(users); 
//  public static void who_pass_change(String [][] users){ 아이디,비밀번호가 맞으면 비밀번호 바꾸기}

아이디를 입력해 주세요 > bbb
비밀번호를 입력해 주세요 > 123
유저를 확인해주세요!

아이디를 입력해 주세요 > bbb
비밀번호를 입력해 주세요 > 222
변경하실 비밀번호를 입력해주세요123
정보확인 : [bbb, 123, 호주]
*/