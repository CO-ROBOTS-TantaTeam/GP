package com.task.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TaskUtils {
	
	public static int taskRegister(Connection conn, String taskName, String taskDescription, float taskLoad) throws SQLException{
		
		String sql = "INSERT INTO task_table (task_name, task_description, task_load) VALUES(?,?,?)";
		
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, taskName);
		pstm.setString(2, taskDescription);
		pstm.setFloat(3, taskLoad);
		int result =pstm.executeUpdate();
		
		return result;
	
	}

}
