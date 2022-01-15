package models.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    private static final By usernameSelector = By.id("username");
    private static final By passwordSelector = By.id("password");
    private static final By loginButtonSelector = By.cssSelector("#login button[type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    public WebElement usernameElement() {
        return this.driver.findElement(usernameSelector);
    }

    public WebElement passwordElement() {

        return this.driver.findElement(passwordSelector);
    }

    // Main interaction Methods
    public LoginPage inputUsername(String username) {
        usernameElement().sendKeys(username);
        return this;
    }

    public LoginPage inputPasword(String password) {
        passwordElement().sendKeys(password);
        return this;
    }

    public void clickOnLoginButton(){
        driver.findElement(loginButtonSelector).click();
    }

}
