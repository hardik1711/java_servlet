/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hardi
 */
public class dispatcher extends HttpServlet {

public void doPost(HttpServletRequest request , HttpServletResponse response) 
throws ServletException,IOException
    {   
      response.setContentType("text/html");
PrintWriter out =response.getWriter();
RequestDispatcher rd;
String login=request.getParameter("login");
String pass=request.getParameter("pass");
if(login.equals("hardik") && pass.equals("java")){
    rd=request.getRequestDispatcher("hello");
    rd.forward(request,response);
    
}
else{
    out.println("<h1>Incorrect passsword</h1>");
    rd=request.getRequestDispatcher("/index.html");
    rd.include(request,response);
}
}
