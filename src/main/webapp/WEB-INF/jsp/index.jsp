<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"

     %>
<%@ page import="java.util.List"
          import="java.util.Date"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">

<html>
<body>
<h2>Hello World!</h2>
<h1>Called from controller</h1>
    <%
        String name =(String) request.getAttribute("name");
        Integer id = (Integer) request.getAttribute("id");
        List<String> list= (List<String>)request.getAttribute("list");
    %>
    <h1><%=name%></h1>
    <h2><%=id%></h2>
    <%
        for(String s:list){
    %>

        <h3> <%=s%></h3>
    <%
    }
    %>
    <h1>Date is : <%=new Date()%></h1>
    <a href="help">Go to Help Page</a>
    <a href="contact">Go to contact Page</a>
    <a href="userregistration">User Registration></a>
    <a href="complex">Go to Complex form</a>
</body>
</html>
