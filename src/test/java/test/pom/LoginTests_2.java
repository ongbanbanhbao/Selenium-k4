package test.pom;

import driver.DriverFactory;
import models.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import url.Urls;

public class LoginTests_2 implements Urls {
    public static void main(String[] args) {

        testLoginPageTraditionalPOM();
        testLoginPageMainInteractionMethod();
        testLoginPageMethodChaining();


    }

    private static void testLoginPageTraditionalPOM() {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            ;
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

    private static void testLoginPageMainInteractionMethod() {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {

            driver.get(BASE_URL.concat(LOGIG_PAGE));
            LoginPage loginPage = new LoginPage(driver);
            loginPage.inputUsername("Phuong123");
            loginPage.inputPasword("Abcd1234@");
            loginPage.clickOnLoginButton();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    private static void testLoginPageMethodChaining() {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {

            driver.get(BASE_URL.concat(LOGIG_PAGE));
            LoginPage loginPage = new LoginPage(driver);
            loginPage
                    .inputUsername("Phuong123")
                    .inputPasword("Abcd1234@")
                    .clickOnLoginButton();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
