package com.subocol.qa.falcon.steps;

import com.subocol.qa.falcon.drivers.OwnWebDriver;
import com.subocol.qa.falcon.questions.SeMuestraLaPagina;
import com.subocol.qa.falcon.tasks.Loguearse;
import com.subocol.qa.falcon.utilitarios.Selenium;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginSteps {

	@Given("^ingreso a la aplicacion con usuario: (.+) y password: (.+)$")
	public void meAutenticoConUsuarioYContraseña(String usuario, String contrasena) {
		setTheStage(Cast.ofStandardActors());
		theActorCalled(usuario);
		theActorInTheSpotlight()
				.can(BrowseTheWeb.with(OwnWebDriver.withChrome().setURL(Selenium.parameters().getProperty("url"))));
		theActorInTheSpotlight().attemptsTo(Loguearse.conCredenciales(usuario, contrasena));
	}

	@Then("^la aplicacion me muestra el home page$")
	public void la_aplicacion_me_muestra_el_home_page() {
		theActorInTheSpotlight().should(seeThat(SeMuestraLaPagina.principal()));

	}
}
