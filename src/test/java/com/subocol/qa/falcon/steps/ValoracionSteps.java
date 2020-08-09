package com.subocol.qa.falcon.steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import java.util.List;

import com.subocol.qa.falcon.interactions.Esperar;
import com.subocol.qa.falcon.interactions.Termina;
import com.subocol.qa.falcon.models.DatosBasicos;
import com.subocol.qa.falcon.questions.Mensaje;
import com.subocol.qa.falcon.tasks.BuscarPiezas;
import com.subocol.qa.falcon.tasks.DiligencioValoracion;
import com.subocol.qa.falcon.tasks.DiligencioZonasAfectadas;
import com.subocol.qa.falcon.tasks.EscogeOpciones;
import com.subocol.qa.falcon.tasks.LlenoDatosBasicos;
import com.subocol.qa.falcon.tasks.ValidarDatosValoracion;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;





public class ValoracionSteps {
	
	
	@When("^diligencio datos de amparo$")
	public void diligencio_datos_de_amparo() {
		theActorInTheSpotlight().attemptsTo(EscogeOpciones.deAmparo());
		
	}


	@When("^diligencio los datos basicos$")
	public void diligencio_los_datos_basicos(List<DatosBasicos> datosBasicos) {
		DatosBasicos.guardarInformacion(datosBasicos.get(0));
		theActorInTheSpotlight().attemptsTo(LlenoDatosBasicos.conLosDatos(datosBasicos.get(0).getNumeroSiniestro(),
				datosBasicos.get(0).getRutaArchivo(),datosBasicos.get(0).getPlaca(), datosBasicos.get(0).getRegion(),
				datosBasicos.get(0).getDepartamento(),
				datosBasicos.get(0).getCiudad(),datosBasicos.get(0).getTaller(),datosBasicos.get(0).getTipoPintura()));
	}

	@When("^diligencio zonas afectadas$")
	public void diligencio_zonas_afectadas(List<DatosBasicos> datosBasicos) {
		DatosBasicos.guardarInformacion(datosBasicos.get(0));
		theActorInTheSpotlight().attemptsTo(DiligencioZonasAfectadas.conLosDatos(datosBasicos.get(0).getRutaArchivo()));
	   
	}

	@When("^agrego las piezas o repuestos$")
	public void agrego_las_piezas_o_repuestos(List<String> palabra) {
		String palabraBuscada = palabra.get(1);
		theActorInTheSpotlight().attemptsTo(BuscarPiezas.deNombre(palabraBuscada), Esperar.por(1000));
	   
	}

	@When("^diligencio la valoracion$")
	public void diligencio_la_valoracion() {
	   theActorInTheSpotlight().attemptsTo(DiligencioValoracion.conDatos());
	}

	@Then("^se muestra mensaje de tramite exitoso$")
	public void se_muestra_mensaje_de_tramite_exitoso() {
		theActorInTheSpotlight().should(seeThat(Mensaje.esCorrecto()));
	}
	
	@And("^sale de la aplicacion$")
	public void saleDeLaAplicacion() {
		theActorInTheSpotlight().attemptsTo(Termina.conSalir());
	}
	
	@Then("^valido la informacion con base de datos$")
	public void valido_la_informacion_con_base_de_datos() {
		theActorInTheSpotlight().attemptsTo(ValidarDatosValoracion.query());
	}

}
