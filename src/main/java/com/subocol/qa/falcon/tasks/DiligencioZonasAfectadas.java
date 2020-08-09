package com.subocol.qa.falcon.tasks;

import static com.subocol.qa.falcon.page.ZonasAfectadasPage.IMAGEN_ZONAS_AFECTADAS;
import static net.serenitybdd.core.Serenity.takeScreenshot;

import com.subocol.qa.falcon.interactions.AdjuntoArchivo;
import com.subocol.qa.falcon.interactions.Esperar;
import com.subocol.qa.falcon.page.ZonasAfectadasPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class DiligencioZonasAfectadas implements Task{
	
	private String rutaArchivo;
	
	public DiligencioZonasAfectadas(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
		
	}

	@Override
	@Step("{0} Diligencia zonas afectadas del vehículo")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(AdjuntoArchivo.con(rutaArchivo, IMAGEN_ZONAS_AFECTADAS),Esperar.por(3000));
		takeScreenshot();
		actor.attemptsTo(Click.on(ZonasAfectadasPage.BOTON_CONTINUAR));
		actor.attemptsTo(Esperar.por(3000));
		takeScreenshot();
		
	}
	
	public static DiligencioZonasAfectadas conLosDatos(String rutaArchivo) {
		return Tasks.instrumented(DiligencioZonasAfectadas.class, rutaArchivo);
	}

}
