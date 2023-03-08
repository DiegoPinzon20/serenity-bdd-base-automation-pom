package com.reliquias.software.pages.mappings;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class PaginaInicioSesion extends PageObject {

    @FindBy(xpath = "//input[@name = 'Username']")
    WebElementFacade inputUsername;

    @FindBy(xpath = "//input[@type = 'password' and contains(@id, 'Login')]")
    WebElementFacade inputPassword;

    @FindBy(xpath = "//button[contains(text(), 'Sign In')]")
    WebElementFacade btnLogin;

}
