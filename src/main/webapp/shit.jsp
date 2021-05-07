<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="shit2.jsp" method="get">

		<select name="Num1">
			<%
			for (int i = 1; i < 1000; i++) {
				out.println("<option value=\"" + i + "\">" + i + "</option>");
			}
			%>
			
		</select> 
		
		<select name="calc">
		
			<option value= + > + </option>
			<option value= - > - </option>
			<option value= * > X </option>
		<!-- 	<option value= / > / </option> -->
			
		</select>
		
		
		<select name="Num2">
			<%
			for (int i = 1; i < 1000; i++) {
				out.println("<option value=\"" + i + "\">" + i + "</option>");
			}
			%>
			
		</select> <br> 
		
		
		
		
		<input type="submit" value="계산">


	</form>

</body>
</html>