package com.company.java019;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Network001_InetAddress {
	public static void main(String[] args) {
		// #1.
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("1. ip HostName : " + local.getHostName());
			System.out.println("2. ip HostAddress : " + local.getHostAddress()); // 192.168.40.94
			
			local = InetAddress.getByName("www.naver.com");
			System.out.println("3. naver : " + local);  // 223.130.192.247
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
/*
네트워크
*/