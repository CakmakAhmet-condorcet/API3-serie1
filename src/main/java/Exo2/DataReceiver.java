package Exo2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DataReceiver")
public class DataReceiver extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String lastname = request.getParameter("lastname");
        String firstname = request.getParameter("firstname");
        String description = request.getParameter("description");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Données reçues</h1>");
        out.println("<p><strong>Nom :</strong> " + lastname + "</p>");
        out.println("<p><strong>Prénom :</strong> " + firstname + "</p>");
        out.println("<p><strong>Description :</strong> " + description + "</p>");
        out.println("</body></html>");
    }

}
