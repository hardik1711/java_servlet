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
public class httpservlet extends HttpServlet {
 public void doGet(HttpServletRequest req,HttpServletResponse res){
        
          
        
            PrintWriter out = res.getWriter();
                  
            
            out.println("<h1>httpservlet doGet Method</h1>");
           
        } 
}