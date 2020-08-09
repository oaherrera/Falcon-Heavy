package com.subocol.qa.falcon.page;

import net.serenitybdd.screenplay.targets.Target;

public class AgregarPiezasPage {
	
	public static final Target BUSCAR_PIEZAS = Target.the("Buscar Piezas")
			.locatedBy("//input[@id='mat-input-0']");
	public static final Target PALABRA_BUSCADA = Target.the("Palabra Buscada")
			.locatedBy("(//div[@id='mat-autocomplete-0']//mat-option)[1]");
	public static final Target OTRA_PIEZA = Target.the("Selecciona otra pieza")
			.locatedBy("(//mat-checkbox[contains(@id,'mat-checkbox')])[2]");
	public static final Target BOTON_CONTINUAR = Target.the("Boton continuar")
			.locatedBy("//button[contains(text(),'Continuar')]");


}
