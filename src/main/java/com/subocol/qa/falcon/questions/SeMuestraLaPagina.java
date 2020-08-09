package com.subocol.qa.falcon.questions;

import static com.subocol.qa.falcon.page.HomePage.TITULO_HOME_PAGE;
import static net.serenitybdd.core.Serenity.takeScreenshot;

import com.subocol.qa.falcon.page.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SeMuestraLaPagina implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		takeScreenshot();
		return TITULO_HOME_PAGE.of().resolveFor(actor).isVisible();

	}

	public static SeMuestraLaPagina principal() {
		return new SeMuestraLaPagina();
	}

}
