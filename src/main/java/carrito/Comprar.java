package carrito;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Item;

/**
 * Servlet implementation class Comprar
 */
@WebServlet("/Comprar")
public class Comprar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		@SuppressWarnings("unchecked")
		List<Item> carrito = (List<Item>)session.getAttribute("carrito");
		
		if(carrito == null) {
			carrito = new ArrayList<Item>();
			session.setAttribute("carrito", carrito);
		}
		
		String nom = request.getParameter("nombre");
		int cant = Integer.parseInt(request.getParameter("unidades"));
		double val = Double.parseDouble(request.getParameter("precio"));
		
		carrito.add(new Item(nom, val, cant));
		request.getRequestDispatcher("carrito/opciones.html").forward(request, response);
	}

}
