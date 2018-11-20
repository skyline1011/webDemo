package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener()
public class SessionCounter implements
        HttpSessionListener {

    private static int count = 0;

    // Public constructor is required by servlet spec
    public SessionCounter() {
        System.out.println("SessionCounter create ---");
    }

    public void sessionCreated(HttpSessionEvent se) {
        count++;
        System.out.println(" add " + count);
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        count--;
    }

    //获取活动的session个数(在线人数)
    public static int getActiveSessions() {
        return count;
    }
}
