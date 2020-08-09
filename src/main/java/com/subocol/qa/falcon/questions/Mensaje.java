package com.subocol.qa.falcon.questions;



import static net.serenitybdd.core.Serenity.takeScreenshot;

import com.subocol.qa.falcon.page.ValoracionPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Mensaje implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		takeScreenshot();
		return ValoracionPage.MENSAJE_DE_EXITO.resolveFor(actor).isVisible();
		
	}
	
	public static Mensaje esCorrecto() {
		return new Mensaje();
		
	}
	
	

}
