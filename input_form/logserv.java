/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hardik
 */
public class logserv extends HttpServlet {

   PrintWriter out;
    public void init(ServletConfig config)throws ServletException
    {    }
    public void doGet(HttpServletRequest request,HttpServletResponse 									response)
            throws ServletException,IOException
    {
        String email=request.getParameter("email");
        response.setContentType("text/html"); 
        out =response.getWriter();
        out.println("Your email is "+email);
    }
    public void destroy()
    {        out.close();    }

}
