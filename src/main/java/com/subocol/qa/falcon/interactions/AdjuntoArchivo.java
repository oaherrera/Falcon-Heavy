package com.subocol.qa.falcon.interactions;

import org.openqa.selenium.WebElement;

import com.subocol.qa.falcon.page.DatosBasicosPage;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class AdjuntoArchivo implements Interaction {

	private String rutaArchivo;
	private Target alCampo;

	public AdjuntoArchivo(String rutaArchivo, Target alCampo) {
		this.rutaArchivo = rutaArchivo;
		if (alCampo != null) {
			this.alCampo = alCampo;
		} else {
			this.alCampo = DatosBasicosPage.IMAGEN;
		}
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		WebElement ElementoWeb = this.alCampo.resolveFor(actor);
		ElementoWeb.sendKeys(rutaArchivo);

	}

	public static AdjuntoArchivo con(String rutaArchivo, Target alCampo) {
		return Tasks.instrumented(AdjuntoArchivo.class, rutaArchivo, alCampo);

	}

}
