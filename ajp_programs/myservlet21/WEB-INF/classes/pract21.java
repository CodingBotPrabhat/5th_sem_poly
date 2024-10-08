import javax.servlet.*;
import java.io.*;
public class pract21 extends GenericServlet
{public void service(ServletRequest req , ServletResponse res) throws ServletException , IOException
{    PrintWriter pw = res.getWriter();
res.setContentType("text/html");
    pw.println("<html>");
    pw.println("<head>");
    pw.println("</head>");
    pw.println("<body>");
    pw.println("<h1> HELLO MSBTE</h1>");
    pw.println("</body>");
    pw.println("</html>");
}
}
