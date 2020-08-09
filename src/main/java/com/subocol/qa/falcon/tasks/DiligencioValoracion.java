package com.subocol.qa.falcon.tasks;

import static net.serenitybdd.core.Serenity.takeScreenshot;

import com.subocol.qa.falcon.interactions.Esperar;
import com.subocol.qa.falcon.page.ValoracionPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

public class DiligencioValoracion implements Task {

	@Override
	@Step("{0} Diligencia datos de valoración")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ValoracionPage.MARCAR_TODOS));
		actor.attemptsTo(SelectFromOptions.byVisibleText("Cambiar").from(ValoracionPage.SELECCIONAR_ACCION));
		actor.attemptsTo(SelectFromOptions.byVisibleText("Cambiar").from(ValoracionPage.SELECCIONAR_ACCION_2));
		takeScreenshot();
		actor.attemptsTo(Click.on(ValoracionPage.BOTON_ACTUALIZAR), Esperar.por(1000));
		actor.attemptsTo(Click.on(ValoracionPage.BOTON_CERRAR_POP_UP));
		takeScreenshot();
		actor.attemptsTo(Click.on(ValoracionPage.BOTON_CONTINUAR));
		actor.attemptsTo(Enter.theValue("notas de prueba").into(ValoracionPage.INGRESAR_NOTAS));
		takeScreenshot();
		actor.attemptsTo(Click.on(ValoracionPage.BOTON_GUARDAR));
		takeScreenshot();
		
		
		actor.attemptsTo(Esperar.por(3000));
	}
	
	public static DiligencioValoracion conDatos() {
		return Tasks.instrumented(DiligencioValoracion.class);
	}

}
