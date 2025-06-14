package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = (String) request.getAttribute("name");
		out.println("<html><body>");
		out.println("<h1>Welcome "+name+" ..! </h1>");
		out.println("</html></body>");
		
	}
	//for send redirect
	public void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException{
		doPost(request,response);
	}

}
