package javaschool.servlets;

import javaschool.dao.ProductDaoImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CatalogServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        ProductDaoImpl productDAO = new ProductDaoImpl();
        req.setAttribute("brands",productDAO.getBrands());//передамем множество брендов

        for(String brand :productDAO.getBrands()){
            req.setAttribute("colOf" + brand, productDAO.getCollections(brand)); //передаем множество коллекций в брендах
        }

        RequestDispatcher view = req.getRequestDispatcher("cat.jsp");
        view.forward(req,resp);
    }

}

