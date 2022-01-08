package api_Learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import url.Urls;

import java.util.TreeMap;

public class ControlElementInSpoce implements Urls {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();

        try {
            driver.get(BASE_URL.concat(DYNAMIC_CONTROL_PAGE));
            // tìm checkbox-example form
            WebElement checkboxExampleFormElement = driver.findElement(By.id("checkbox-example"));
            // tìm cái button trong cái checkbox-example form kia
            WebElement checkboxExampleButton = checkboxExampleFormElement.findElement(By.cssSelector("button"));


            // Tìm cái input-example from
            WebElement inputExampleFormElement = driver.findElement(By.id("input-example"));
            // Tìm cái button trong cái input-example form
            WebElement inputExampleButton = inputExampleFormElement.findElement(By.cssSelector("button"));


            // click kiểm tra xem nó chọn có đúng button không?
            checkboxExampleButton.click();
            inputExampleButton.click();

            // Sau khi thực hiện sau chờ một chút
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            driver.quit();
        }
    }
}
