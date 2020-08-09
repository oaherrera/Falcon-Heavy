package com.subocol.qa.falcon.tasks;


import com.subocol.qa.falcon.interactions.Esperar;
import com.subocol.qa.falcon.page.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.core.Serenity.takeScreenshot;

public class Loguearse implements Task {

	private String usuario;
	private String contrasena;

	public Loguearse(String usuario, String contrasena) {
		this.usuario = usuario;
		this.contrasena = contrasena;
	}

	@Override
	@Step("{0} Ingresa a la Aplicación")
	public <T extends Actor> void performAs(T actor) {
		takeScreenshot();
		actor.attemptsTo(
				Enter.theValue(usuario).into(LoginPage.USUARIO),
				Enter.theValue(contrasena).into(LoginPage.PASSWORD)
						);
		takeScreenshot();
		actor.attemptsTo(Click.on(LoginPage.TERMINOS_Y_CONDICIONES));
		actor.attemptsTo(Click.on(LoginPage.BOTON_INGRESAR));
		actor.attemptsTo(Esperar.por(3000));
		takeScreenshot();
	}

	public static Loguearse conCredenciales(String usuario, String contrasena) {
		return Tasks.instrumented(Loguearse.class, usuario, contrasena);
	}
}
