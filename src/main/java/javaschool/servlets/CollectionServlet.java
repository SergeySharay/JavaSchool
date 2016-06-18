package javaschool.servlets;

import com.google.common.base.Strings;
import javaschool.dao.ProductDaoImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CollectionServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductDaoImpl productDao = new ProductDaoImpl();
        if (Strings.isNullOrEmpty(req.getParameter("Brand"))) {
            req.setAttribute("Brand", productDao.getBrand(req.getParameter("Collection")));
            req.setAttribute("Collections", productDao.getCollections(productDao.getBrand(req.getParameter("Collection"))));
            req.setAttribute("ProductsInCollection", productDao.getProducts(productDao.getBrand(req.getParameter("Collection")),
                    req.getParameter("Collection")));
        } else {
            req.setAttribute("Collections", productDao.getCollections(req.getParameter("Brand")));
            req.setAttribute("ProductsInCollection", productDao.getProducts(req.getParameter("Brand"), req.getParameter("Collection")));
            req.setAttribute("Brand", req.getParameter("Brand"));
        }
        req.setAttribute("Collection", req.getParameter("Collection"));
        RequestDispatcher view = req.getRequestDispatcher("collection.jsp");
        view.forward(req, resp);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductDaoImpl productDao = new ProductDaoImpl();
        if (Strings.isNullOrEmpty(req.getParameter("Brand"))) {
            req.setAttribute("Brand", productDao.getBrand(req.getParameter("Collection")));
            req.setAttribute("Collections", productDao.getCollections(productDao.getBrand(req.getParameter("Collection"))));
            req.setAttribute("ProductsInCollection", productDao.getProducts(productDao.getBrand(req.getParameter("Collection")),
                    req.getParameter("Collection")));
        } else {
            req.setAttribute("Collections", productDao.getCollections(req.getParameter("Brand")));
            req.setAttribute("ProductsInCollection", productDao.getProducts(req.getParameter("Brand"), req.getParameter("Collection")));
            req.setAttribute("Brand", req.getParameter("Brand"));
        }
        req.setAttribute("Collection", req.getParameter("Collection"));
        RequestDispatcher view = req.getRequestDispatcher("collection.jsp");
        view.forward(req, resp);
    }

}
