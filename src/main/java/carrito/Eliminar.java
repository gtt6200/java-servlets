package carrito;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Item;

/**
 * Servlet implementation class Eliminar
 */
@WebServlet("/Eliminar")
public class Eliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		@SuppressWarnings("unchecked")
		List<Item> carrito = (List<Item>)session.getAttribute("carrito");
		
		if(carrito!= null) {
			int pos = Integer.parseInt(request.getParameter("pos"));
			carrito.remove(pos);
		}else {
			request.getRequestDispatcher("VerCarrito").forward(request, response);
		}
	}

}
