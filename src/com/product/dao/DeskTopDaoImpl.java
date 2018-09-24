package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bean.Desktop;
import com.bean.Dimension;

public class DeskTopDaoImpl implements DeskTopDao {
	DatabaseConnection db = new DatabaseConnectionImpl();

	@Override
	public void adddesktop(Desktop e) throws SQLException {
		Connection con = db.getConnection();
		/*
		 * int pid, String pname, Date mfd, int serviceId, String components, Dimension
		 * Dimension, int RAM, int harddisk, String name
		 */ String sql = "insert into productdesktop values(?,?,?,?,?,?,?,?)";// pre-compiled queries
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, e.getPid());
		stmt.setString(2, e.getName());
		// stmt.setDate(3,e.getMfd());
		stmt.setInt(3, e.getServiceId());
		stmt.setString(4, e.getComponents());
		stmt.setDouble(5, e.getDimension().getHeigth());
		stmt.setInt(6, e.getRAM());
		stmt.setInt(7, e.getHarddisk());
		stmt.setString(8, e.getName());

		stmt.execute();

	}

	@Override
	public Desktop getdesktopById(int id) throws SQLException {
		return null;

/*		Connection conn = db.getConnection();
		Statement stmt = conn.createStatement();
		String sql = "select * from productdesktop where id=" + id;
		ResultSet rs = stmt.executeQuery(sql);
		Desktop d = null;

		while (rs.next()) {
			d = new Desktop(rs.getInt(1), rs.getString(2), null, id, rs.getString(3), null, id, id, rs.getString(4));
		}
		return d;
*/	}

	@Override
	public List<Desktop> getAllDesktops() throws SQLException {
		return null;

		/*List<Desktop> desktoplist = new ArrayList<Desktop>();
		Connection con = db.getConnection();
		System.out.println(con);
		// System.out.println("***********" + con);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from productdesktop");
		while (rs.next()) {
			Desktop d = new Desktop(rs.getInt(1), rs.getString(2), null, 0, rs.getString(3), null, 0, 0,
					rs.getString(4));
			desktoplist.add(d);

		}

		// db.closeConnection();
		return desktoplist;
*/	}

}
