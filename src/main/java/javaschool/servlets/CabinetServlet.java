package javaschool.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CabinetServlet extends HttpServlet {
    public void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("cabinet.jsp");
        view.forward(req, resp);
    }

    public void doPost(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("cabinet.jsp");
        view.forward(req, resp);
    }
}
