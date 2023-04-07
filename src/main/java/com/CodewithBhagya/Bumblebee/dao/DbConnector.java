package com.CodewithBhagya.Bumblebee.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface DbConnector {
	
	Connection getDbConnection() throws ClassNotFoundException, SQLException;
}
