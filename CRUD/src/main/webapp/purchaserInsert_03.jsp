<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("utf-8"); %>

<%= session.getAttribute("USERID")%>
<%= session.getAttribute("NAME")%>
<%= session.getAttribute("TEL")%>
<%= session.getAttribute("ADDRESS")%>
 
<% session.invalidate();%>

</body>
</html>