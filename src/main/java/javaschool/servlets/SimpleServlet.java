package javaschool.servlets;

import javaschool.DAO.ClientDAOImpl;
import javaschool.entity.Client;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;


public class SimpleServlet extends HttpServlet {


    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");

        PrintWriter pw = resp.getWriter();
        pw.write("<!DOCTYPE html>\n" + // Записываем в ответ HTML код простейшей странички
                "<html>\n" +
                "<head><title>Servlet</title></head>\n<body>\n");
        pw.println("<H1>SELECT * FROM clients</H1>");
        String query= "SELECT * FROM clients";

            ClientDAOImpl clientDAO = new ClientDAOImpl();
            for (Client client: clientDAO.getClients()){
                pw.println(client.getName() + "\n");
                pw.println("\n");}
        pw.write("</body></html>");
    }
}

