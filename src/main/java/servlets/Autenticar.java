package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Ficha;

/**
 * Servlet implementation class Autenticar
 */
@WebServlet("/Autenticar")
public class Autenticar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		RequestDispatcher rd;
		
		if(user.equals("admin") && pwd.equals("admin")) {
			Ficha fichaUsuario = new Ficha(user, 29, "yunieldd7@gmail.com");
			request.setAttribute("ficha", fichaUsuario);
			rd = request.getRequestDispatcher("Bienvenido");
			
		}else {
			rd = request.getRequestDispatcher("Error");
		}
		
		rd.forward(request, response);
	}

}
