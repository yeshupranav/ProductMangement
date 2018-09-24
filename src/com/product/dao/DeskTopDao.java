package com.product.dao;

import java.sql.SQLException;
import java.util.List;

import com.bean.Desktop;

public interface DeskTopDao {

	public void adddesktop(Desktop e) throws SQLException;

	public Desktop getdesktopById(int id) throws SQLException;

	public List<Desktop> getAllDesktops() throws SQLException;


}
