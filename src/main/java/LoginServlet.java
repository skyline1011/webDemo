import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置编码为utf-8
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        // 获取用户名和密码
        String name = request.getParameter("uname");
        String pwd = request.getParameter("pwd");

        // 校验用户名和密码是否正确
        if ("admin".equals(name) && "123".equals(pwd)) {// 验证成功
            HttpSession session = request.getSession();//获取session
            session.setAttribute("name", name);// 将用户名和密码保存在session中
            session.setAttribute("pwd", pwd);// 将用户名和密码保存在session中
            response.sendRedirect(request.getContextPath() + "/login/success.jsp");// 重定向到success.jsp页面
        } else {// 校验不成功，则留在跳转到login.jsp页面
            response.sendRedirect(request.getContextPath() + "/login/login.jsp");//重定向
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();//获取session
        Object name = session.getAttribute("name");//从session中获取用户名
        Object pwd = session.getAttribute("pwd");//从session获取用户密码
        System.out.println(name + ":" + pwd); //测试一下，输出获取的用户名和密码
        session.invalidate(); //注销session
        response.sendRedirect(request.getContextPath() + "/login/login.jsp");
    }
}
