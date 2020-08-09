package com.subocol.qa.falcon.tasks;



import static com.subocol.qa.falcon.page.DatosBasicosPage.IMAGEN;
import static com.subocol.qa.falcon.page.DatosBasicosPage.SINIESTRO;
import static net.serenitybdd.core.Serenity.takeScreenshot;

import com.subocol.qa.falcon.interactions.AdjuntoArchivo;
import com.subocol.qa.falcon.interactions.Esperar;
import com.subocol.qa.falcon.page.DatosBasicosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class LlenoDatosBasicos implements Task {

	private String numeroSiniestro;
	private String rutaArchivo;
	private String VIN;
	private String placa;
	private String marca;
	private String linea;
	private String version;
	private String anio;
	private String region;
	private String departamento;
	private String ciudad;
	private String taller;
	private String tipoPintura;

	public LlenoDatosBasicos(String numeroSiniestro, String rutaArchivo, String VIN, String placa, String marca,
			String linea, String version, String anio, String region, String departamento, String ciudad, String taller,
			String tipoPintura) {
		this.numeroSiniestro = numeroSiniestro;
		this.rutaArchivo = rutaArchivo;
		this.VIN = VIN;
		this.placa = placa;
		this.marca = marca;
		this.linea = linea;
		this.version = version;
		this.anio = anio;
		this.region = region;
		this.departamento = departamento;
		this.ciudad = ciudad;
		this.taller = taller;
		this.tipoPintura = tipoPintura;
	}

	@Override
	@Step("{0} Diligencia datos basicos")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(numeroSiniestro).into(SINIESTRO));
		actor.attemptsTo(AdjuntoArchivo.con(rutaArchivo, IMAGEN), Esperar.por(2000));
		//actor.attemptsTo(Click.on(DatosBasicosPage.LUPA));
//		if(DatosBasicosPage.CARGUE_IMG_EXITOSO.resolveFor(actor).isVisible()) {
//			actor.attemptsTo(Enter.theValue(placa).into(DatosBasicosPage.PLACA));
//		}
		//actor.attemptsTo(Click.on(DatosBasicosPage.CERRAR_POPUP));
		actor.attemptsTo(Click.on(DatosBasicosPage.REGION));
		actor.attemptsTo(Click.on(DatosBasicosPage.SELECCION_REGION.of(region)));
		actor.attemptsTo(Click.on(DatosBasicosPage.DEPARTAMENTO));
		actor.attemptsTo(Click.on(DatosBasicosPage.SELECCION_DEPARTAMENTO.of(departamento)));
		actor.attemptsTo(Click.on(DatosBasicosPage.CIUDAD));
		actor.attemptsTo(Click.on(DatosBasicosPage.SELECCION_CIUDAD.of(ciudad)));
		actor.attemptsTo(Click.on(DatosBasicosPage.TALLER));
		actor.attemptsTo(Click.on(DatosBasicosPage.SELECCION_CIUDAD.of(taller)));
		actor.attemptsTo(Click.on(DatosBasicosPage.TIPO_PINTURA));
		actor.attemptsTo(Click.on(DatosBasicosPage.SELECCION_TIPO_PINTURA.of(tipoPintura)));
		actor.attemptsTo(Click.on(DatosBasicosPage.TIPO_VEHICULO));
		actor.attemptsTo(Enter.theValue(placa).into(DatosBasicosPage.PLACA));
		takeScreenshot();
		actor.attemptsTo(Click.on(DatosBasicosPage.BOTON_CONTINUAR));
		actor.attemptsTo(Esperar.por(2000));
		takeScreenshot();


		
		
	
	
	
	
	
	}

	public static LlenoDatosBasicos conLosDatos(String numeroSiniestro, String rutaArchivo,String placa,
			 String region,
			String departamento,String ciudad,String taller,String tipoPintura) {
		return Tasks.instrumented(LlenoDatosBasicos.class, numeroSiniestro, rutaArchivo,null,placa,null,null,null,null,
				region,departamento,ciudad,taller,tipoPintura);
	}

}
