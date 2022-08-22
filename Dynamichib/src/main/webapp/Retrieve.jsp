<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="Dynamic.*" %>
    <%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
InsertDAO dao=new InsertDAO();
List<Employee> e=dao.get();
%>
<table  border="1">
<tr><th>id</th><th>name</th></tr>
<%for(Employee ee:e){ %>
<tr><td><%=ee.getId()%></td><td><%=ee.getName() %></td></tr>
<%} %>
</table>
</body>
</html>