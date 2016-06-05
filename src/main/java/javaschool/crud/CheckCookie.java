package javaschool.crud;

import javaschool.dao.ClientDaoImpl;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

public class CheckCookie {
    public static String user_name="";
    private static String pass_word="";
    public static void check(HttpServletRequest request){
        HttpSession session = request.getSession();
        ClientDaoImpl clientDao=new ClientDaoImpl();
        Map<String, String> userpass=clientDao.getClientEmailPassword();
        for(int i=0;i<request.getCookies().length;i++){
            Cookie cookie=request.getCookies()[i];
            if(cookie.getName().equals("user_name")){
                user_name=cookie.getValue();}
            if(cookie.getName().equals("pass_word")){
                pass_word=cookie.getValue();}
        }
        if(userpass.containsKey(user_name))
            if(userpass.get(user_name).equals(pass_word))
               session.setAttribute("CheckCookie","true");

}
}
