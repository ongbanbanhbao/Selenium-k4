package api_Learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import url.Urls;

import java.util.List;

public class DynamicControl implements Urls {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();

        try {
            driver.get(BASE_URL.concat(DYNAMIC_CONTROL_PAGE));
            // Tạo một list  button có trên page
            List<WebElement> buttonElements = driver.findElements(By.cssSelector("button"));
            final int REMOVE_BUTTON_INDEX = 0;
            final int ENABLE_BUTTON_INDEX =1;

            buttonElements.get(REMOVE_BUTTON_INDEX).click();
            buttonElements.get(ENABLE_BUTTON_INDEX).click();

            System.out.println(buttonElements.size());

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            driver.quit();
        }
    }
}
