package api_Learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import url.Urls;

import java.time.Duration;

public class Wait_ExplicitWait implements Urls {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();

        try {
            driver.get(BASE_URL.concat(DYNAMIC_CONTROL_PAGE));
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
            // tìm checkbox-example form
//            WebElement checkboxExampleFormElement = driver.findElement(By.id("checkbox-example"));
//            WebElement checkboxExampleButton = checkboxExampleFormElement.findElement(By.cssSelector("button"));
//            checkboxExampleButton.click();

            // Cách chờ 1: Chờ chừng nào cái nút nó thay đổi rồi mới trigger tiếp
//            wait.until(ExpectedConditions.invisibilityOf(checkboxExampleFormElement.findElement(By.tagName("input"))));


//            // Cách chờ 2:  Chờ chừng nào cái message nó xuất hiện mới trigger tiếp
//            wait.until(ExpectedConditions.visibilityOf(checkboxExampleFormElement.findElement(By.id("message"))));
//
//            // Kiểm tra cái text sau khi trigger xong
//            WebElement checkboxMessage = checkboxExampleFormElement.findElement(By.id("message"));
//            System.out.println(checkboxMessage.getText());



            // ===================

            // Tìm cái input-example from
            WebElement inputExampleFormElement = driver.findElement(By.id("input-example"));
            WebElement inputExampleButton = inputExampleFormElement.findElement(By.cssSelector("button"));
            inputExampleButton.click();

            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#input-example input")));
            inputExampleFormElement.findElement(By.tagName("input")).sendKeys("OKE");

            // Sau khi thực hiện sau chờ một chút
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            driver.quit();
        }
    }
}
