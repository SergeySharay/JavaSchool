package javaschool.servlets;

import javaschool.dao.ProductDaoImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CollectionServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductDaoImpl productDao = new ProductDaoImpl();
        req.setAttribute("Collections",productDao.getCollections(req.getParameter("Brand")));
        req.setAttribute("ProductsInCollection",productDao.getProducts(req.getParameter("Brand"), req.getParameter("Collection")));
        RequestDispatcher view = req.getRequestDispatcher("collection.jsp");
        view.forward(req,resp);
    }
    }
