<%@page import="org.apache.commons.collections4.bag.SynchronizedSortedBag"%>
<%@page import="com.company.domain.BoardVO"%>
<%@page import="com.company.dao.BoardDao"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.*"%>
<%@page import="javax.naming.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="inc/header.jsp" %>

<div class="container card my-5">
	<h3 class="card-header mb-3">PROJECT (1) 셋팅</h3>
	<ol>
		<li>project 생성</li>
		<li>[inc] - header.jsp / footer.jsp</li>
		<li>[inc] - error_404.jsp / error_500.jsp, [WEB-INF]-web.xml</li>
	</ol>
	
	<h4>ERROR TEST</h4>
	<%-- <a href="no">없는페이지</a>
	<%=null %> --%>
	
	<h4>DBCP TEST</h4>
	<%-- <%
		Context initContext = new InitialContext();  // Context 찾겠다 - Resource
		Context envContext = (Context)initContext.lookup("java:/comp/env");  // 고정코드 환경Context
		DataSource ds = (DataSource)envContext.lookup("jdbc/mbasic");  // pool 이름(db이름)
		Connection conn = ds.getConnection();  // db연동
		out.println("db연동");
	%> --%>
</div> <!-- END DIV -->

<div class="container card my-5">
	<h3 class="card-header mb-3">PROJECT (2) MODEL</h3>
	<pre>
	1. Dto       : [com.company.domain]    - BoardVO      private
	2. DBManager : [com.company.dbmanager] - DBManager
	3. Dao       : [com.company.dao]       - BoardDao
	</pre>
	<%
	BoardDao dao = new BoardDao();
	// 6. delete
	// System.out.println(dao.delete(9));
	// System.out.println(dao.select(9));
	
	// 5. update  기능
	/*
	BoardVO vo = new BoardVO();
	vo.setBtitle("제목-new");
	vo.setBcontent("내용-new");
	vo.setBno(9);
	System.out.println(dao.update(vo));
	System.out.println(dao.select(9));
	*/
	
	// 4. updateHit
	// System.out.println(dao.updateHit(9));  // 1 성공 / -1 실패
	
	// 3. select
	// System.out.println(dao.select(9));  // 있는번호!	
	/*
	// 2. insert(BoardVO vo) - btitle, tcontent, bname
	BoardVO vo = new BoardVO();
	vo.setBtitle("제목");
	vo.setBcontent("내용");
	vo.setBname("first");
	System.out.println(dao.insert(vo));
	*/
	
	// 1. selectAll
	// System.out.println(dao.selectAll());
	%>	
</div> <!-- END DIV -->


<div class="container card my-5">
	<h3 class="card-header mb-3">PROJECT (3) VIEW</h3>
	<pre>
	[WEB-APP] - [board]
		    ㄴ list.jsp
		    ㄴ write.jsp
		    ㄴ detail.jsp
		    ㄴ update.jsp
		    
	1. markup
	2. validator - 오류검사
	3. 빈칸검사
	</pre>
</div>

<%@ include file="inc/footer.jsp" %>