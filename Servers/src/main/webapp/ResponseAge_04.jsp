<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성인확인</title>
</head>
<%
	String age = request.getParameter("age");
	
%>
<h1>성인</h1>

당신의 나이는 <%=age %> 이므로 주류 구매가 가능합니다.
</body>
</html>