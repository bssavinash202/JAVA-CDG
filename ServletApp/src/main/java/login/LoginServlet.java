package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		
		String pass = request.getParameter("password");
		
		//store username in request attribute
		request.setAttribute("name",username);
		
		out.println("<html><body>");
		if("admin".equals(username) && "admin123".equals(pass)) {
			// Redirecting the user to success page
			//response.sendRedirect("Success.html");
			//RequestDispatcher rd = request.getRequestDispatcher("welcome");
			//rd.forward(request, response);
			response.sendRedirect("welcome");
			
			/*
			 * ServletConfig config = getServletConfig(); String adminEmail =
			 * config.getInitParameter("adminEmail");
			 * out.println("<h3>Please contact admin to resolve any issues:"+adminEmail+
			 * "</h3>");
			 * 
			 * String developer = config.getInitParameter("developer");
			 * out.println("<h3>Servlet is developed by: "+developer+"</h3>");
			 * 
			 * ServletContext context = getServletContext(); String appName =
			 * context.getInitParameter("appName");
			 * out.println("<h3>Applecation: "+appName+"</h3>");
			 */
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("Error.html");
			rd.forward(request, response);
			//response.sendRedirect("Error.html");
		}
		out.println("</html></body>");
	}
	
}