package api_Learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import url.Urls;

import java.util.ArrayList;
import java.util.List;

public class Lesson17_DropDownList implements Urls {

    public static void main(String[] args) {
        // Gọi Chrome drive
        WebDriver driver = DriverFactory.getChromeDriver();

        try {
            // đi đến page muốn test. Lấy đường link từ trong kho Urls đã build sẵn
        driver.get(BASE_URL.concat(DROPDOWN_LIST));

            // Target Dropdown
            Select select = new Select(driver.findElement(By.cssSelector("#dropdown")));

            select.selectByVisibleText("Option 1");
            Thread.sleep(1000);

            select.selectByIndex(2); // => Vì option 2 là index 2
            Thread.sleep(1000);

            select.selectByValue("1");
            Thread.sleep(1000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

}
