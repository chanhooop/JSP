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
	
	String Num1, Num2,calc;
	String[] calc2;
	
	Num1 = request.getParameter("Num1");
	Num2 = request.getParameter("Num2");
	calc = request.getParameter("calc");
	
	%>

	계산값 : <%=Integer.parseInt(Num1) + calc + Integer.parseInt(Num2) %>

</body>
</html>