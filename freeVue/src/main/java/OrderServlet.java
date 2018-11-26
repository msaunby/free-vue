import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Enumeration; 

public class OrderServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException
    {

        String password = request.getParameterValues("password")[0];
        String email = request.getParameterValues("email")[0];
        String screening = request.getParameterValues("screening")[0];
        String quantity = request.getParameterValues("quantity")[0];

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<html><body><h1>Order confirmation</h1>");
        out.print("<p>email : " + email + "</p>");
        out.print("<p>screening : " + screening + "</p>");
        out.print("<p>quantity : " + quantity + "</p>");

        out.print("</body></html>");
    }
} 