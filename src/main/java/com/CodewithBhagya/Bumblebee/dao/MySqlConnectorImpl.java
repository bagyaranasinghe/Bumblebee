package com.CodewithBhagya.Bumblebee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnectorImpl implements DbConnector {

	
	public Connection getDbConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/bumble.bee.loan.sys";
		String userName = "root";
		String password = "root";

		return DriverManager.getConnection(url, userName, password);
	}

	
}
