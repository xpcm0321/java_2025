package com.company.java019;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Network002_Client {
	public static void main(String[] args) {
		// ##실행2) client
		Socket socket = null;
		
		try {
			// 2. 고객이 통신사에 연락 - 127.0.0.1 (192.168.40.94) /  7703
			socket = new Socket("127.0.0.1", 7703);  // ip, 포트번호
			System.out.println("[CLIENT] 2. as center에 고객문의!");
			// 4. 데이터 주고 받기
			Thread sender = new Sender(socket);  // 말하기
			sender.start();
			
			Thread receiver = new Receiver(socket);  // 듣기
			receiver.start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}