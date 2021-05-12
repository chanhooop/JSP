<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Driver"%>
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

	request.setCharacterEncoding("utf-8");

	String userid = request.getParameter("userid");
	session.setAttribute("USERID", userid);
	
	String strName = null;
	String strTel = null;
	String strAddress = null;
	
	//---데이터 베이스---
	
	String url_mysql = "jdbc:mysql://localhost/customer?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql = "root";
	String pw_mysql = "qwer1234";
	
	
	// select에서는 굳이 안써도 되지만 보안상 업데이트기능에서는 써준다!
	String whereStatement = "select name, tel, address from purchaserinsert where userid = '" + userid+"'";

	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql,pw_mysql);
		Statement stmt_mysql = conn_mysql.createStatement();
		
		ResultSet rs = stmt_mysql.executeQuery(whereStatement);
		while(rs.next()){

			strName = rs.getString(1);
			strTel = rs.getString(2);
			strAddress = rs.getString(3);
			
		}
		conn_mysql.close();

	}catch(Exception e){
		e.printStackTrace();
	}
%>


	<h1>삭제할 고객정보를 확인후 버튼을 누르세요!</h1>
	<form action="purchaserDelete_03.jsp" method="post"> <br>
		사용자 ID:<input type="text" name="userid" value=<%=userid %>><br>
		성명:<input type="text" name="name" value=<%=strName%>><br>
		전화번호:<input type="text" name="tel" value=<%=strTel%>><br>
		주소:<input type="text" name="address" value=<%=strAddress%>><br><br>
		<input type="submit" value="확인">
	</form>
</body>
</html>