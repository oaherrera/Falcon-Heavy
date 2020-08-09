package com.subocol.qa.falcon.tasks;

import static net.serenitybdd.core.Serenity.takeScreenshot;

import com.subocol.qa.falcon.interactions.Esperar;
import com.subocol.qa.falcon.page.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class EscogeOpciones implements Task {

	@Override
	@Step("{0} Escoge las opciones de amparo para el vehiculo")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomePage.ASEGURADO));
		actor.attemptsTo(Click.on(HomePage.TIPO_SERVICIO));
		actor.attemptsTo(Click.on(HomePage.PERDIDA_TOTAL));
		actor.attemptsTo(Click.on(HomePage.CONTINUAR));
		actor.attemptsTo(Esperar.por(1000));
		takeScreenshot();
	}
	
	public static EscogeOpciones deAmparo() {
		return Tasks.instrumented(EscogeOpciones.class);
	}

}
