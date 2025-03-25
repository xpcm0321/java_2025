<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card my-5 bg-success">
		
		<div class="my-5 text-white"><%=session.getAttribute("username") %></div>
	
		<h3 class="card-header text-white">MY INFO</h3>
		<table class="table table-bordered table-striped table-hover my-3">
			<tbody>
				<tr>
					<th scope="col">NO</th>
					<td></td>
				</tr>
				<tr>
					<th scope="col">NAME</th>
					<td></td>
				</tr>
				<tr>
					<th scope="col">PASS</th>
					<td></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>