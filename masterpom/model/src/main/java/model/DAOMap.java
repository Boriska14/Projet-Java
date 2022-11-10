package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOMap {
	public Connection connection;
	public DAOMap(Connection connection) {
		// TODO Auto-generated constructor stub
		this.connection = connection;
	}
	public Connection getConnection() {
		return connection;
	}
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	public boolean create(Map map) throws SQLException  {
		String sql = "call insertMap(?)";
		CallableStatement call = this.connection.prepareCall(sql);
		call.setString(1, map.getLevelFolder());
		
		call.execute();
		return false;
	}
	
	public Map find(int id) throws SQLException {
		Map map = new Map();
		String sql = "call findMap(?)";
		CallableStatement call = this.connection.prepareCall(sql);
		call.setInt(1, id);
		call.execute();
		
		ResultSet result = call.getResultSet();
		if (result.first()) {
			map.setId(id);
			map.setLevelFolder(result.getString("mapscol"));
		}
		
		return map;
	
	}

}
