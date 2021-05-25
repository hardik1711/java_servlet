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
import javax.servlet.http.HttpSession;

/**
 *
 * @author hardi
 */
public class htsession3 extends HttpServlet {

  

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        response.setContentType("text/html");
   PrintWriter out=response.getWriter();
   HttpSession hs=request.getSession(false);  
   String n=(String)hs.getAttribute("s_id");  
   out.print("Hello again "+n); 
   out.println("<form action='/htsession/htsession4'>");
   out.println("<p><input type='submit'value='End Session'></p></form>");
   hs.invalidate();//Session Invalidated   

    }

   

}
