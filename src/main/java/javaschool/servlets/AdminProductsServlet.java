package javaschool.servlets;

import javaschool.dao.ProductDaoImpl;
import javaschool.entity.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class AdminProductsServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        ProductDaoImpl productDao = new ProductDaoImpl();
        List<Product> productList = productDao.getProducts();
        httpSession.setAttribute("productList",productList);
        RequestDispatcher view = req.getRequestDispatcher("adminproducts.jsp");
        view.forward(req, resp);
    }}
