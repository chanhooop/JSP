<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>반갑습니다.</title>
</head>
<body>
	<%
	 request.setCharacterEncoding("utf-8");  // post 방식으로 할 때 무조건 해줘야지 한글이 안깨진다!!!!!!!!!
	%>

	안녕하세요, <%=request.getParameter("yournamwe") %>님!

</body>
</html>