package com.subocol.qa.falcon.page;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
	  public static final Target TITULO_HOME_PAGE = Target.the("Titulo de la pagina ")
	            .locatedBy("//h3[contains(text(),'Amparo a afectar')]");
	  public static final Target ASEGURADO = Target.the("Asegurado")
	            .locatedBy("//div[contains(text(),'Tercero')]");
	  public static final Target TIPO_SERVICIO = Target.the("Tipo de  Servicio")
	            .locatedBy("//div[contains(text(),'Particular')]");
	  public static final Target PERDIDA_TOTAL = Target.the("Perdida Total")
	            .locatedBy("//div[contains(text(),'No')]");
	  public static final Target CONTINUAR = Target.the("Click en el boton continuar")
	            .locatedBy("//button[contains(text(),' CONTINUAR ')]");
}
