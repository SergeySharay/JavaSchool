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
        //HttpSession httpSession = req.getSession();
        ProductDaoImpl productDAO = new ProductDaoImpl();
//        List<Product> productList = productDAO.getProducts();
        req.setAttribute("catalogMenuBrandList",productDAO.getBrands());//передамем множество брендов

        if (!equals(req.getParameter("Brands"),"all")){
            req.setAttribute("catalogCollectionList",productDAO.getCollections(req.getParameter("Brands")));//передамем множество коллекций
            req.setAttribute("catalogBrand",req.getParameter("Brands"));
            } else
        {
            req.setAttribute("catalogCollectionList",productDAO.getCollections("Venis"));
            req.setAttribute("catalogBrand", "Venis");
        }

//        httpSession.setAttribute("catalogProductList",productList);
        RequestDispatcher view = req.getRequestDispatcher("cat.jsp");
        view.forward(req,resp);
    }
    public static boolean equals(String str1, String str2) {
        return str1 == null ? str2 == null : str1.equals(str2);
    }
}

