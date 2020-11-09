import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowAdsServlet", urlPatterns = "/ads")
public class ShowAdsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Ads listAddsDao = DaoFactory.getAdsDao();
        List<Ad> ads = listAddsDao.all();
        request.setAttribute("ads", ads);
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
    }
}
