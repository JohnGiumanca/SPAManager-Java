package com.ParadiseIslandSPA;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("Login.jsp").forward(request,response);
		
		

		
		
		
		
//		if(request.getParameter("ZonaA")!=null)
//		{
//			Receptioner.requestAcces("1", "TanaseR@gmail.com");
//		}
//		else if(request.getParameter("ZonaB")!=null)
//		{
//			Receptioner.requestAcces("2", "TanaseR@gmail.com");
//		}
//		else if(request.getParameter("ZonaC")!=null)
//		{
//			Receptioner.requestAcces("3", "TanaseR@gmail.com");
//		}
//		else if(request.getParameter("ZonaD")!=null)
//		{
//			Receptioner.requestAcces("4", "TanaseR@gmail.com");
//		}
//			request.getRequestDispatcher("Login.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		request.setAttribute("email", email);
//		String email2 = (String) request.getAttribute(email);
//		out.println("<h2>" + email2 +"<h2>");
//		out.println("<h2>" + password +"<h2>");
		//Este bine aici; decomenteaza dupa john
		
		if(Receptioner.adminCheck(email, password)) {
			 request.getRequestDispatcher("AdminPage.jsp").forward(request,response);
		}else {
			if(Receptioner.loginClient(email, password)) {
				 request.getRequestDispatcher("Menu.jsp").forward(request,response);
			}else {
			out.println("<h2>Logare esuata</h2>");
			}	
		}
		
	}

}
