<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Sessions</title>
</head>
<body>

<%
	if(request.getParameter("error")!=null){
		out.println("<b>Session is Invalid or Expired</b><br>");
	}
%>
<form action = "login.jsp" method = "post">
	UserName:<input type = "text" name = "name" id="name" maxlength=10/>
	Password:<input type = "password" name = "password" id="password" maxlength=10/>
	<button>Submit</button>
</form>
</body>
</html>