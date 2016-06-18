package javaschool.servlets;

import javaschool.crud.Bucket;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class OrderServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Bucket.add(req,Long.parseLong(req.getParameter("Product")));
        RequestDispatcher view = req.getRequestDispatcher("Collection");
        view.forward(req,resp);
    }
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Bucket.add(req,Long.parseLong(req.getParameter("Product")));
        RequestDispatcher view = req.getRequestDispatcher("Filter");
        view.forward(req,resp);
    }
}
