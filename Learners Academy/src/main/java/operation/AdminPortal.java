package operation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
//@WebServlet(name = "Adminportal", urlPatterns = { "/Adminportal" })
public class AdminPortal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		request.getRequestDispatcher("adminlogin.html").include(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String Email = request.getParameter("adminemail");
		String Password = request.getParameter("adminpassword");
		
		if(Email.equals("") && Password.equals("")) {
			out.println("<div align='center'><h2 style='color:red'>Mandatory Fields Are Empty</h2>"
					+ "<a href='login'>Retry with Valid Cred</a>"
					+ "</div>");
		}else {
			if(Email.equals("admin@gmail.com") && Password.equals("admin@123")) {
				out.println("<div align='center'><h2 style='color:green'>WELCOME TO ADMIN PORTAL!</h2></div>");
				request.getRequestDispatcher("adminportal.html").include(request, response);
			}else {
				out.println("<div align='center'><h2 style='color:red'>Invalid Credentials</h2>"
						+ "<a href='login'>Retry with Valid Cred</a>"
						+ "</div>");
			}
		}
	}

}
