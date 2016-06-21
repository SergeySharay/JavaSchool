/**
 * A checkCookie.class is deprecated.
 *
 * @author Sergey Sharay
 * @version 1.0
 * @deprecated
 */
package javaschool.crud;

import javaschool.dao.ClientAdressDaoImpl;
import javaschool.dao.ClientDaoImpl;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;
/**
 * @deprecated
 */
public class CheckCookie {
    private static String user_name = "";
    private static String pass_word = "";
    public static void check(HttpServletRequest request) throws UnsupportedEncodingException {
        HttpSession session = request.getSession();
        ClientDaoImpl clientDao = new ClientDaoImpl();
        ClientAdressDaoImpl clientAdressDao = new ClientAdressDaoImpl();
        Map<String, String> userpass = clientDao.getClientEmailPassword();
        if (request.getCookies() != null) {
            for (int i = 0; i < request.getCookies().length; i++) {
                Cookie cookie = request.getCookies()[i];
                if (cookie.getName().equals("user_name")) {
                    user_name = URLDecoder.decode(cookie.getValue(), "utf-8");
                }
                if (cookie.getName().equals("pass_word")) {
                    pass_word = URLDecoder.decode(cookie.getValue(), "utf-8");
                }
            }
            if (userpass.containsKey(user_name) && userpass.get(user_name).equals(pass_word)) {
                session.setAttribute("CheckCookie", "true");
                session.setAttribute("User", clientDao.getClient(user_name));
                session.setAttribute("clientAdress", clientAdressDao.getAdress(clientDao.getClient(user_name)));
            }
        }
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        session.setAttribute("format", format);

    }

}
