import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Enumeration; 

import freeVue.Database;
import freeVue.Screening;

public class ScreeningsServlet extends HttpServlet {
    int accesses = 0;

    Database db = new Database();
    Screening screenings[];

    public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException
    {
        db.getScreenings();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Enumeration<String> params = request.getParameterNames();
        while(params.hasMoreElements()){
            String name = params.nextElement(); 
            out.print("<p>" + name + "=" + request.getParameterValues(name)[0] + "</p>");
        }
    }
} 