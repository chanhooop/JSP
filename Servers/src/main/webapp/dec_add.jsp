<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언부를 이용한 덧셈</title>
</head>
<body>


	<%
	for(int i = 1; i<=5 ; i++){
		
		out.println("2^ " + i + " = " +  Math.pow(2, i) +"<br>-----------------------------------------<br>");
	}
	%>

	2^2 = <%=decadd(2) %> <br>
	2^3 = <%=decadd(3) %> <br>
	2^4 = <%=decadd(4) %> <br>
	2^5 = <%=decadd(5) %> <br>

</body>
</html>

<%! 
		private int decadd (int a) {
					
			int j = (2 * 2) * (a-1);
		
			return j;
		

	}
%>