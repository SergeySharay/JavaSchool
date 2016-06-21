package javaschool.servlets;

import com.google.common.base.Strings;
import javaschool.dao.ProductDaoImpl;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CatalogServlet extends HttpServlet {
    private static Logger logger = Logger.getLogger(CatalogServlet.class);
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        logger.info("Call CatalogServlet doGet method");
        logger.info("Initializing new ProductDaoImpl()");
        ProductDaoImpl productDAO = new ProductDaoImpl();
        logger.info("Setting ${catalogMenuBrandList}=(productDAO.getBrands()) to req.setAttribute");
        req.setAttribute("catalogMenuBrandList",productDAO.getBrands());//передамем множество брендов
        logger.info("Setting ${catalogCollectionList}=(productDAO.getCollections()) to req.setAttribute");
        req.setAttribute("catalogCollectionList",productDAO.getCollections());

        if (!Strings.isNullOrEmpty(req.getParameter("Brands"))){
            req.setAttribute("catalogCollectionList",productDAO.getCollections(req.getParameter("Brands")));//передамем множество коллекций
            req.setAttribute("catalogBrand",req.getParameter("Brands"));
            }
        logger.info("Call getRequestDispatcher(cat.jsp) method");
        RequestDispatcher view = req.getRequestDispatcher("cat.jsp");
        view.forward(req,resp);
    }
    public static boolean equals(String str1, String str2) {
        return str1 == null ? str2 == null : str1.equals(str2);
    }
}

