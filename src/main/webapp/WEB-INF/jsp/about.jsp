<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"

     %>
<%@ page import="java.util.List"
          import="java.util.Date"
          import= "org.learn.model.Person"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>About page</h2>
<h1>Called from controller</h1>
<%
    Person person =(Person) request.getAttribute("person");
%>
<h1><%= person %></h1>
</body>
</html>
