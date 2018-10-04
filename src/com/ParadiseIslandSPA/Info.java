package com.ParadiseIslandSPA;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Info
 */
@WebServlet("/Info")
public class Info extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Info() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		Map<String,Integer> statusZone =  Receptioner.getZoneStatus();
//		request.setAttribute("statusZone",statusZone);
		
		int zA=0;
		int zB=0;
		int zC=0;
		int zD=0;
		
		Map<String, Client> clientMapTmp = Receptioner.clientMapTmp;
		for (Map.Entry<String, Client> entry : clientMapTmp.entrySet())
		{	
			if( entry.getValue().getZona().equals("Zona A") ) {
				zA++;
			}
			if( entry.getValue().getZona().equals("Zona B") ) {
				zB++;
			}
			if( entry.getValue().getZona().equals("Zona C") ) {
				zC++;
			}
			if( entry.getValue().getZona().equals("Zona D") ) {
				zD++;
			}
		}
		
		request.setAttribute("statusZonaA",Integer.toString(zA));
		request.setAttribute("statusZonaB",Integer.toString(zB));
		request.setAttribute("statusZonaC",Integer.toString(zC));
		request.setAttribute("statusZonaD",Integer.toString(zD));
		
		request.getRequestDispatcher("Info.jsp").forward(request,response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
