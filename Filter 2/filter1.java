
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
public abstract class filter1 implements Filter {

    @Override
    public void init(FilterConfig config) {}
    @Override 
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) 
                     throws IOException, ServletException 
{  PrintWriter out=resp.getWriter();
   out.print("<p>filter1 is invoked before</p>");
   if(req.getParameter("login").equals("java") && 
      req.getParameter("pwd").equals("root"))
  { chain.doFilter(req, resp);//send request to next resource
  }//if
  else
  {out.print("<p>invalid login/password</p>");}//else
	
  out.print("<p>filter1 is invoked after</p>");		
}
    @Override
    public void destroy() {}} 

 


