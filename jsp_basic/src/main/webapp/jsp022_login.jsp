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
	<div class="container card my-5">
		<div class="my-5"><%=session.getAttribute("username") %></div>
	
		<h3 class="card-header mb-3">LOGIN</h3>
		<p style="text-align: center;"><img src="images/login.png" alt="login"></p>
		<form action="jsp022_login_action.jsp" method="post" onsubmit="return login()">
			<div class="my-3">
				<label for="name" class="form-label">아이디</label>
				<input type="text" class="form-control" id="name" name="name">
			</div>
			<div class="my-3">
				<label for="pass" class="form-label">비밀번호</label>
				<input type="password" class="form-control" id="pass" name="pass">
			</div>
			<div class="my-3">
				<label for="check" class="form-label">
					<input type="checkbox" id="check" name="remember"> 아이디 기억하기
				</label>
			</div>
			<div class="my-3" style="text-align:right">
				<input type="submit" title="login 하러가기" class="btn btn-success" value="LOGIN" />
			</div>
		</form>
	</div>
	
	<script>
	function login() {
		let name = document.querySelector("#name");
		let pass = document.querySelector("#pass");
		
		if (name.value == "") {
			alert("빈칸입니다. \n확인해주세요.");
			name.focus();
			return false;
		}
		if (pass.value == "") {
			alert("빈칸입니다. \n확인해주세요.");
			pass.focus();
			return false;
		}
	}
	</script>
	<div class="container card my-5">
		<pre class="bg-success text-white p-3">
	    Q1. 아이디와 비밀번호 빈칸검사
	    Q2. 처리경로 : jsp022_login_action.jsp  / 아이디와 비밀번호 데이터값 노출안됨.
	    Q3. jsp022_login_action.jsp 
          - 데이터값 넘겨받기
          - 드라이버연동 / db연동 / sql처리 / 결과값 확인
          - 아이디와 비밀번호가 같은지 member에서 검색
          - 찾았으면 [경로안바뀌게] , 보이는 화면은 jsp022_my.jsp 페이지로 넘어가기 / 
            못찾았으면 정보를 확인해주세요~ 알림창띄우고 로그인페이지로  jsp022_login.jsp 페이지로
          
         mysql> desc member;
         +-------+--------------+------+-----+---------+----------------+
         | Field | Type         | Null | Key | Default | Extra          |
         +-------+--------------+------+-----+---------+----------------+
         | no    | int          | NO   | PRI | NULL    | auto_increment |  id를 name로 체크!
         | name  | varchar(100) | NO   |     | NULL    |                |
         | pass  | varchar(50)  | NO   |     | NULL    |                |
         +-------+--------------+------+-----+---------+----------------+
         3 rows in set (0.00 sec)
         
         mysql> select * from member;
         +----+--------+------+
         | no | name   | pass |
         +----+--------+------+
         |  1 | first  | 11   |
         |  2 | second | 22   |
         |  3 | third  | 33   |
         |  4 | fourth | 44   |
         +----+--------+------+
         4 rows in set (0.00 sec)

      Q4. login.jsp/ my.jsp 두군데서 사용할 header 만들기
      Q5. 로그인시 아이디 유지하기 (session)
      Q6. 로그인시 아이디유지하기 체크하면 아이디 유지하게 만들기  (cookie)
      </pre>
	</div>
</body>
</html>