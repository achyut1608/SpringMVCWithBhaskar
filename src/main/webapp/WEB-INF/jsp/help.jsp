<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"

     %>
<%@ page  import="java.util.List"
          import="java.util.Date"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>Hello World!</h2>
<h1>Called from controller</h1>
    <%
        //String name =(String) request.getAttribute("name");

    %>

    <h1>Date is : <%=new Date()%></h1>
    <hr>
    <%
        String name=(String)request.getAttribute("name");
        List<Integer>list = (List<Integer>)request.getAttribute("list");
    %>
    <h1><%= name%></h1>
    <h1><%=list%>
</body>
</html>
