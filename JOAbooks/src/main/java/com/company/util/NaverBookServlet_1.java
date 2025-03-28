package com.company.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NaverBookServlet
 */
@WebServlet("/books1")
public class NaverBookServlet_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NaverBookServlet_1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		try {
			// https://openapi.naver.com/v1/search/book.xml		XML
			// https://openapi.naver.com/v1/search/book.json	JSON
			
			// https://openapi.naver.com/v1/search/book_adv.xml?d_titl=
			String apiurl = "https://openapi.naver.com/v1/search/book.json?query="
							+ URLEncoder.encode("요리", "UTF-8"); // book.xml 을 book.json으로 변경
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
			// System.out.println(sb.toString());
			br.close();
			conn.disconnect();
			
			PrintWriter out = response.getWriter();
			out.println(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
