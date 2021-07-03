<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Additon</title>
</head>
<body>
	<%
		int a = 10;
		int b = 5;
		int addition = a+b;
		int i = 1;
		%>
		
	<% 
/* 		for(i = 1 ; i<10 ; i++){
			out.println(2 + "*" + i + "=" + (2*i) +"<br>=========<br>");
		} */
	%>
	<%
/* 		while(i<10){		
				out.println(2 + "*" + i + "=" + (2*i) +"<br>=========<br>");
			i++;
		} */
	%>
	<%
		while(i<10){
		if(i%2 > 0){
			out.println(2 + "*" + i + "=" + (2*i) +"<br>=========<br>");
		}
			i++;
		
		}
	%>
	
	
	
	
<%=a %> + <%=b %> = <%=addition %> <br>
<%=a %> - <%=b %> = <%=a-b %> <br>
<%=a %> * <%=b %> = <%=a*b %> <br>
<%=a %> / <%=b %> = <%=a/b %> <br>
<%=a %> % <%=b %> = <%=a%b %> <br>

</body>
</html>