package models.pages;

import models.components.global.header.HeaderComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.annotation.WillCloseWhenClosed;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver =driver;

    }

    public HeaderComponent headerComponent(){
        return new HeaderComponent(this.driver);

    }
}
