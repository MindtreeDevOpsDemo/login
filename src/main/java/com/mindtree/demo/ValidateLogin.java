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



public class ValidateLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ValidateLogin() {
        super();
        // TODO Auto-generated constructor stub
    }


    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String username= request.getParameter("username");
        String password= request.getParameter("password");
        
        System.out.println("User Name " + username ) ;
        System.out.println("password "  + password ) ;
        
        //String user = LoginDb.users.get(username);
        
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
        	//System.out.println("user ok " + user);
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
