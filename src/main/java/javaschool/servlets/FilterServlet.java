package javaschool.servlets;

import com.google.common.base.Strings;
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
        req.setAttribute("FilterBrands", productDao.getBrands());
        req.setAttribute("FilterCollections", productDao.getCollections());
        req.setAttribute("FilterProducts", productDao.getProducts());
        req.setAttribute("FilterColors", productDao.getColors());

        String brand, collection, color, price, weight, width, length;

        if (!Strings.isNullOrEmpty(req.getParameter("brand"))) {
            brand = "'" + req.getParameter("brand") + "'";
        } else {
            brand = null;
        }

        if (!Strings.isNullOrEmpty(req.getParameter("col"))) {
            collection = "'" + req.getParameter("col") +"'";
        } else {
            collection = null;
        }
        if (!Strings.isNullOrEmpty(req.getParameter("price"))) {
            if (req.getParameter("price").equals("1")) {
                price = "0 AND 500";
            } else if (req.getParameter("price").equals("2")) {
                price = "500 AND 1500";
            } else if (req.getParameter("price").equals("3")) {
                price = "1500 AND 100000";
            } else price = null;
        } else {
            price = null;
        }

        if (!Strings.isNullOrEmpty(req.getParameter("weight"))) {
            if (req.getParameter("weight").equals("1")) {
                weight = "0 AND 5";
            } else if ((req.getParameter("weight").equals("2"))) {
                weight = "5 AND 10";
            } else if ((req.getParameter("weight").equals("3"))) {
                weight = "10 AND 15";
            } else if ((req.getParameter("weight").equals("4"))) {
                weight = "15 AND 100";
            } else weight = null;
        } else {
            weight = null;
        }

        if (!Strings.isNullOrEmpty(req.getParameter("length"))) {
            if (req.getParameter("length").equals("1")) {
                length = "0 AND 20";
            } else if (req.getParameter("length").equals("1")) {
                length = "20 AND 30";
            } else if (req.getParameter("length").equals("1")) {
                length = "30 AND 40";
            } else if (req.getParameter("length").equals("1")) {
                length = "40 AND 200";
            } else length = null;
        } else {
            length = null;
        }
        if (!Strings.isNullOrEmpty(req.getParameter("color"))) {
            color = "'"+ req.getParameter("color") + "'";
        } else {
            color = null;
        }
        if (!Strings.isNullOrEmpty(req.getParameter("width"))) {
            width = req.getParameter("width");
            if (req.getParameter("width").equals("1")) {
                length = "0 AND 10";
            }else if (req.getParameter("width").equals("2")) {
                length = "10 AND 20";
            }else if (req.getParameter("width").equals("3")) {
                length = "20 AND 30";
            }else if (req.getParameter("width").equals("4")) {
                length = "30 AND 100";
            }else width = null;
        } else {
            width = null;
        }

        req.setAttribute("FilterProducts",
                productDao.getFilteredProducts(brand, collection, price, weight, length, width, color));

        RequestDispatcher view = req.getRequestDispatcher("filter.jsp");
        view.forward(req, resp);

    }

    public static boolean equals(String str1, String str2) {
        return str1 == null ? str2 == null : str1.equals(str2);
    }
}
