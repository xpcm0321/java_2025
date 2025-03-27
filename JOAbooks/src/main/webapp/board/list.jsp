<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp" %>
	<div class="container card my-5">
		<h3>MULTIBOARD</h3>
		<table class="table table-striped table-hover table-bordered text-center">
			<caption>MULTIBOARD-LIST</caption>
			<tbody>
				<tr>
					<th>NO</th>
					<th>TITLE</th>
					<th>WRITER</th>
					<th>DATE</th>
					<th>HIT</th>
				</tr>
				<tr>
					<td>1</td>
					<td><a href="detail.jsp">첫번째글쓰기입니다.</a></td>
					<td>ADMIN</td>
					<td>2020-01-02 13:14:30</td>
					<td>1</td>
				</tr>
			</tbody>
		</table>
		<p class="text-end"><a href="write.jsp" class="btn btn-primary">글쓰기</a></p>
	</div>
<%@ include file="../inc/footer.jsp" %>