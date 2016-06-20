package javaschool.servlets;

import javaschool.dao.ProductDaoImpl;
import javaschool.entity.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AdminProductAddServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {
        req.setCharacterEncoding("UTF-8");
        ProductDaoImpl productDao = new ProductDaoImpl();
        Product product = new Product();
        product.setBrand(req.getParameter("brand"));
        product.setCollection(req.getParameter("collection"));
        product.setName(req.getParameter("name"));
        product.setPrice(Long.parseLong(req.getParameter("price")));
        product.setLength(Long.parseLong(req.getParameter("length")));
        product.setWeight(Long.parseLong(req.getParameter("weight")));
        product.setWidth(Long.parseLong(req.getParameter("width")));
        product.setQuantity(Long.parseLong(req.getParameter("quantity")));
        product.setColor(req.getParameter("color"));
        product.setPicture(req.getParameter("picture"));
        productDao.add(product);
        resp.sendRedirect("AdminProducts");

    }
}