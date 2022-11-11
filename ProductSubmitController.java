package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet implementation class FormDataHandle

// Annotation to map the Servlet URL
@WebServlet("/FormData")
public class ProductSubmitController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Auto-generated constructor stub
	public ProductSubmitController() {
		super();
	}

	// HttpServlet doPost(HttpServletRequest request, HttpServletResponse response) method
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Get the values from the request using 'getParameter'
		String ProductId = request.getParameter("ProductId");
		String ProductName = request.getParameter("ProductName");
	
				
		// set the content type of response to 'text/html'
		response.setContentType("text/html");
		
		// Get the PrintWriter object to write
		// the response to the text-output stream
		PrintWriter out = response.getWriter();
		
		// Print the data
		out.print("<html><body>");
		out.print("<h3>Details Entered</h3><br/>");
		
		out.print("ProductId: "+ ProductId + "<br/>");
		out.print("ProductName: "+ ProductName +"<br/>");
		
		
		out.print("</body></html>");
		
	}

}
