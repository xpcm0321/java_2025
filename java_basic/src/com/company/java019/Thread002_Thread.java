package com.company.java019;

import java.awt.Toolkit;

// 1. 프로세스 - 실행 중인 프로그램
// 2. 자원 + Thread ( 작업 수행 클래스 )
// 3. 작업수행클래스   1) 상속, Runnable 인터페이스  2) run() 해야할일 구현  3) start() 실행

class PigSound extends Thread{  // #1. 상속 Thread(작업수행클래스)
	@Override
	public void run() {  // #2. run 해야할일
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // 없어도 무방
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			// toolkit.beep();
			System.out.println("꾸울....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class PigCount extends Thread {  // #1. 작업수행 클래스 상속
	@Override
	public void run() { // #2. run 해야할일 작성
		for(int i = 1; i < 6; i++) {			
			System.out.print(i + "마리 ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thread002_Thread {
	public static void main(String[] args) { // 1개의 스레드
		// 여러가지 일을 동시에
		// 작업스레드 ## 3단계
		Thread count = new PigCount();
		count.start();
		Thread sound = new PigSound();
		sound.start();
		// ˙Ꙫ˙  5번
		for (int i = 0; i < 5; i++) {
			System.out.print(" ˙Ꙫ˙ ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
