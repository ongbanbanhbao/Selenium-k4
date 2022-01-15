package api_Learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import url.Urls;

public class Lesson17_IFRAME implements Urls {

    public static void main(String[] args) {
        // Gọi Chrome drive
        WebDriver driver = DriverFactory.getChromeDriver();

        try {
            // Đi đến page muốn test. Lấy đường link từ trong kho Urls đã build sẵn
        driver.get(BASE_URL.concat(IFRAME));

            // Switch to iframe
            WebElement iFrameElement = driver.findElement(By.cssSelector("[id$='ifr']"));
            driver.switchTo().frame(iFrameElement);


            // Clear default text then input an new one
            WebElement editorInputElement = driver.findElement(By.id("tinymce"));
            editorInputElement.clear();
            editorInputElement.sendKeys("This is the new texts");
            // Switch back to default frame
            driver.switchTo().defaultContent();


            // Another interactions continue here.......

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

}
