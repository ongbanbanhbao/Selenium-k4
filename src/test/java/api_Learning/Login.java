package api_Learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import java.sql.Driver;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverFactory.getChromeDriver();

        // open page
        try {
            driver.get("https://the-internet.herokuapp.com/login");

            // Find Username/ Password textbox Element by using selector
            WebElement usernameElement = driver.findElement(By.id("username"));
            WebElement passwordElement = driver.findElement(By.id("password"));

            // Input username and password
            usernameElement.sendKeys("ongbanbanhbao");
            usernameElement.clear();
            usernameElement.sendKeys("tomsmith");

            passwordElement.sendKeys("Abcd1234@");
            passwordElement.clear();
            passwordElement.sendKeys("SuperSecretPassword!");

            // Click on Login button

            WebElement clickOnLoginbutton = driver.findElement(By.cssSelector("#login button[type='submit']"));
            clickOnLoginbutton.click();


            Thread.sleep(3000);
        } finally {
            // Quit driver session
            driver.quit();
        }
    }
}
