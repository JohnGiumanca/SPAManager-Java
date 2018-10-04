package com.ParadiseIslandSPA;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Chitanta
 */
@WebServlet("/Chitanta")
public class Chitanta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Chitanta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");
		
		String bilant = Receptioner.getBilantClient(email);
		List<DetaliiProdus> detaliiChitanta = Receptioner.getChitanta(email, false);
		request.setAttribute("denumireProduse", detaliiChitanta);
		request.setAttribute("bilant", bilant);
		
		
		if(request.getParameter("finalizareComanda") != null)
		{
			Receptioner.getChitanta(email, true);
			request.getRequestDispatcher("Login.jsp").forward(request, response);
			
		}
		
		request.getRequestDispatcher("Chitanta.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
