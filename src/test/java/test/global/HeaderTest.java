package test.global;

import driver.DriverFactory;
import models.pages.HomePage;
import models.pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import url.Urls;

public class HeaderTest implements Urls {
    public static void main(String[] args) {
        testHomepageHeader();
        testRegisterPageHeader();

        
    }

    private static void testHomepageHeader() {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URL_WEBSHOP.concat(REGISTER_PAGE));

       try{
           HomePage homePage = new HomePage(driver);
           homePage.headerComponent().searchInputElement().sendKeys("Laptop");
           homePage.headerComponent().searchInputButton().click();Thread.sleep(3000);
       } catch (InterruptedException e) {
           e.printStackTrace();
    } finally {
           driver.quit();
       }

    }

    private static void testRegisterPageHeader() {
        WebDriver driver = DriverFactory.getChromeDriver();
        driver.get(BASE_URL_WEBSHOP.concat(REGISTER_PAGE));

        try{
            RegisterPage registerPage = new RegisterPage(driver);
            registerPage.headerComponent().searchInputElement().sendKeys("Laptop");
            registerPage.headerComponent().searchInputButton().click();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
    } finally {
            driver.quit();
        }

}}

