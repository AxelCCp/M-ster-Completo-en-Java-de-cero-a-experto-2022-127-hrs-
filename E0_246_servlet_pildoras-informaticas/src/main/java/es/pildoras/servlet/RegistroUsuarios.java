package es.pildoras.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RegistroUsuarios
 */
public class RegistroUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter salida = response.getWriter();
		salida.println("<html><body>");
		salida.println("Nombre introducido : " + request.getParameter("nombre"));
		salida.println("<br><br>");
		salida.println("Apellido introducido : " + request.getParameter("apellido"));
		salida.println("</html></body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		//SE ESPECIFICA FORMATO DE RESPUESTA HTML
				response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		salida.println("<html><body>");
		salida.println("Nombre introducido : " + request.getParameter("nombre"));
		salida.println("<br><br>");
		salida.println("Apellido introducido : " + request.getParameter("apellido"));
		salida.println("</html></body>");
	}

}
