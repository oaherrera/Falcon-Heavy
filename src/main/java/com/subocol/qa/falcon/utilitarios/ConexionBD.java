package com.subocol.qa.falcon.utilitarios;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ConexionBD {

	public static ConexionBD objClaConxion;
	private Connection conexion;

	public static ConexionBD getConexion() {
		if (objClaConxion == null) {
			objClaConxion = new ConexionBD();
		}
		return objClaConxion;
	}

	public Connection Conexion() {
		return this.conexion;
	}

	private Connection metGetConexionDrive() {
		try {
			Class.forName("org.postgresql.Driver");
			return this.conexion = DriverManager.getConnection(
					"jdbc:postgresql://db-falcon-heavy-sql.cjan3bowtp9i.us-east-1.rds.amazonaws.com/db_fhv",
					"fhv_test_user",
					"2$V}u+qM;:\"J(q:y");
			
			
			
		} catch (SQLException ex) {
			Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
			System.out.println("Error Metodo metGetConexionDrive: " + ex.getMessage());
		} catch (ClassNotFoundException ex) {
			System.out.println("Error Metodo metGetConexionDrive: " + ex.getMessage());
			Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		
		return null;
	}

	public void metDesconectarBd() {
		try {
			this.conexion.close();
			System.out.println("Desconectado? " + this.conexion.isClosed());
		} catch (SQLException ex) {
			System.out.println("Error Metodo metDesconectarBd: " + ex.getMessage());
			Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public PreparedStatement metPrepararSentcia(String parSentencia) {
		try {
			PreparedStatement preparedStatement = metGetConexionDrive().prepareStatement(parSentencia);
			System.out.println("" + parSentencia);
			return preparedStatement;
		} catch (SQLException ex) {
			System.out.println("Error Metodo metPrepararSentcia: " + ex.getMessage());
			Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public CallableStatement metPrepararSentciaSP(String parSentencia) {
		try {
			CallableStatement preparedStatement = metGetConexionDrive().prepareCall(parSentencia);
			System.out.println("" + parSentencia);
			return preparedStatement;
		} catch (SQLException ex) {
			System.out.println("Error Metodo metPrepararSentcia: " + ex.getMessage());
			Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

}