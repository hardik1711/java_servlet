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


/**
 *
 * @author hardik
 */
public class filter2 implements Filter {
String permission;
 
    /**
     *
     * @param config
     * @throws ServletException
     */
@Override
    public void init(FilterConfig config) throws ServletException 
{           permission=config.getInitParameter("permit");       }
@Override
public void doFilter(ServletRequest req, ServletResponse resp,FilterChain chain) throws IOException, ServletException 
{		PrintWriter out=resp.getWriter();
		out.print("<p>filter2 is invoked before</p>");

              if(permission.equals("yes"))
               { chain.doFilter(req, resp);}//if
              else
               { out.println("Permission Denied"); }//else

		out.print("<p>filter2 is invoked after</p>");		}
@Override
	public void destroy() {}
  
}
