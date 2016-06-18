package javaschool.servlets;

import javaschool.dao.ProductDaoImpl;
import javaschool.entity.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductPageServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        ProductDaoImpl productDao = new ProductDaoImpl();
        Product product = productDao.get(Long.parseLong(req.getParameter("Product")));
        req.setAttribute("Product",product);
        req.setAttribute("Brand",req.getParameter("Brand"));
        req.setAttribute("Collection",req.getParameter("Collection"));

        RequestDispatcher view = req.getRequestDispatcher("product.jsp");
        view.forward(req,resp);
    }
}