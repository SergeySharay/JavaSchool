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

public class AdminProductPageServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        ProductDaoImpl productDao = new ProductDaoImpl();
        Product product = productDao.get(Long.parseLong(req.getParameter("productId")));
        httpSession.setAttribute("productPage",product);
        RequestDispatcher view = req.getRequestDispatcher("adminproductpage.jsp");
        view.forward(req, resp);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        HttpSession httpSession = req.getSession();
        ProductDaoImpl productDao = new ProductDaoImpl();
        Product product = productDao.get(Long.parseLong(req.getParameter("productId")));

        if (!req.getParameter("brand").equals("")) {
            product.setBrand(req.getParameter("brand"));
        }
        if (!req.getParameter("collection").equals("")) {
            product.setCollection(req.getParameter("collection"));
        }
        if (!req.getParameter("name").equals("")) {
            product.setName(req.getParameter("name"));
        }
        if (!req.getParameter("price").equals("")) {
            product.setPrice((Long.parseLong(req.getParameter("price"))));
        }
        if (!req.getParameter("length").equals("")) {
            product.setLength((Long.parseLong(req.getParameter("length"))));
        }
        if (!req.getParameter("width").equals("")) {
            product.setWidth((Long.parseLong(req.getParameter("width"))));
        }
        if (!req.getParameter("weight").equals("")) {
            product.setWeight((Long.parseLong(req.getParameter("weight"))));
        }
        if (!req.getParameter("quantity").equals("")) {
            product.setQuantity((Long.parseLong(req.getParameter("quantity"))));
        }
        if (!req.getParameter("color").equals("")) {
            product.setColor(req.getParameter("color"));
        }
        if (!req.getParameter("picture").equals("")) {
            product.setPicture(req.getParameter("picture"));
        }
        productDao.update(product);


        httpSession.setAttribute("productPage",product);
        RequestDispatcher view = req.getRequestDispatcher("adminproductpage.jsp");
        view.forward(req, resp);
    }



    }

