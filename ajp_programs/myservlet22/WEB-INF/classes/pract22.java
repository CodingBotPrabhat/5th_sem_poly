import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class pract22 extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws
IOException, ServletException
{
String color=req.getParameter("Color");
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
pw.println("<b> Selected Color: ");
pw.println(color);
pw.close();
}
}