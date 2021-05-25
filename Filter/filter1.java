/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hardik
 */
public class filter1 implements Filter {

public void init(FilterConfig arg0) throws ServletException {

}

public void doFilter(ServletRequest req, ServletResponse resp,FilterChain chain)                              			    throws IOException, ServletException 
{ PrintWriter out=resp.getWriter();
  out.print("filter is invoked before");//exe. with request
  chain.doFilter(req, resp);//send request to nextresource
  out.print("filter is invoked after");//exe. with response
}
public void destroy() {

}
}


    