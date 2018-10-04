package com.ParadiseIslandSPA;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sound.midi.Soundbank;

/**
 * Servlet implementation class Menu
 */
@WebServlet("/Menu")
public class Menu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Menu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String zona = request.getParameter("zona");
		System.out.println(zona);
		
		String email = request.getParameter("email");
		System.out.println(email);
		
		if(email == null || email.isEmpty() || email.equals("null")) {
			
			HttpSession session = request.getSession();
			email = (String) session.getAttribute("email");
			System.out.println(email);
	
		}
		
		if(zona.equals("Zona A")) {
			if(Receptioner.requestAcces("1", email)) {
				Receptioner.modificaZona(email, zona);
				request.setAttribute("acces", "permis");
			}
			else {
				System.out.println("Acces interzis");
				request.setAttribute("acces", "interzis");
			}	
		}
		if(zona.equals("Zona B")) {
			if(Receptioner.requestAcces("2", email)) {
				Receptioner.modificaZona(email, zona);
				request.setAttribute("acces", "permis");
			}
			else {
				System.out.println("Acces interzis");
				request.setAttribute("acces", "interzis");
			}	
		}
		if(zona.equals("Zona C")) {
			if(Receptioner.requestAcces("3", email)) {
				Receptioner.modificaZona(email, zona);
				request.setAttribute("acces", "permis");
			}
			else {
				System.out.println("Acces interzis");
				request.setAttribute("acces", "interzis");
			}	
		}
		if(zona.equals("Zona D")) {
			if(Receptioner.requestAcces("4", email)) {
				Receptioner.modificaZona(email, zona);
				request.setAttribute("acces", "permis");
			}
			else {
				System.out.println("Acces interzis");
				request.setAttribute("acces", "interzis");
			}	
		}
		

		
		
		
		String email2 = request.getParameter("email");
		if(email2 != null) {
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
			request.getRequestDispatcher("Menu.jsp").forward(request,response);
			
		}else {
			request.getRequestDispatcher("Menu.jsp").forward(request,response);
			
		}
		
		

				
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
