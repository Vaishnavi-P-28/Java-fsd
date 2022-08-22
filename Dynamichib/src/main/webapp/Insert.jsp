<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="Dynamic.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String user=request.getParameter("name");
System.out.println("Testing");
Employee e=new Employee();
e.setName(user);
InsertDAO dao=new InsertDAO();
int res;
res=dao.insert(e);
if(res>0) {
out.print("insertion done");
}
%>
<form action="Retrieve.jsp" method="post">
<input type="submit" value="getdetails">
</form>
</body>
</html>