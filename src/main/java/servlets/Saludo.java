package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Saludo
 */
@WebServlet("/Saludo")
public class Saludo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pr = response.getWriter();
		
		pr.println("<html><body><center>");
		for(int i = 1; i<= 6; i++) {
			pr.println("<h" + i + "> Hola Mundo </h" + i + ">");
		}
		pr.println("</center></body></html>");
		
	}

}
