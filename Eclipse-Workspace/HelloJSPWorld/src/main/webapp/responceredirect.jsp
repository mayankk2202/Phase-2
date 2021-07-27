<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GET Header TEST</title>
</head>
<body>
<%
	String office = request.getParameter("office");
	if (office !=null){
		out.println("Value of the office is:"+office);
	}else{
		out.println("No Value Found");
	}
%>

<br><a href = index.jsp>Home</a>
</body>
</html>