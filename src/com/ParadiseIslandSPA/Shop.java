package com.ParadiseIslandSPA;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Succes
 */
@WebServlet("/Shop")
public class Shop extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<DetaliiProdus> listaProduse = new LinkedList<>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	
//	GIUMANCA DRAGOS	9
//	TAPIRDEA ALEXANDRU 9
//	COJOCARU ALEX 7
	
	
	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// PrintWriter out = response.getWriter();
		// String email = request.getParameter("email");
		// String password = request.getParameter("password");
		// out.println("<h2>" + email +"<h2>");
		// out.println("<h2>" + password +"<h2>");
		// //Este bine aici; decomenteaza dupa john
		// if(Receptioner.loginClient(email, password))
		// request.getRequestDispatcher("Shop.jsp").forward(request,response);
		// else
		// out.println("<h2>Naspa</h2>");
		// // ca sa ajungem la pagina :

		PrintWriter out = response.getWriter();
		String zona = request.getParameter("Zona");
		String bar = request.getParameter("Bar");
		String restaurant = request.getParameter("Restaurant");
		String servicii = request.getParameter("Servicii");
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");
		String tip = request.getParameter("tipProdus");
		// out.println("<h2>" + email +"<h2>");

		if(request.getParameter("Chitanta")!= null)
		{
			request.getRequestDispatcher("Chitanta.jsp").forward(request, response);
		}
		String tipProdus = "";
		if (zona != null) {
			tipProdus = "Zona";
		} else if (bar != null) {
			tipProdus = "Bar";
		} else if (restaurant != null) {
			tipProdus = "Restaurant";
		} else if (servicii != null) {
			tipProdus = "Servicii";
		}

		if (!tipProdus.isEmpty()) {
			List<DetaliiProdus> produse = Receptioner.afisareProduse(tipProdus);
			request.setAttribute("denumireProduse", produse);
			request.setAttribute("tipProdus", tipProdus);
			request.getRequestDispatcher("Shop.jsp").forward(request, response);
			// out.println("<h2>" + email +"<h2>");
		}
		if (tip!=null  && !tip.isEmpty()) {
			out.println("<h2>Bau<h2>");
			List<DetaliiProdus> produse = Receptioner.afisareProduse(tip);
			request.setAttribute("denumireProduse", produse);
			request.setAttribute("tipProdus", tip);
			request.getRequestDispatcher("Shop.jsp").forward(request, response);
		}
		if(request.getParameter("addToCart")!=null)
		addToCart(request, response);

		String finalizareComanda = request.getParameter("finalizareComanda");
		if (finalizareComanda != null) {
			Receptioner.cumparareProdus(listaProduse, email);
			listaProduse.clear();
			request.getRequestDispatcher("Menu.jsp").forward(request, response);
		}
		// List<String> denumireProduse = new LinkedList<>();
		// for (DetaliiProdus pr : produse) {
		// System.out.println(pr.getNumeProdus());
		// denumireProduse.add(pr.getNumeProdus());
		// }

	}
	// else
	// {
	//
	// PrintWriter out = response.getWriter();
	// out.println("<h2>" + addProductByName +"<h2>");
	// }

	// out.println("<h2>" + Bar +"<h2>");
	// out.println("<h2>" + Restaurant +"<h2>");
	// out.println("<h2>" + Servicii +"<h2>");

	protected void addToCart(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// HttpSession session = request.getSession();

		// request.getRequestDispatcher("Register.jsp").forward(request, response);
		String denumire = request.getParameter("denumire");
		Integer cantitate = Integer.parseInt(request.getParameter("cantitate"));
		Double pret = Double.parseDouble(request.getParameter("pret"));
		String idProdus = request.getParameter("idProdus");
		String email = request.getParameter("email");
		System.out.println("email pentru cos" + email);

		DetaliiProdus auxProd = new DetaliiProdus(idProdus, denumire, pret, cantitate);
		listaProduse.add(auxProd);
		
		for (DetaliiProdus curent : listaProduse) {
			System.out.println(curent.getNumeProdus());
			
		}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		doGet(request, response);

		// PrintWriter out = response.getWriter();
		// String email = request.getParameter("email");
		// String password = request.getParameter("password");
		// out.println("<h2>" + email +"<h2>");

	}

}
