package javaschool.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

public class BucketServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        Map<Long,Integer> order = (Map<Long,Integer>)httpSession.getAttribute("Order");
        if (req.getParameter("Quantity").equals("+1"))
                order.put(Long.parseLong(req.getParameter("ProductId")),
                        order.get(Long.parseLong(req.getParameter("ProductId")))+1);

        if (req.getParameter("Quantity").equals("-1"))
            if(order.get(Long.parseLong(req.getParameter("ProductId")))==1){
                order.remove(Long.parseLong(req.getParameter("ProductId")));
            }else{
                order.put(Long.parseLong(req.getParameter("ProductId")),
                        order.get(Long.parseLong(req.getParameter("ProductId"))) - 1);

                }
        httpSession.setAttribute("Order",order);
        resp.sendRedirect("bucket.jsp");
    }

}
