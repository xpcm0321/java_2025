<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page  isErrorPage="true" %>    
<%  response.setStatus(200); %>    
<!DOCTYPE html>
<html  lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card  my-5">
		<%=exception.getMessage() %>
		
		<a href="<%=request.getContextPath()%>/"  class="btn btn-danger">HOME</a>
	</div>
</body>
</html> 
