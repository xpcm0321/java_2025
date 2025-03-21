<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 1. utf-8 설정
	// 2. request.getParameter() 이용해서 데이터받기 (ono)
	request.setCharacterEncoding("UTF-8");
	int ono = Integer.parseInt(request.getParameter("ono"));
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	// String result = "관리자에게 문의바랍니다.";
	String sql = "delete from milk_order where ono = ?";
	try {
		// 3. Driver 연동
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 4. DB 연동  - close()
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic", "root", "1234");
		// 5. PreparedStatement 이용해서 sql 처리
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, ono);
		// 6. 결과값 받아서 처리
		int result = pstmt.executeUpdate();
		
		// if(pstmt.executeUpdate()> 0) {
			// result = "삭제성공!";} out.println("<script>alert('"+result+"'); location.href='milk.jsp';</script>")
		
		if(result > 0) {
			out.println("<script>alert('삭제성공!'); location.href='milk.jsp';</script>");
		}
		else {
			out.println("<script>alert('삭제실패!'); location.href='milk.jsp';</script>");
		}
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		if (pstmt != null) {
			pstmt.close();
		}
		if (conn != null) {
			conn.close();
		}
	}
%>