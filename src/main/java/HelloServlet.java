import db.DbDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "HelloServlet", urlPatterns = "/HelloServlet")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String type = request.getParameter("type");
        String page = "/jstl/flag_jstl.jsp";
        if ("1".equals(type)) {
            request.setAttribute("flag", true);
            request.setAttribute("name", "张三登录成功");
        } else if ("2".equals(type)) {
            request.setAttribute("flag", false);
        } else if ("3".equals(type)) {
            try {
                page = "/jstl/dbForeach.jsp";
                request.setAttribute("userList", DbDao.query());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        getServletContext().getRequestDispatcher(page).forward(
                request, response);
    }
}
