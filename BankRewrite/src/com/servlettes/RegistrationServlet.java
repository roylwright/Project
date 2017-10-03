package com.servlettes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.business.Address;
import com.business.Person;


/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		Person person = (Person)session.getAttribute("person");
		
		
		if(person == null)
		{
			person = new com.business.Person();
			person.setEmail(request.getParameter("email"));
			person.setFirstName(request.getParameter("firstName"));
			person.setLastName(request.getParameter("lastName"));
			person.setPassword(request.getParameter("password"));
			
		}
			
			setPersonAddress(request, person);
			session.setAttribute("person",person);
			RequestDispatcher rs = request.getRequestDispatcher("account.jsp");
			rs.forward(request, response);
	}
	
	public void setPersonAddress(HttpServletRequest request, Person person) {
		Address address = new Address();
		address.setStreet(request.getParameter("street"));
		address.setCity(request.getParameter("city"));
		address.setState(request.getParameter("state"));
		address.setZip(request.getParameter("zipCode"));
		person.setAddress(address);
		//return person;
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
