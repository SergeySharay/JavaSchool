package javaschool.servlets.filters;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
//        HttpSession session = request.getSession(false);
        Cookie[] cookies = request.getCookies();
        String name = null;
        String password = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user_name")) {
                    name = cookie.getValue();
                }
                if (cookie.getName().equals("pass_word")) {
                    password = cookie.getValue();
                }
            }
        }
        if (name == null || password == null) {
            request.getRequestDispatcher("/reg.jsp").forward(request, response);
        }
        chain.doFilter(request, response);
    }


    public void destroy() {

    }
}
