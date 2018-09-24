package com.product.dao;

import java.sql.Connection;

public interface DatabaseConnection {
	public Connection getConnection();

	public void closeConnection();

}
