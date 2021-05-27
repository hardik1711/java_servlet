<%-- 
    Document   : newjsp
    Created on : 26 May, 2021, 6:54:43 PM
    Author     : hardik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <hr>
        
        <%
            int num = 100;
        %>
        
        <b> <% out.write(num+""); %> </b>
        
        
        
        
      
        
    </body>
</html>