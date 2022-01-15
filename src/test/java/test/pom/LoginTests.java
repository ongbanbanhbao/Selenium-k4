package test.pom;

import driver.DriverFactory;
import models.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import url.Urls;

public class LoginTests implements Urls {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        testLoginPageTraditionalPOM(driver);
        testLoginPageMainInteractionMethod(driver);

    }

    private static void testLoginPageTraditionalPOM(WebDriver driver) {
        try {
            driver.get(BASE_URL.concat(LOGIG_PAGE));
            LoginPage loginPage = new LoginPage(driver);
            loginPage.usernameElement().sendKeys("Phuong");
            loginPage.passwordElement().sendKeys("Abcd1234@");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    private static void testLoginPageMainInteractionMethod(WebDriver driver) {
        try {
            driver.get(BASE_URL.concat(LOGIG_PAGE));
            LoginPage loginPage = new LoginPage(driver);
            loginPage.inputUsername("Phuong");
            loginPage.inputPasword("Phuong");
            loginPage.clickOnLoginButton();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
