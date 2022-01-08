package api_Learning;

import driver.DriverFactory;
import org.apache.commons.exec.OS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Linktext {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverFactory.getChromeDriver();

        try {
            // open the page
            driver.get("https://the-internet.herokuapp.com/login");

           WebElement bottomHyperlink = driver.findElement(By.linkText("Elemental Selenium"));
            System.out.println(bottomHyperlink.getText());
            System.out.println(bottomHyperlink.getAttribute("href"));

            Thread.sleep(3000);
        } finally {
            // Quit driver session
            driver.quit();
        }
}}


