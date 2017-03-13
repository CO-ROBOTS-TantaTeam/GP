package db.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import c.beans.robotAccount;
import c.beans.userAccount;


public class dbUtils {
//	  public static userAccount findUser(Connection conn, String username, String password) throws SQLException {
//		  
//	      String sql = "Select a.username, a.user_password from user_table a where a.username = ? and a.user_password= ?";
//	 
//	      
//	      PreparedStatement pstm = conn.prepareStatement(sql);
//	      pstm.setString(1, username);
//	      pstm.setString(2, password);
//	      ResultSet rs = pstm.executeQuery();
//	 
//	      if (rs.next()) {
//	          userAccount user = new userAccount();
//	          user.setUsername(username);
//	          user.setPassword(password);
//	          return user;
//	      }
//	      return null;
//	  }
	  
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	  public static userAccount findUser(Connection conn, String username, String password) throws SQLException {
		  
//	      String sql = "Select a.user_email from user_table a where ( a.username = ? or a.user_email=? )  and a.user_password= ?";
		  String sql = "Select a.user_email from user_table a where  a.username = ?   and a.user_password= ?";
		  
//		  String sql = "Select a.username from user_table a where a.username ='"+ username+"'  and a.user_password= ?";
	 
	      
	      PreparedStatement pstm = conn.prepareStatement(sql);
	      pstm.setString(1, username);
//	      pstm.setString(2,username);
	      pstm.setString(2, password);
	      
	      ResultSet rs = pstm.executeQuery();
	 
	      if (rs.next()) {
	    	  
	          userAccount user = new userAccount();
	          user.setUsername(username);
	          user.setPassword(password);
//	          user.setEmail(rs.getString("a.user_email"));
	          return user;
	      }
	      return null;
	  }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	  //i think this is will be called if the user enter a username only
	  
	  public static userAccount findUser(Connection conn, String userName) throws SQLException {
			 
	      String sql = "Select a.username, a.user_password from user_table as a " + " where a.username = ? ";
	 
	      PreparedStatement pstm = conn.prepareStatement(sql);
	      pstm.setString(1, userName);
	 
	      ResultSet rs = pstm.executeQuery();
	 
	      if (rs.next()) {
	          String password = rs.getString("password");
	          userAccount user = new userAccount();
	          user.setUsername(userName);
	          user.setPassword(password);
	          return user;
	      }
	      return null;
	  }
	  
	  public static int robotRegister (Connection conn, float xLocation, float yLocation, float maxLoad) throws SQLException {
		  
		  String sql ="INSERT INTO robot_table (robot_x, robot_y, robot_maxLoad) VALUES(?,?,?)" ;
		  PreparedStatement  pstm = conn.prepareStatement(sql);
		  pstm.setFloat(1, xLocation);
		  pstm.setFloat(2, yLocation);
		  pstm.setFloat(3, maxLoad);
		  int result =pstm.executeUpdate();
		  return result;
	  }
	  
	  public static int userRegister (Connection conn, String username, String email, String mNumber, String password, String jobDescription) throws SQLException {
		  
		  String sql ="INSERT INTO user_table (username, user_email, user_mNumber, user_password, user_jobDescription) VALUES(?,?,?,?,?)" ;
		  PreparedStatement  pstm = conn.prepareStatement(sql);
		  pstm.setString(1, username);
		  pstm.setString(2, email);
		  pstm.setString(3, mNumber);
		  pstm.setString(4, password);
		  pstm.setString(5, jobDescription);
		  int result =pstm.executeUpdate();
		  return result;
	  }

}