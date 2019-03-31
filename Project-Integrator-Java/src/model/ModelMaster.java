package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class ModelMaster {

	Connection conn;
	PreparedStatement pstmtUpdate;
	PreparedStatement pstmtSave;
	Statement stmt;
	ResultSet rs;
	int rowCount;
	int id;
	
	public void openConnection() {
		try {
			try {
				Class.forName("org.postgresql.driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn = DriverManager.getConnection("jdbc:postgresql:database", "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void closeConnection() {
		try {
			if (stmt != null)
				stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}