package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter", urlPatterns = "/*")
public class LoginFilter implements Filter {
    public void destroy() {
        System.out.println("过滤器销毁");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // pass the request along the filter chain
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse res = (HttpServletResponse) resp;

        //获取请求地址
        System.out.println("*************"+request.getRequestURI());///webDemo/login/login.jsp
        String requestURI = request.getRequestURI().substring(request.getRequestURI().indexOf("/", 1),
                request.getRequestURI().length());//若不写工程名，直接登录因截取不到数据会报错
        System.out.println("----------"+requestURI);///login/login.jsp

        //登陆页面和接口放开限制，否则死循环
        if ("/login/login.jsp".equals(requestURI) || "/LoginServlet".equals(requestURI)) {
            chain.doFilter(request, res);
        } else {
            //默认不开启
            HttpSession session = request.getSession(false);
            //如果session中没有用户信息，拦截返回登陆页面
            if (session == null || session.getAttribute("name") == null) {
                res.sendRedirect(request.getContextPath() + "/login/login.jsp");
                //返回
                return;
            } else {
                chain.doFilter(request, res);//不做拦截，直接放行
            }
        }
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("过滤器初始化");
    }

}
