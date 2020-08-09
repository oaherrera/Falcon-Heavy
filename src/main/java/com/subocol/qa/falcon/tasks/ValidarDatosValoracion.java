package com.subocol.qa.falcon.tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.subocol.qa.falcon.models.DatosBasicos;
import com.subocol.qa.falcon.utilitarios.ConexionBD;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class ValidarDatosValoracion implements Task {
	
	private ConexionBD conexion;
	private PreparedStatement psentencia;
	
	
		
	
	
	@Override
	@Step("{0} valida persistencia en la BD")
	public <T extends Actor> void performAs(T actor) {
		
		
		String sql="";
		
		
		 sql = " SELECT * FROM public.valoracion where placa = 'AAA111' ";
		
		try {
			
			conexion = ConexionBD.getConexion();
			psentencia = conexion.metPrepararSentcia(sql);
			ResultSet datos = psentencia.executeQuery();
			
			System.out.println("LOS DATOS DE LA CONSULTA SON: "+ datos);
			

			while (datos.next()) {
				DatosBasicos.traerInformacion(0).setPlaca(datos.getString(11));
				DatosBasicos.traerInformacion(0).setVIN(datos.getString(12));
				DatosBasicos.traerInformacion(0).setLinea(datos.getString(13));
				DatosBasicos.traerInformacion(0).setMarca(datos.getString(14));
			}
			
			
//			actor.attemptsTo(SQLEvidences.screenshot(sql,
//					ClaimDetail.getWorkerFirstName() + " - " + ClaimDetail.getWorkerLastName() + " - "
//							+ ClaimDetail.getEmployerName() + " - " + ClaimDetail.getWorkerDateOfInjury()));
			psentencia.clearParameters();
			psentencia.close();
			conexion.metDesconectarBd();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	public static ValidarDatosValoracion query() {
		return Tasks.instrumented(ValidarDatosValoracion.class );
	}
	
	

}
