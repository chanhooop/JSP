<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<script type="text/javascript">
	function checkLogin() {
		var form = document.loginForm  //반복되는 부분 변수로 만들수 있다
		if(form.id.value == ""){
			alert("아이디를 입력해주세요!");
			form.id.focus();
			return false; //false값을 안줘버리면 액션페이지로 넘어가 버린다!!
		}else if(form.passwd.value == ""){
			alert("비밀번호를 입력해 주세요!")
			form.passwd.focus();
			return false;
		}
		form.submit();  //submit 은 자바스크립에서 해준다 인풋타입을 버튼으로 해줘야한다!!!1
		
	}
</script>

<body>
	<form name="loginForm" action="validation02_Process.jsp" method="post">
		<p>아이디 : <input type="text" name="id"></p>
		<p>비밀번호 : <input type="password" name="passwd"></p>
		<p><input type="button" value="전송" onclick="checkLogin()"></p>
	</form>

</body>
</html>