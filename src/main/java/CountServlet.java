import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {

    private int pageCount;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String newPageCountString = request.getParameter("countNum");
        if (newPageCountString != null) {
            pageCount = Integer.parseInt(newPageCountString);
        }


        pageCount++;

        PrintWriter out = response.getWriter();
        out.println("<h2>Total page views: " + pageCount + "</h2>");
    }

}
