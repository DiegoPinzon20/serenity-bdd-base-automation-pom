package com.reliquias.software.pages.mappings;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {

    @FindBy(xpath = "//main/section/section/h1")
    WebElementFacade txtTitleMainPage;

}
