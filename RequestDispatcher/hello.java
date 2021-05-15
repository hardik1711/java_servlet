/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hardi
 */
public class hello extends HttpServlet {

    public void doPost(HttpServletRequest request,HttpServletResponse response)
            		 throws ServletException,IOException
    {   response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String username=request.getParameter("login");
        out.println("<h1>"+"Welcome "+username+"</h1>");
    } 

}
