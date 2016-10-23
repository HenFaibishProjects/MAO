import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



public class abc extends HttpServlet {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = -6737820994439962168L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher rs = request.getRequestDispatcher("Welcome");
        rs.forward(request, response);
        
    }  
}