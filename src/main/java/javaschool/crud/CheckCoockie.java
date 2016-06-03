package javaschool.crud;

import javaschool.dao.ClientDaoImpl;

import javax.servlet.http.Cookie;
import java.util.Map;

public class CheckCoockie{
    private Cookie[] cookies;
    public static String user_name="";
    private static String pass_word="";
    public CheckCoockie(Cookie[] cookies){
        this.cookies=cookies;
    }
    public static boolean check(Cookie[] cookies){
        ClientDaoImpl clientDao=new ClientDaoImpl();
        Map<String, String> userpass=clientDao.getClientEmailPassword();

        boolean flag = false;
        for(int i=0;i<cookies.length;i++){
            Cookie cookie=cookies[i];
            if(cookie.getName().equals("user_name")){
                user_name=cookie.getValue();}
            if(cookie.getName().equals("pass_word")){
                pass_word=cookie.getValue();}
        }
        if(userpass.containsKey(user_name))
            if(userpass.get(user_name).equals(pass_word))
               flag=true;

        return flag;
}
}
