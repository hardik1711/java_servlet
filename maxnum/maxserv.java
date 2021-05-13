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
 * @author hardik
 */
public class maxserv extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doPost(HttpServletRequest request,HttpServletResponse response ) throws ServletException,IOException{
     int n1=0,n2=0;
     response.setContentType("/html/text");
     PrintWriter out=response.getWriter();
     n1=Integer.parseInt(request.getParameter("n1"));
     n2=Integer.parseInt(request.getParameter("n2"));
     if(n1>n2){
         out.println("n1"+n1+"is greater then n2");
    
     }else if(n2>n1){
         out.println("n2"+n2+"is greater then n1");
     }else if(n1==n2){
         out.println("both n1 and n2 are equal");
     }
     
 }
}
