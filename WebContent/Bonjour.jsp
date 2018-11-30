<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bonjour</title>
</head>
<body>
	<big> <%
 	if (request.getParameter("nom") == null) {
 		out.println("Bonjour tout le monde.");
 	} else {
 		out.println("Bonjour, " + request.getParameter("nom"));
 	}
 %>
	</big>

	<p>
		La date est le :
		<%=new java.util.Date()%></p>
</body>
</html>