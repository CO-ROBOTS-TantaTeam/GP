package com.user.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import c.beans.userAccount;
import db.connection.mySQLConnUtils;

public class UserUtils {
	  public static List<userAccount> getUserData(Connection conn) throws SQLException {
		  
		  List<userAccount> userData = new ArrayList<userAccount>();
			 
	      String sql = "Select * from user_table";
	 
	      PreparedStatement pstm = conn.prepareStatement(sql);
//	      pstm.setString(1);
	 
	      ResultSet rs = pstm.executeQuery();
	      
	      int id;
	      String username ;
	      String email;
	      String mNumber;
	      String password;
	      String jobDescription;
//	      userAccount user = new userAccount();
	 
	      while (rs.next()) {
	    	  id = rs.getInt(1);
	    	  username = rs.getString(2);
	    	  email = rs.getString(3);
	    	  mNumber = rs.getString(4);
	    	  password = rs.getString(5);
	    	  jobDescription = rs.getString(6);
	    	  
	    	  userAccount user = new userAccount();
	    	  user.setId(id);
	          user.setUsername(username);
	          user.setPassword(password);
	          user.setEmail(email);
	          user.setmNumber(mNumber);
	          user.setPassword(password);
	          user.setJobDescription(jobDescription);
	          userData.add(user);
//	          return userData;
	      }
	      return userData;
	  }
	  
	  
	  public static void delete(int id){
		  String sql = "DELETE FROM user_table " + "WHERE user_id = ?";
		  Connection conn = null;
		  PreparedStatement pstm = null;
//		  int rs;
		try {
			conn = mySQLConnUtils.getMySQLConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      try {
			 pstm = conn.prepareStatement(sql);
			 pstm.setInt(1, id);
			 pstm.executeUpdate();
//			 return rs;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
//	      return 4;
	  }
	  
	  
}
