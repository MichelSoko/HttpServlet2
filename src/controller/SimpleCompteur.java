package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleCompteur
 */
public class SimpleCompteur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int compteur = 0;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SimpleCompteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		compteur++;
		out.println("Depuis le chargement de cette servlet, celle-ci a été accédée " + compteur + " fois.");

	}

}