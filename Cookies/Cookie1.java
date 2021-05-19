/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hardi
 */
public class Cookie1 extends HttpServlet {

 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String login=request.getParameter("login");
        String Pass=request.getParameter("pwd");
        if(login.equals("hardik") && Pass.equals("java")){
            Cookie c = new Cookie("c1",login);
            response.addCookie(c);
            out.println("cookie:-"+c.getName()+"added");
            String path="/Cookie/Cookie2";
            out.println("<a href="+path+"> clickme</a>");
        }
        else{
            
        }
    }

   
        
    }


