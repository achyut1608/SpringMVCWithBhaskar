<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"

     %>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">

<html>
<title>Success Signup</title>
<body>
<h2>Hello World!</h2>
<h1>Called from signup</h1>

   <%

    /*String email = (String) request.getAttribute("email");
    String username  = (String)request.getAttribute("username");
    String password=(String) request.getAttribute("password");
    out.println("email : "  + email);
    out.println("username : " + username);
*/
   %>
    <h1>${user.txtEmail}</h1>
    <h1>${user.txtUsername}</h1>
   <h1>"Password : " + ${user.txtPassword} </h1>

</body>
</html>
