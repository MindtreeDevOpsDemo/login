package com.mindtree.demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindtree.demo.db.DataBase;


/**
 * Servlet implementation class ValidateLogin
 */
public class ValidateLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
/*	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("WELCOME: TO DEMO");
	}*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String username= request.getParameter("username");
        String password= request.getParameter("password");
        
        System.out.println("User Name " + username ) ;
        System.out.println("password "  + password ) ;
        
        String user = LoginDb.users.get(username);
        
        DataBase db = DataBase.getObj();
        
       Connection conn= db.getDbCon();
       
       try {
		java.sql.Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT username FROM LOGIN WHERE username ='"+ username+"' and password ='"+password+"'" );
		
		int count =0;
	    while(rs.next())
	    {
	    	 count++;
	    }
		
	    if(count > 0)
        {
        	System.out.println("user ok " + user);
        	response.sendRedirect("welcome.jsp");
        }
        else
        {
        	System.out.println("username or password is incorrect");
        	response.sendRedirect("Invalid.jsp");
        }
	    
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
       
     
		//doGet(request, response);
	}

}
