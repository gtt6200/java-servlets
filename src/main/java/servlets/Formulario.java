package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Formulario
 */
@WebServlet("/Formulario")
public class Formulario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pr = response.getWriter();
		response.setContentType("text/html");
		
		String nombre = request.getParameter("nombre");
		String lastName = request.getParameter("first_lastname");
		String secondLastName = request.getParameter("second_lastname");
		String edad = request.getParameter("edad");
		String sexo = request.getParameter("sexo");
		String [] musical = request.getParameterValues("musica");
		
		try {
			Integer age = Integer.parseInt(edad);
			if(age < 18) {
				  	pr.println("<html><body>");
	                pr.println("<h2>Error: La edad debe ser mayor a 18 años.</h2>");
	                pr.println("</body></html>");
	                System.out.println("imprimió bien en consola");
			}
		} catch (NumberFormatException e) {
			 	pr.println("<html><body>");
	            pr.println("<h2>Error: La edad debe ser un número válido.</h2>");
	            pr.println("</body></html>");
		}
		if(musical != null) {
				pr.println("<html><body>");
                pr.println("<h2>Formulario válido</h2>");
                pr.println("<p>Nombre: " + nombre + "</p>");
                pr.println("<p>Apellido Paterno: " + lastName + "</p>");
                pr.println("<p>Apellido Materno: " + secondLastName + "</p>");
                pr.println("<p>Edad: " + edad + "</p>");
                pr.println("<p>Sexo: " + sexo + "</p>");
                pr.println("<p>Generos musicales: ");
                for(String s: musical) {
                	pr.println(s + "</p>");
                }
                pr.println("</body></html>");
		}else {
			pr.println("<html><body>");
            pr.println("<h2>Debe seleccionar alguna cancion</h2>");
            pr.println("</body></html>");
            System.out.println("imprimió bien en consola");
		}

	}

}
