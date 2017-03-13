package com.task.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.connection.mySQLConnUtils;

/**
 * Servlet implementation class TaskDoRegister
 */
@WebServlet("/TaskDoRegister")
public class TaskDoRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaskDoRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Connection conn =null;
		Task task = null;
		int i=0;
		String taskName = request.getParameter("taskName");
		String taskLoadS = request.getParameter("taskLoad");
		String taskDescription = request.getParameter("taskDescription");
		float taskLoadF = Float.parseFloat(taskLoadS);
		System.out.println("inside do task");
		try {
			conn =mySQLConnUtils.getMySQLConnection();
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			i = TaskUtils.taskRegister(conn, taskName, taskDescription, taskLoadF);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0){
			 RequestDispatcher dispatcher
            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/login.jsp");

            dispatcher.forward(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
