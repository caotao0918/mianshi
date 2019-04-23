package servlet.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloServlet",urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        System.out.println(request.getRemoteUser());//    null
        System.out.println(request.getRequestURI());//    /javaweb/hello
        System.out.println(request.getRequestURL());//    http://localhost/javaweb/hello
        System.out.println(request.getServletPath());//    /hello
        System.out.println(request.getRemotePort());//    8282
        System.out.println(request.getRemoteAddr());//    0:0:0:0:0:0:0:1
        System.out.println(request.getRemoteHost());//    0:0:0:0:0:0:0:1
        System.out.println(request.getServerName());//    localhost
        System.out.println(request.getServerPort());//    80
        request.getRequestDispatcher("WEB-INF/hello.jsp").forward(request,response);
    }
}
