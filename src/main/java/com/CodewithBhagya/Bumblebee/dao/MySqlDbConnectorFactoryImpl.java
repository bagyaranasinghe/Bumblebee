package com.CodewithBhagya.Bumblebee.dao;

public class MySqlDbConnectorFactoryImpl implements DbConnectorFactory{

	@Override
	public DbConnector getDbConnector() {
		
		return new MySqlConnectorImpl();
	}
	
}
