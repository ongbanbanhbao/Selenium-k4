package api_Learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextUseInnerClass {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            driver.get("https://the-internet.herokuapp.com/login");

            WebElement bottomLinktextElement = driver.findElement(By.linkText("Elemental Selenium"));
            System.out.println(bottomLinktextElement.getText());
            System.out.println(bottomLinktextElement.getAttribute("href"));

        } finally {
            driver.quit();
        }
    }

    public static class Hyperlink {
        private String link;
        private String text;

        public Hyperlink(String link, String text) {
            this.link = link;
            this.text = text;
        }

        public String link() {
            return link;
        }

        public String Text() {
            return text;
        }
    }

}
