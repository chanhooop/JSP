<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언부</title>
</head>
<body>

<%!
	int i = 10 ;
	String str = "I have a dream.";
%>
<%
	out.println("i  = " + i +"<br>");
	out.println("str  = " + str + "<br>");
	out.println("sum  = " + sum(12,15) + "<br>");

%>




</body>
</html>
<%!
	// 메소드 선언자는 따로 있어야지 사용가능함, 선안자의 위치는 어디에 있던지 사용가능함
	public int sum(int a, int b){  
	return a+b;
	}
%>