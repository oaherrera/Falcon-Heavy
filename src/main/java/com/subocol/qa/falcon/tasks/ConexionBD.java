package com.subocol.qa.falcon.tasks;

import java.sql.*;

public class ConexionBD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		final String URL = "jdbc:postgresql://db-falcon-heavy-sql.cjan3bowtp9i.us-east-1.rds.amazonaws.com/db_fhv";
		final String USER = "fhv_test_user";
		final String PASS = "2$V}u+qM;:\"J(q:y";

		Connection con = null;

		try {

			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(URL, USER, PASS);
			String sql = "SELECT  v.id, v.fecha_hora_valoracion, v.usuario, v.aseguradora\r\n" + "from valoracion v";
			PreparedStatement pstm = con.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		}

	}

}
