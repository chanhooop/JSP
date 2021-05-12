<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <!-- JSTL하려면 이 태그 를 넣어줘야한다! -->   
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- for문과 같은원리 -->
		<c:forEach var="cnt" begin="1" end="15">
			<font size="$[cnt ]">
				대한민국!!<br>
			</font>
		</c:forEach>
	
</body>
</html>









