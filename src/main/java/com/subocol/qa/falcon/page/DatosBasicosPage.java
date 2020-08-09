package com.subocol.qa.falcon.page;

import net.serenitybdd.screenplay.targets.Target;

public class DatosBasicosPage {

	public static final Target SINIESTRO = Target.the("Número de siniestro").locatedBy("//input[@id='siniestro']");
	public static final Target IMAGEN = Target.the("Cargue de archivo").locatedBy("//input[@type='file']");
	public static final Target PLACA = Target.the("Placa").locatedBy("//input[@id='placa']");
	public static final Target LUPA = Target.the("Buscar con la lupa").locatedBy("//span[contains(text(),'search')]");
	public static final Target REGION = Target.the("Region").locatedBy("//*[@name='region']");
	public static final Target SELECCION_REGION = Target.the("Selecciona region")
			.locatedBy("//input[@type='checkbox']//following::div[.='{0}']");
	public static final Target DEPARTAMENTO = Target.the("Departamento").locatedBy("//*[@name='departamento']");
	public static final Target SELECCION_DEPARTAMENTO = Target.the("Selecciona Departamento")
			.locatedBy("//input[@type='checkbox']//following::div[.='{0}']");
	public static final Target CIUDAD = Target.the("Ciudad").locatedBy("//*[@name='ciudad']");
	public static final Target SELECCION_CIUDAD = Target.the("Selecciona Ciudad")
			.locatedBy("//input[@type='checkbox']//following::div[.='{0}']");
	public static final Target TALLER = Target.the("Taller").locatedBy("//*[@name='taller']");
	public static final Target SELECCION_TALLER = Target.the("Selecciona Taller")
			.locatedBy("//input[@type='checkbox']//following::div[.='{0}']");

	public static final Target TIPO_PINTURA = Target.the("Tipo Pintura").locatedBy("//*[@name='tipoPintura']");
	public static final Target SELECCION_TIPO_PINTURA = Target.the("Selecciona Tipo de Pintura")
			.locatedBy("//input[@type='checkbox']//following::div[.='{0}']");
	public static final Target CERRAR_POPUP = Target.the("Cerrar PopUp")
			.locatedBy("//button[@type='button' and contains(text(),'Cerrar')]");
	public static final Target TIPO_VEHICULO = Target.the("Tipo de Vehiculo")
			.locatedBy("#sedan > div > img");
	public static final Target BOTON_CONTINUAR = Target.the("Boton Continuar")
			.locatedBy("//button[@type='submit']");
	public static final Target CARGUE_IMG_EXITOSO = Target.the("Cargue de imagen exitoso")
			.locatedBy("//b[contains(text(),'Tarjeta cargada exitosamente')]");
}
