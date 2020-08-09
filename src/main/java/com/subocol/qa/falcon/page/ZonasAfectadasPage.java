package com.subocol.qa.falcon.page;

import net.serenitybdd.screenplay.targets.Target;

public class ZonasAfectadasPage {

	public static final Target IMAGEN_ZONAS_AFECTADAS = Target.the("Cargue de archivo")
			.locatedBy("(//input[@type='file'])[1]");
	public static final Target BOTON_CONTINUAR = Target.the("Boton Continuar").
			locatedBy("//button[contains(text(),'Continuar')]");
}
