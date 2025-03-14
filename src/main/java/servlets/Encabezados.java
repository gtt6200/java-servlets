package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Encabezados
 */
@WebServlet("/headers")
public class Encabezados extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pr = response.getWriter();
		pr.println("<html><body><table border='1'>");
		pr.println("<tr><th>Nombre</th><th>Valor</th></tr>");
		Enumeration<String> headers = request.getHeaderNames();
		
		while(headers.hasMoreElements()) {
			String name = headers.nextElement();
			String value = request.getHeader(name);
			pr.println("<tr><td>" + name + "</td><td>" + value + "</td></tr>");
		}
		
		pr.println("</table>");
		pr.println("<h2>Nombre del equipo del cliente: " + request.getRemoteHost().toString() + "</h2>");
		pr.println("<h2>Direccion IP del Cliente: " + request.getRemoteAddr() + "</h2>");
		
	}

}
