package com.ParadiseIslandSPA;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String nume = request.getParameter("nume");
		String pret = request.getParameter("pret");
		String tip = request.getParameter("tip");
		if(nume != null && pret != null && tip != null) {
			double pretDouble = Double.parseDouble(pret);
			if(!Receptioner.addProduct(nume, pretDouble, tip)) { 
				//afisam un mesaj gen "Probabil nu ati introdus un tip corect
				System.out.println("DADADA");
			}else {
				//succes
			}
		}
		
		request.getRequestDispatcher("AddProduct.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
