package api_Learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import url.Urls;

import java.util.ArrayList;
import java.util.List;

public class Lesson17_MouseHover implements Urls {
    private static final By figureSelec = By.className("figure"); // nếu bắt bằng css thì BY.cssSelector("figure")
    private static final By figureImgSelec = By.tagName("img");
    private static final By figureDescSelec = By.tagName("h5");
    private static final By figureImglinkSelec = By.tagName("a");

    public static void main(String[] args) {
        // Gọi Chrome drive
        WebDriver driver = DriverFactory.getChromeDriver();

        try {
            // đi đến page muốn test. Lấy đường link từ trong kho Urls đã build sẵn
        driver.get(BASE_URL.concat(HOVERS));

            // Tìm những figure rồi bỏ vào List
            List<WebElement> figureElements = driver.findElements(figureSelec);
            List<FigureData> figureDataList = new ArrayList<>();

            // Actions
            Actions actions = new Actions(driver);

            // Verification
            if (figureElements.isEmpty())
                throw new RuntimeException("Không có cái hình nào hết á!!!");
            else {
                for (WebElement figureElement : figureElements) {
                    actions.moveToElement(figureElement).perform();

                    // Lấy data của Figure

                    WebElement figureImgElement = figureElement.findElement(figureImgSelec);
                    WebElement figureDescElement = figureElement.findElement(figureDescSelec);
                    WebElement figureImgLinkElement = figureElement.findElement(figureImglinkSelec);

                    String figureIngSrc = figureImgElement.getAttribute("src");
                    String figureDesc = figureDescElement.getText();
                    String figureImgLink = figureImgLinkElement.getAttribute("href");


                    // Print
                    System.out.println(figureIngSrc);
                    System.out.println(figureDesc);
                    System.out.println(figureImgLink);


                    // Out into figureData list
                    FigureData figureData = new FigureData(figureIngSrc,figureDesc,figureImgLink);
                    figureDataList.add(figureData);

                    for (FigureData data : figureDataList) {
                        System.out.println(figureData);

                    }

                    // Dừng lại xíu
                    Thread.sleep(2000);


                }
            }




        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
    // Xây dựng Inner Class
    public static class FigureData {
        private  String imgSrc;
        private  String imgDesc;
        private  String imglink;

        public FigureData(String imgSrc, String imgDesc, String imglink) {
            this.imgSrc = imgSrc;
            this.imgDesc = imgDesc;
            this.imglink = imglink;
        }

        public String getImgSrc() {
            return imgSrc;
        }

        public String getImgDesc() {
            return imgDesc;
        }

        public String getImglink() {
            return imglink;
        }

        @Override
        public String toString() {
            return "FigureData{" +
                    "imgSrc='" + imgSrc + '\'' +
                    ", imgDesc='" + imgDesc + '\'' +
                    ", imglink='" + imglink + '\'' +
                    '}';
        }
    }



}
