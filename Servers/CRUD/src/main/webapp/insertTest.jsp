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
		var form = document.loginForm;  //반복되는 부분 변수로 만들수 있다
		 	      //document는 이 문서. loginForm은 폼태그 이름
		
		// Empty Check
		if(form.userid.value == ""){
			alert("제대로 입력하세요!");
			form.id.focus();
			return false; //false값을 안줘버리면 액션페이지로 넘어가 버린다!!
		}
		
		form.submit();  //submit 은 자바스크립에서 해준다 인풋타입을 버튼으로 해줘야한다!!!1
		
	}
</script>
<body>
	<h3>데이터 입력을 위한 테스트</h3>
	<form name="loginForm" action="insertTest02.jsp" method="get">
		사용자ID : <input type="text" name="userid" size="10">
		<input type="button" value="입력" onclick="checkLogin()">
	
	</form>
</body>
</html>