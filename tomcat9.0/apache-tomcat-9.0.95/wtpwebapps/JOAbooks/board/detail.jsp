<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp"%>

<div class="container card  my-5  p-3">
	<%-- <%= request.getAttribute("dto") %> --%>
	<!-- 주소표시창 줄에서 : http://localhost:8080/JOAbooks/detail.do?bno=8 번호있는거 -->
	<h3 class="card-header mb-3">MULTIBOARD 상세보기</h3>
	<div class="my-3 ">
		<div class="">
			<span><i class="bi bi-book-half"></i> 조회수</span>
			<p>${dto.bhit}</p>
		</div>
	</div>
	<div class="my-3">
		<div class="">
			<span><i class="bi bi-book-half"></i> 이름</span>
			<p>${dto.bname}</p>
		</div>
	</div>
	<div class="my-3">
		<div class="">
			<span><i class="bi bi-book-half"></i> 제목</span>
			<p>${dto.btitle}</p>
		</div>
	</div>
	<div class="my-3">
		<div class="">
			<span><i class="bi bi-book-half"></i> 내용</span>
			<textarea class="from-control" readonly>${dto.bcontent}</textarea>
		</div>
	</div>
	<div class="text-end">
		<a href="edit_view.do?bno=${dto.bno}" class="btn btn-primary my-2" style="display:block; width:100%">수정</a>
		<a href="delete.do?bno=${dto.bno}" class="btn btn-outline-primary my-2" style="display:block; width:100%">삭제</a>
		<a href="list.do" class="btn btn-outline-primary my-2" style="display:block; width:100%">목록보기</a>
	</div>
</div>

<%@ include file="../inc/footer.jsp"%>