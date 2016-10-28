package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
 
	private static final float serialVersionUID = 102831973239L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        
//        if(Validate.checkUser(name, password))
//        {
//            RequestDispatcher rs = request.getRequestDispatcher("Welcome");
//            rs.forward(request, response);
//        }
//        else
        
           //out.println("Username or Password incorrect , try again");
           RequestDispatcher rs = request.getRequestDispatcher("NewFile.html");
           rs.include(request, response);
        
    }  
}