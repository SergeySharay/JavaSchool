package javaschool.servlets;

import javaschool.dao.ClientAdressDaoImpl;
import javaschool.dao.ClientDaoImpl;
import javaschool.entity.Client;
import javaschool.entity.ClientAdress;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class RegistrationServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();

        Client client = new Client();
        ClientDaoImpl clientDao = new ClientDaoImpl();
        ClientAdress clientAdress = new ClientAdress();
        ClientAdressDaoImpl clientAdressDao = new ClientAdressDaoImpl();

        if (clientDao.getClient(req.getParameter("user_name")) == null) {
            if (req.getParameter("pass_word").equals(req.getParameter("password_confirmation"))) {

                client.setEmail(req.getParameter("user_name"));
                client.setName(req.getParameter("first_name"));
                client.setSurname(req.getParameter("last_name"));
                client.setPassword(req.getParameter("pass_word"));
                client.setPermission(2);
                client.setBirthday(null);

                clientAdress.setClient(client);
                clientAdress.setCountry(null);
                clientAdress.setCity(null);
                clientAdress.setStreet(null);
                clientAdress.setHouse(null);
                clientAdress.setFlat(null);
                clientAdress.setZipcode(null);

                clientAdressDao.add(clientAdress);
                req.setAttribute("emailerror", "");
                req.setAttribute("passerror", "");

                RequestDispatcher view = req.getRequestDispatcher("login.jsp");
                view.forward(req, resp);
            } else {
                req.setAttribute("passerror", "true");
                RequestDispatcher view = req.getRequestDispatcher("reg.jsp");
                view.forward(req, resp);
            }
        } else {
            req.setAttribute("emailerror", "true");
            RequestDispatcher view = req.getRequestDispatcher("reg.jsp");
            view.forward(req, resp);
        }
    }
}
