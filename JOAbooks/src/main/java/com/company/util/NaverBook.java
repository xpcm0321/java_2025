package com.company.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class NaverBook {
	public void getBooks() {
		try {
			// https://openapi.naver.com/v1/search/book.xml		XML
			// https://openapi.naver.com/v1/search/book.json	JSON
			
			// https://openapi.naver.com/v1/search/book_adv.xml?d_titl=
			String apiurl = "https://openapi.naver.com/v1/search/book.xml?query=" + URLEncoder.encode("요리", "UTF-8");
			URL url = new URL(apiurl);
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-Naver-Client-Id", "wW9RcjFiZnT00reXZXxL");
			conn.setRequestProperty("X-Naver-Client-Secret", "Xm9i22SQts");
			
			// System.out.println(conn.getResponseCode());
			int code = conn.getResponseCode();
			BufferedReader br;
			if (code == 200) {
				br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			String line = "";
			StringBuffer sb = new StringBuffer();
			while ((line = br.readLine()) != null) {
				sb.append(line + "\n");
			}
			System.out.println(sb.toString());
			br.close();
			conn.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
