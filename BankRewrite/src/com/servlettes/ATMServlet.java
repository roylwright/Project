package com.servlettes;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.business.Person;

/**
 * Servlet implementation class ATMServlet
 */
@WebServlet("/ATMServlet")
public class ATMServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ATMServlet() {
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
				
				//checking deposit	
				String cd = request.getParameter("checkingdeposit");
				if(cd != null){
					setCheckingDeposit(request, person);
					System.out.println("setting the deposit amount.");
				}
				//checking withdraw	
				String cw = request.getParameter("checkingwithdraw");
				if(cw != null){
					setCheckingWithdraw(request, person);
					System.out.println("setting the withdraw amount.");
				}
				//saving deposit	
				String sd = request.getParameter("savingdeposit");
				if(sd != null){
					setSavingDeposit(request, person);
					System.out.println("setting the deposit amount.");
				}
				//saving withdraw	
				String sw = request.getParameter("savingwithdraw");
				if(sw != null){
					setSavingWithdraw(request, person);
					System.out.println("setting the withdraw amount.");
				}
				session.setAttribute("person",person);
				RequestDispatcher rs = request.getRequestDispatcher("atm.jsp");
				rs.forward(request, response);
			}
			
			public void setCheckingDeposit(HttpServletRequest request, Person person) {
				
				person.getChecking().setDeposit(Double.parseDouble(request.getParameter("checkingdeposit")));
			
			}
			public void setCheckingWithdraw(HttpServletRequest request, Person person) {
				
				person.getChecking().setWithdraw(Double.parseDouble(request.getParameter("checkingwithdraw")));
			
			}
			public void setSavingDeposit(HttpServletRequest request, Person person) {
				
				person.getSavings().setDeposit(Double.parseDouble(request.getParameter("savingdeposit")));
				
			}
			public void setSavingWithdraw(HttpServletRequest request, Person person) {
				
				person.getSavings().setWithdraw(Double.parseDouble(request.getParameter("savingwithdraw")));
				
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
