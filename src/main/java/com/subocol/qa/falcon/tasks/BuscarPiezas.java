package com.subocol.qa.falcon.tasks;

import static net.serenitybdd.core.Serenity.takeScreenshot;

import com.subocol.qa.falcon.interactions.Esperar;
import com.subocol.qa.falcon.page.AgregarPiezasPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;


public class BuscarPiezas implements Task {
	
	private String palabra;
	
	public BuscarPiezas(String palabra) {
		this.palabra = palabra;
	}
	
	

	@Override
	@Step("{0} Busca piezas a ser reparadas")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(palabra).into(AgregarPiezasPage.BUSCAR_PIEZAS));
		takeScreenshot();
		actor.attemptsTo(Esperar.por(1000));
		actor.attemptsTo(Click.on(AgregarPiezasPage.PALABRA_BUSCADA));
		takeScreenshot();
		actor.attemptsTo(Click.on(AgregarPiezasPage.OTRA_PIEZA));
		takeScreenshot();
		actor.attemptsTo(Click.on(AgregarPiezasPage.BOTON_CONTINUAR));
		takeScreenshot();
		actor.attemptsTo(Esperar.por(3000));
		takeScreenshot();

	}
	
	public static BuscarPiezas deNombre(String palabra) {
		return Tasks.instrumented(BuscarPiezas.class, palabra);
	}

}
