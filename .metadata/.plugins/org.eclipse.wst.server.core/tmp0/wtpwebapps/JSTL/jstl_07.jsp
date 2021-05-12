<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <!-- JSTL하려면 이 태그 를 넣어줘야한다! -->   
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인사하기</title>
</head>
<body>

  <!-- while case문과 같은원리 -->
	<c:choose>
		<c:when test="${param.num1 == 0 }">
			처음 뵙겠습니다.<br>
		</c:when>
		<c:when test="${param.num1 == 1 }">
			반갑습니다.<br>
		</c:when>
		<c:otherwise>
		안녕하세요.
		</c:otherwise>
	</c:choose>
</body>
</html>