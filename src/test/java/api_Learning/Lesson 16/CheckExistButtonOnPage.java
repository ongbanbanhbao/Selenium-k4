package api_Learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import url.Urls;

import java.util.List;

public class CheckExistButtonOnPage implements Urls {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        // Check button đó có trên page hay không?
        // Cách 1: Dùng try - Catch: Nếu ra lõi NosuchElement => OKe
        // Cách 2: Dùng List
        try {
            driver.get(BASE_URL.concat(DYNAMIC_CONTROL_PAGE));
            List<WebElement> checkButton = driver.findElements(By.className("gì gì đó"));
            System.out.println(checkButton.isEmpty());
            if(checkButton.isEmpty())
                throw new RuntimeException("Cái này để thông báo là list bị rỗng");

            for (WebElement webElement : checkButton) {

            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            driver.quit();
        }
    }
}
