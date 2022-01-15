package models.pages;

import models.components.global.header.HeaderComponent;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private final WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver =driver;

    }

    public HeaderComponent headerComponent(){
        return new HeaderComponent(this.driver);

    }
}
