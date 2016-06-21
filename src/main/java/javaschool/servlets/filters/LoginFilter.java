package javaschool.servlets.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {
    public LoginFilter() {
        super();
    }
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        HttpSession httpSession = req.getSession();
        //Client client = (Client)httpSession.getAttribute("User");
        //Integer permission = client.getPermission();
        if((httpSession.getAttribute("CheckCookie")!="true")){
            RequestDispatcher view = req.getRequestDispatcher("index.jsp");
            resp.setCharacterEncoding("UTF-8");
            view.include(req, resp);
            //resp.sendRedirect("index.jsp");
        }else{

        chain.doFilter(req, resp);}

    }

    public void destroy() {
    }
}
