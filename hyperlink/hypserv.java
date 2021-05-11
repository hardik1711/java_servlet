

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
public class hypserv extends HttpServlet {
String msg="";
    PrintWriter out;
       
    public void init(ServletConfig config)throws ServletException
    {   msg="hello this is  MY first Servlet Program for hyperlink...";
    }
    

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {   response.setContentType("text/html");
        out=response.getWriter();
        out.println("<h1>"+msg+"</h1>");
    }
    public void destroy()
    {   out.close();
    }

}