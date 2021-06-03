<%-- 
    Document   : newjsp
    Created on : 3 Jun, 2021, 11:39:26 PM
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
      Current Time: <%= java.util.Calendar.getInstance().getTime() %>  
    </body>
</html>
