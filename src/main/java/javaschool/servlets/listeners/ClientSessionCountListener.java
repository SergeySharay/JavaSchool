package javaschool.servlets.listeners;


import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class ClientSessionCountListener implements HttpSessionListener {
    private static int activeSessions=0;
    public static int getActiveSessions(){
        return activeSessions;
    }
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
    activeSessions++;
    }
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
    activeSessions--;
    }
}
