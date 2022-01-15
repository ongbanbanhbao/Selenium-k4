package models.components.global.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderComponent {
    private final WebDriver driver;
    private static final By componentSelector = By.cssSelector(".header");
    private WebElement component;

    private static final By searchInputSelector = By.cssSelector("form input");
    private static final By searchInputButtonSelector = By.cssSelector(".search-box-button");

    public HeaderComponent(WebDriver driver){
        this.driver = driver;
        component =driver.findElement(componentSelector);
    }

    public WebElement searchInputElement(){
        return this.component.findElement(searchInputSelector);
    }
    
    public WebElement searchInputButton(){
        return this.component.findElement(searchInputButtonSelector);
    }

}
