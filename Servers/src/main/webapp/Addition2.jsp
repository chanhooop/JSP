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
		int j = 0;
		for(int i = 0 ; i <=200 ; i ++){
			
			j = i + j ;
		}
		
		out.println(j);
		%>

</body>
</html>