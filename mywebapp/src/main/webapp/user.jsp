<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<jsp:include page="header.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action elements Demo</title>
</head>
<body>
	<jsp:useBean id="user" class="mywebapp.User" scope="session"/>
	
	<jsp:setProperty property="userName" name="user" value="Avinash"/>
	
	<jsp:setProperty property="email" name="user" value="avi@gmail.com"/>
	
	<p>Username: <jsp:getProperty property="userName" name="user"/></p>
	<p>Email: <jsp:getProperty property="email" name="user"/></p>
	
	<%out.println("avinashPrince"); %>
	
	<p><%=user.getUserName() %></p>
	<%-- <%
	if("Avinash1".equals(user.getUserName())){
	%>
	<jsp:forward page="success.jsp"/>
	<%
	}
	%> --%>
	
</body>
</html>