package com.subocol.qa.falcon.page;

import net.serenitybdd.screenplay.targets.Target;


public class LoginPage {

    public static final Target USUARIO = Target.the("Usuario ")
            .locatedBy("//input[@id='usuario']");
    public static final Target PASSWORD = Target.the("Contraseña ")
            .locatedBy("//input[@id='password']");
    public static final Target TERMINOS_Y_CONDICIONES = Target.the("Terminos y Condiciones ")
            .locatedBy("//div[@class='custom-control custom-checkbox terminos']");
    public static final Target BOTON_INGRESAR = Target.the("Ingresar")
            .locatedBy("//button[contains(@type,'submit')]");
}
