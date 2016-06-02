package javaschool.servlets;

import javaschool.DAO.ProductDAOImpl;
import javaschool.entity.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;

public class Catalog extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        ProductDAOImpl productDAO = new ProductDAOImpl();
        req.setAttribute("brands",productDAO.getBrands());//передамем множество брендов

        for(String brand :productDAO.getBrands()){
            req.setAttribute("colOf" + brand, productDAO.getCollections(brand)); //передаем множество коллекций в брендах
        }

        RequestDispatcher view = req.getRequestDispatcher("cat.jsp");
        view.forward(req,resp);
    }

}

