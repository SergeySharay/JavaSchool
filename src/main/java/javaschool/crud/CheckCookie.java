package javaschool.crud;

import javaschool.dao.ClientDaoImpl;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;

public class CheckCookie {
    public static String user_name = "";
    private static String pass_word = "";

    public static void check(HttpServletRequest request) throws UnsupportedEncodingException {
        HttpSession session = request.getSession();
        ClientDaoImpl clientDao = new ClientDaoImpl();
        Map<String, String> userpass = clientDao.getClientEmailPassword();
        for (int i = 0; i < request.getCookies().length; i++) {
            Cookie cookie = request.getCookies()[i];
            if (cookie.getName().equals("user_name")) {
                user_name = URLDecoder.decode(cookie.getValue(), "utf-8");
            }
            if (cookie.getName().equals("pass_word")) {
                pass_word = URLDecoder.decode(cookie.getValue(), "utf-8");
            }

        }
        if (userpass.containsKey(user_name))
            if (userpass.get(user_name).equals(pass_word)) {
                session.setAttribute("CheckCookie", "true");
                session.setAttribute("User", clientDao.getClient(user_name));

            }
       // if (session.getAttribute("Order") == null) {
        //    session.setAttribute("Order", new HashMap<Long, Integer>());
        //}
    }
}
