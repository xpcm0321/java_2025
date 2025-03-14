package com.company.java019;

// 1. 프로세스 - 실행 중인 프로그램
// 2. 자원 + Thread( 작업수행클래스 )
// 작업수행클래스 1) Thread 상속, Runnable #  2) run() 해야할일(수행해야 할 내용)  3) start 실행
class Animal {
}

// class DogSound extends Animal, Thread {} (X)
class DogSound extends Animal implements Runnable { // 1) Thread 상속, Runnable #
	@Override
	public void run() { // 2) run() 해야할일(수행해야 할 내용)
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("멍!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // 1000이 1초
	}
}

public class Thread003_Runnable {
	public static void main(String[] args) {
		// ʕTᴥTʔ
		Thread sound = new Thread(new DogSound());
		sound.start();

		Thread count = new Thread(new Runnable() { // #1. runnable
			@Override
			public void run() { // #2. run todo
				for (int i = 0; i < 5; i++) {
					System.out.print((i + 1) + "마리 ");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		count.start(); // #3. start
		// 순서가 이상하게 나올 수 있음

		for (int i = 0; i < 5; i++) {
			System.out.print(" ʕTᴥTʔ ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
