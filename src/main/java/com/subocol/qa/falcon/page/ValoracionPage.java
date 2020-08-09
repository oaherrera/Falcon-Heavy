package com.subocol.qa.falcon.page;

import net.serenitybdd.screenplay.targets.Target;

public class ValoracionPage {
	
	public static final Target MARCAR_TODOS = Target.the("Click en marcar todos los items")
			.locatedBy("(//mat-checkbox[contains(@id,'mat-checkbox')])[1]");
	public static final Target SELECCIONAR_ACCION  = Target.the("Selecciona Cambiar o Reparar")
			.locatedBy("(//select[@id='_acc'])[1]");
	public static final Target SELECCIONAR_ACCION_2  = Target.the("Selecciona Cambiar o Reparar")
			.locatedBy("(//select[@id='_acc'])[2]");
	public static final Target BOTON_ACTUALIZAR  = Target.the("Boton Actualizar")
			.locatedBy("//div[contains(@class,'col-4 buttons-table-container')]/button/span[contains(text(),'save')]");
	public static final Target BOTON_CONTINUAR  = Target.the("Boton Continuar")
			.locatedBy("//button[contains(text(),' Continuar ')]");
	public static final Target BOTON_CERRAR_POP_UP  = Target.the("Cerrar ventana emergente")
			.locatedBy("//button[contains(text(),'Cerrar')]");
	public static final Target INGRESAR_NOTAS  = Target.the("Diligenciar notas")
			.locatedBy("//textarea[@placeholder='Escribe tus notas']");
	public static final Target BOTON_GUARDAR  = Target.the("Boton Guardar")
			.locatedBy("//button[contains(text(),' Guardar ')]");
	public static final Target MENSAJE_DE_EXITO  = Target.the("Mensaje de tramite exitoso!!")
			.locatedBy("//p[contains(text(),'Realizaste con exito tu Valoración..')]");
	public static final Target BOTON_SALIR  = Target.the("Boton Salir")
			.locatedBy("//button[contains(text(),'SALIR')]");

}
