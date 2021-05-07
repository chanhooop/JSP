
<%@page import="java.util.GregorianCalendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	GregorianCalendar now = new GregorianCalendar();   // 클라스 인스턴스 = new  컨스트럭터   // 날짜를 쓰고 싶으면 그레고리안 캘린더를 불러와서 써야함
	
	String date = String.format("%TF", now); // %TF란 : yyyy _ mm - dd
	String time = String.format("%TT", now); // %TT란 : hh:mm:ss
%>

	<%=now %>
	오늘의 날짜 <%=date %><br>
	현재시간 <%=time %><br>
	<%=String.format("%TY년 %Tm월 %Td" , now, now, now) %> <br>
	<%=String.format("%Th시 %Tm분 % Ts초", now, now, now) %><br>
	
	
	
</body>
</html>