<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Practice</title>
</head>
<body>
 <H1>Hello world JSP!!</H1>
 <%
 	String responcecheck = request.getParameter("office");
 	if	(responcecheck != null){
 		response.setStatus(response.SC_MOVED_TEMPORARILY);
 		response.setHeader("location", "responceredirect.jsp?office="+responcecheck);
 	}
 	String errorcheck = request.getParameter("error");
 	if	(errorcheck != null){
 		int x=0;
 		if(x==0){
 			throw new RuntimeException("Exception!!");
 		}
 	}
 %>
 <a href = index.jsp?office=Head_office>Show me the usage of response redirect!</a>
 <br/>
 <a href = index.jsp?error=1>Show me how Error Works!</a><br>
 
 <%
	if(response.containsHeader("office"))
		out.print("Current Location of the user: "+request.getHeader("office"));
%>

<%
	int port = request.getServerPort();
	out.println("Server is running on Port :"+port+"<br>");
	out.println("CONFIG OBJECT: : "+config.getServletName()+"<br>");
	out.println("APPLICATION OBJECT: : "+application.getServerInfo()+"<br>");
	out.println("PAGE OBJECT: : "+page.toString()+"<br>");

%>
 
</body>
</html>