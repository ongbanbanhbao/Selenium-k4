package api_Learning;

import driver.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import url.Urls;

import java.time.Duration;

public class Lesson17_JSAlert implements Urls {

    private static final By jsAlertSelec = By.cssSelector("[onclick='jsAlert()']");
    private static final By jsConfirmSelec = By.cssSelector("[onclick='jsConfirm()']");
    private static final By jsPromptSelec = By.cssSelector("[onclick='jsPrompt()']");
    private static final By resultSelec = By.cssSelector("#result");

    public static void main(String[] args) {
        // Gọi Chrome drive
        WebDriver driver = DriverFactory.getChromeDriver();

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Đi đến page muốn test. Lấy đường link từ trong kho Urls đã build sẵn
        driver.get(BASE_URL.concat(JAVASCRIPT_ALERTS));

            //  JS Alert
            driver.findElement(jsAlertSelec).click();
            Alert jsAlert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("JS Alert content: " + jsAlert.getText());
            jsAlert.accept();
            driver.findElement(resultSelec).getText();
            Thread.sleep(2000);

            //  JS Confirm
            driver.findElement(jsConfirmSelec).click();
            Alert jsConfirm = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("JS Confirm content: " + jsConfirm.getText());
            jsAlert.accept();
            driver.findElement(resultSelec).getText();
            Thread.sleep(2000);

            //  JS Prompt
            driver.findElement(jsPromptSelec).click();
            Alert jsPrompt = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("JS Prompt content: " + jsConfirm.getText());
            Thread.sleep(2000);
            jsPrompt.sendKeys("Test thử Prompt");
            jsPrompt.accept();
            driver.findElement(resultSelec).getText();
            Thread.sleep(2000);



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

}
