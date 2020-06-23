package com.wipro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.bean.UserBean;
import com.wipro.dao.UserDAO;

/**
 * Servlet implementation class LoginServletController
 */
@WebServlet("/LoginServletController")
public class LoginServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();//to  write out on response page
		String uname=request.getParameter("uname");// accessing entered username and password
		String pwd=request.getParameter("pwd");
		UserBean user=new UserBean();
		user.setUserName(uname);
		user.setPassword(pwd);
		UserDAO dao=new UserDAO();
		String status=dao.checkUser(user);//validating whether entered data is present in database or not
		if(status.equalsIgnoreCase("Success")) 
			response.sendRedirect("success.html");//sending redirect to new page
		else 
			response.sendRedirect("fail.html");
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
