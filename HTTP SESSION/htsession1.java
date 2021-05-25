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
import javax.servlet.http.HttpSession;

/**
 *
 * @author hardik
 */
public class htsession1 extends HttpServlet {

 
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        response.setContentType("text/html");
PrintWriter out=response.getWriter();
RequestDispatcher rd;
String login=request.getParameter("login");
if(login.equals("java") )
{   HttpSession hs=request.getSession();
    hs.setAttribute("s_id",login);//set HttpSession 
    out.println("Session Created");
    out.print("<a href='htsession2'>Homepage</a>");  
}
else
{   out.println("<h1>Incorrect Login Id/Password </h1>");
    rd=request.getRequestDispatcher("/index.html");
    rd.include(request, response);}

    }


    }


