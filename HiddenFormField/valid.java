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
public class valid extends HttpServlet {

  

   public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html");
       PrintWriter out=response.getWriter();
       RequestDispatcher rd;
       String login=request.getParameter("login");
       String pass=request.getParameter("pwd");
       String Session=request.getParameter("session_id");
       
       if(login.equals("hardik") && pass.equals("java")){
           rd=request.getRequestDispatcher("welcome");
           rd.forward(request, response);
       }
       else{
           out.println("<h1>Incorrect login Id /password</h1>");
           rd=request.getRequestDispatcher("/index.html");
           rd.include(request, response);
           
       }
    }

   
}
