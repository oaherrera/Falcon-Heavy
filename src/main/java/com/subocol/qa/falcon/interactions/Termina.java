package com.subocol.qa.falcon.interactions;

import static net.serenitybdd.core.Serenity.takeScreenshot;

import com.subocol.qa.falcon.page.ValoracionPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class Termina implements Interaction {

	@Override
	@Step("{0} Termina y da click en el boton salir")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ValoracionPage.BOTON_SALIR));
		takeScreenshot();
	}
	
	public static Termina conSalir() {
		return Tasks.instrumented(Termina.class);
	}

}
