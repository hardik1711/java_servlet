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
public class Url2 extends HttpServlet {

 
   public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{


  response.setContentType("text/html");
  PrintWriter out=response.getWriter();
  String session1=request.getParameter("s_id1");
  String session2=request.getParameter("s_id2");
  out.println("<h1> id:-"+session1+"</h1>");
  out.println("<h1> id:-"+session2+"</h1>");
   
    }

}
