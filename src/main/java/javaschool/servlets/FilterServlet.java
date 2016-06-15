package javaschool.servlets;

import javaschool.dao.ProductDaoImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FilterServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductDaoImpl productDao = new ProductDaoImpl();

        req.setAttribute("FilterCollections",productDao.getCollections());
     //   req.setAttribute("FilterProducts",productDao.getProducts());

        RequestDispatcher view = req.getRequestDispatcher("filter.jsp");
        view.forward(req,resp);

    }
    public static boolean equals(String str1, String str2) {
        return str1 == null ? str2 == null : str1.equals(str2);
    }
    }
