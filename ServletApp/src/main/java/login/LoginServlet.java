package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if("admin".equals(username) && "Avinash@202".equals(password)) {
			out.println("<h2> Welcome, "+username+"</h2>");
			ServletConfig config = getServletConfig();
			String adminEmail = config.getInitParameter("adminEmail");
			out.println("please contact admin to resolve any issues: "+adminEmail);
			
			String dev = config.getInitParameter("developer");
			out.println("Servlet is developed by: "+dev);
			
			ServletContext context = getServletContext();
			String con = context.getInitParameter("appName");
			out.println("Application name"+ con);
		}else {
			out.println("<h2>Invalid usernmae or password, Please try again</h2>");
		}
		out.close();
	}
}
