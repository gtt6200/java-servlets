package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Ficha;

/**
 * Servlet implementation class Bienvenido
 */
@WebServlet("/Bienvenido")
public class Bienvenido extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); //tipo de formato de respuesta
		PrintWriter out=response.getWriter(); //construimos p�gina de respuesta
		out.println("<html><body>");
		Ficha fichaUsuario = (Ficha)request.getAttribute("ficha");
		out.println("<h1>Bienvenido "+ fichaUsuario.getUsuario()+" a mi página</h1>");
		out.println("<br/>");
		out.println("<h2>Datos del usuario: "+ fichaUsuario.getEmail() +" </h2>");
		out.println("<br/>");
		out.println("<h2>Datos del usuario: "+ fichaUsuario.getEdad()+"</h2>");
		out.println("<br/>");
		out.println("<a href='formulario.html'>volver</a>");
		out.println("</body></html>");
	}

}
