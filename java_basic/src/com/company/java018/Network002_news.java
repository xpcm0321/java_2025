package com.company.java018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Network002_news {
	public static void main(String[] args) {
		try {
			// #1. URL
			// https://openapi.naver.com/v1/search/news.xml XML
			// https://openapi.naver.com/v1/search/news.json JSON
			String apiurl = "https://openapi.naver.com/v1/search/news.json?query=" + URLEncoder.encode("ai", "UTF-8");
			URL url = new URL(apiurl);

			// #2. HttpURLConnection
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			// #3. 요청설정
			// * GET
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-Naver-Client-Id", "wW9RcjFiZnT00reXZXxL");
			conn.setRequestProperty("X-Naver-Client-Secret", "Xm9i22SQts");
			
			// #4. 응답확인 - 200
			// System.out.println(conn.getResponseCode());
			int code = conn.getResponseCode();
			BufferedReader br;
			if (code == 200) {
				br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			// #5. 응답데이터 - xml / json / csv
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
/*
#1. 
Client ID          wW9RcjFiZnT00reXZXxL
Client secret      Xm9i22SQts

#2. URL
https://openapi.naver.com/v1/search/news.xml	XML
https://openapi.naver.com/v1/search/news.json	JSON

#3. 요청정보
* GET
* query / UTF-8로 인코딩. 쿼리 스트링 형식 - 요청사항 주소 표시창 줄로 데이터 넘기기
> X-Naver-Client-Id: {애플리케이션 등록 시 발급받은 클라이언트 아이디 값}
> X-Naver-Client-Secret: {애플리케이션 등록 시 발급받은 클라이언트 시크릿 값}
*/