<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 정보 입력 결과</title>
</head>
<body>

<%

	request.setCharacterEncoding("utf-8");

	String name, id, pw, majorOne, protocol ;
	String[] hobbises, majors;


	name = request.getParameter("name");
	id = request.getParameter("id");
	pw = request.getParameter("pw");
	hobbises = request.getParameterValues("hobby");	
	majors = request.getParameterValues("major");
	majorOne = request.getParameter("mayjor");
	protocol = request.getParameter("protocol");
%>

	이름 : <%=name %><br>
	아이디 : <%=id %><br>
	패스워드 : <%=pw %><br>
	취미 : <%= Arrays.toString(hobbises) %><br>
	전공 : <%= Arrays.toString(majors) %><br>
	전공2: <%= majorOne %><br>
	Protocol : <%=protocol %>

</body>
</html>