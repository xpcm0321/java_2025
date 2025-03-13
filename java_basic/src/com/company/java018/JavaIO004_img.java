package com.company.java018;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class JavaIO004_img {
	public static void main(String[] args) throws Exception {
		// #1. 경로
		String origin = "com/company/java018/cat.jpg";
		String target1 = "com/company/java018/cat1.jpg";
		String target2 = "com/company/java018/cat2.jpg";
		
		// #2. byte 단위로 이미지파일 읽어들여서 쓰기  (O)
		// cat.jpg  → cat1.jpg
		// InputStream (읽기) > [Program] > OutputStream (쓰기)
		InputStream bis = new FileInputStream(origin);     // cat.jpg
		OutputStream bos = new FileOutputStream(target1);  // cat1.jpg
		
		int cnt1 = 0;
		while ((cnt1 = bis.read()) != -1) {
			bos.write((byte)cnt1);
		}
		bos.flush();
		bos.close();
		bis.close();
		System.out.println(">> byte 이미지 복사완료!");  // cat1.jpg #  이미지 읽어옴
		
		// #3. char 단위로 이미지파일 읽어들여서 쓰기  (X)
		// cat.jpg  → cat1.jpg
		// Reader (읽기) > [Program] > Writer (쓰기)
		Reader cr = new FileReader(origin);    // cat.jpg
		Writer cw = new FileWriter(target2);   // cat1.jpg
		
		int cnt2 = 0;
		while ((cnt2 = cr.read()) != -1) {
			cw.write((char)cnt2);
		}
		cw.flush();
		cw.close();
		cr.close();
		System.out.println(">> char 이미지 복사완료!"); // 이미지 깨짐  char = 문자전용이라서 이미지를 읽어오지 못함
		
	}
}
