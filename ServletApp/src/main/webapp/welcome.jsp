<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demonstration</title>
</head>
<body>
	<%!int count = 0;

		public int incrementCount() {
			count++;
			return count;
		}%>
	
	<%
		int count = incrementCount();
		//out.print(count);
	%>
	
	<h1>
	you are a visitor number : <b><%=count%></b>
	</h1>
	<p>Result of 10+20: <b><%= 10+20 %></b></p>
	
</body>
</html>