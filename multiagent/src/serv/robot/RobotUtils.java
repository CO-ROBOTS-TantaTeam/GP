package serv.robot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import c.beans.robotAccount;
import c.beans.userAccount;
import db.connection.mySQLConnUtils;

public class RobotUtils {
	public static List<robotAccount> getRobotData(Connection conn) throws SQLException {
		  
		  List<robotAccount> robotData = new ArrayList<robotAccount>();
			 
	      String sql = "Select * from robot_table";
	 
	      PreparedStatement pstm = conn.prepareStatement(sql);
//	      pstm.setString(1);
	 
	      ResultSet rs = pstm.executeQuery();
	      
	      int rID;
	      float xLocation;
	      float yLocation;
	      float maxLoad;
	      
//	      userAccount user = new userAccount();
	 
	      while (rs.next()) {
	    	  rID = rs.getInt(1);
	    	  xLocation = rs.getFloat(4);
	    	  yLocation = rs.getFloat(5);
	    	  maxLoad = rs.getFloat(6);

	    	  robotAccount robot = new robotAccount();
	    	  robot.setrID(rID);
	    	  robot.setXLocation(xLocation);
	    	  robot.setYLocation(yLocation);
	    	  robot.setMaxLoad(maxLoad);
	    	 
	    	  robotData.add(robot);
//	          return userData;
	      }
	      return robotData;
	  }
	  
	  
	  public static void deleteRobot(int id){
		  String sql = "DELETE FROM robot_table " + "WHERE robot_id = ?";
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

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  
	  public static void updateRobot(int id , float xLocation, float yLocation, float maxLoad){
		  String sql = "UPDATE robot_table " + "SET (robot_x = ? , robot_y = ? , robot_maxLoad = ?) WHERE id = ?";
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
			 pstm.setFloat(1, xLocation);
			 pstm.setFloat(2, yLocation);
			 pstm.setFloat(3, maxLoad);
			 pstm.setInt(4, id);
			 pstm.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }

}
