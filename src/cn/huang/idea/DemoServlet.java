package cn.huang.idea;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by shaoye on 2018/8/8.
 */

@WebServlet("/webDemo")
public class DemoServlet extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("DemoServlet.service");

        //请求转发到index.jsp
        req.getRequestDispatcher("/WEB-INF/DemoWeb.jsp").forward(req,resp);
    }
}
