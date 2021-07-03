package com.project.mentoring.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.mentoring.command.PAppointmentCommand;
import com.project.mentoring.command.PCommand;
import com.project.mentoring.command.PPaymentcommand;
import com.project.mentoring.command.PProductSelectCommand;


/**
 * Servlet implementation class PFrontController
 */
@WebServlet("*.do")
public class PFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
		actionDo(request, response);
	
	}
	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo()");
		
		request.setCharacterEncoding("UTF-8");
		
		String uri = request.getRequestURI();  // /MVCBoard/start.do 이런식으로 가져오는게 uri "user request information"
		String conPath = request.getContextPath(); // /MVCBoard 이런식으로 프로젝트 이름만 가져오는게 contextPath
		String com = uri.substring(conPath.length()); // /start.do 이런식으로 가져옴 uri 에서 contextPath 를빼주면 원하는것만 가져온다  
		
		String viewPage = null;
		PCommand command = null;
		
		switch(com) {
		case("/first.do"):
			command = new PProductSelectCommand();
			command.execute(request, response);
			viewPage = "ProductSelect.jsp";
			break;
		case("/Appointment.do"):
			command = new PAppointmentCommand();
			command.execute(request, response);
			viewPage = "Appointment.jsp";
			break;
		case("/Payment.do"):
		command = new PPaymentcommand();
		command.execute(request, response);
		viewPage = "Payment.jsp";
		break;
			

		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
		
	}
		
	
	
} // ----------