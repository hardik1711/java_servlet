
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

/**
 *
 * @author hardik
 */
public class welcome extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

     
     response.setContentType("text/html");
     PrintWriter out=response.getWriter();
     String session=request.getParameter("session_id");
     String user=request.getParameter("login");
     out.println("<h1>Id:"+session+"</h1>");
     out.println("<h2> Welcome"+user+"</h2>");
}
}
