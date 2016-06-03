package javaschool.servlets;

import javaschool.dao.ClientDaoImpl;
import javaschool.entity.Client;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class RegistrationServlet extends HttpServlet {
        public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            HttpSession session = req.getSession();

            Client client = new Client(req.getParameter("user_name"),req.getParameter("first_name"),
                    req.getParameter("last_name"),req.getParameter("pass_word"));

            ClientDaoImpl clientDao = new ClientDaoImpl();
            clientDao.add(client);
            RequestDispatcher view = req.getRequestDispatcher("login.jsp");
            view.forward(req, resp);

    }
}
