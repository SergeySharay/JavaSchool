package javaschool.servlets;

import javaschool.dao.ClientAdressDaoImpl;
import javaschool.entity.Client;
import javaschool.entity.ClientAdress;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AdressServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        HttpSession httpSession = req.getSession();
        Client client = ((Client) httpSession.getAttribute("User"));
        ClientAdress clientAdress = new ClientAdressDaoImpl().getAdress(client);

        ClientAdressDaoImpl clientAdressDao = new ClientAdressDaoImpl();

        if (!req.getParameter("country").equals("")) {
            clientAdress.setCountry(req.getParameter("country"));
        }
        if (!req.getParameter("city").equals("")) {
            clientAdress.setCity(req.getParameter("city"));
        }
        if (!req.getParameter("street").equals("")) {
            clientAdress.setStreet(req.getParameter("street"));
        }
        if (!req.getParameter("house").equals("")) {
            clientAdress.setHouse(req.getParameter("house"));
        }
        if (!req.getParameter("flat").equals("")) {
            clientAdress.setFlat(req.getParameter("flat"));
        }
        if (!req.getParameter("zipcode").equals("")) {
            clientAdress.setZipcode(Long.parseLong(req.getParameter("zipcode")));
        }

        clientAdressDao.update(clientAdress);
        resp.sendRedirect("Cabinet");
    }
}
