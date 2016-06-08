package javaschool.servlets;

import javaschool.dao.ClientAdressDaoImpl;
import javaschool.entity.Client;
import javaschool.entity.ClientAdress;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

public class CabinetServlet extends HttpServlet {
    public void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession httpSesion = req.getSession();
        List<String> atributes = new LinkedList<String>();
        List<String> adress = new LinkedList<String>();
        Client client = ((Client) httpSesion.getAttribute("User"));
        ClientAdress clientAdress = new ClientAdressDaoImpl().getAdress(client);
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        if (client.getName() != null) {
            atributes.add(0, client.getName());
        } else {
            atributes.add(0, "Отсутсвует");
        }
        if (client.getSurname() != null) {
            atributes.add(1, client.getSurname());
        } else {
            atributes.add(1, "Отсутсвует");
        }
        if (client.getEmail() != null) {
            atributes.add(2, client.getEmail());
        } else {
            atributes.add(2, "Отсутсвует");
        }
        if (client.getPassword() != null) {
            atributes.add(3, client.getPassword());
        } else {
            atributes.add(3, "Отсутсвует");
        }
        if (client.getBirthday() != null) {
            httpSesion.setAttribute("date",client.getBirthday());
            atributes.add(4, (format.format(client.getBirthday())));
        } else {

            atributes.add(4, "Отсутсвует");
        }
        if (client.getPermission() != null) {
            if (client.getPermission() == 2) {
                atributes.add(5, "Покупатель");
            } else {
                atributes.add(5, "Сотрудник");
            }
        } else {
            atributes.add(5, "Отсутсвует");
        }
        httpSesion.setAttribute("clienAtributes", atributes);
        req.setAttribute("clienAtributes", atributes);

        if (clientAdress.getCountry() != null) {
            adress.add(0, clientAdress.getCountry());
        } else {
            adress.add(0, "Отсутсвует");
        }
        if (clientAdress.getCity() != null) {
            adress.add(1, clientAdress.getCity());
        } else {
            adress.add(1, "Отсутсвует");
        }
        if (clientAdress.getStreet() != null) {
            adress.add(2, clientAdress.getStreet());
        } else {
            adress.add(2, "Отсутсвует");
        }
        if (clientAdress.getHouse() != null) {
            adress.add(3, clientAdress.getHouse());
        } else {
            adress.add(3, "Отсутсвует");
        }
        if (clientAdress.getFlat() != null) {
            adress.add(4, clientAdress.getFlat());
        } else {
            adress.add(4, "Отсутсвует");
        }
        if (clientAdress.getZipcode() != null) {
            adress.add(5, clientAdress.getZipcode().toString());
        } else {
            adress.add(5, "Отсутсвует");
        }
        httpSesion.setAttribute("clienAdressAtributes", adress);
        req.setAttribute("clienAdressAtributes", adress);
        RequestDispatcher view = req.getRequestDispatcher("cabinet.jsp");
        view.forward(req, resp);
    }
}
