import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductDetailsP extends BaseTest{


    @Step("Ürün bedeni secme")
    public void chooseSize() {
        try {
            waitUntilElementVisible(By.xpath(LocatorP.PRODUCTCHOOSESIZE.getLocator()));
            appiumDriver.findElementByXPath(LocatorP.PRODUCTCHOOSESIZE.getLocator()).click();
            logger.info("ürün bedeni secildi");
        } catch (Exception e) {
            logger.info("ürün bedeni secilemedi");
        }
    }

    @Step("Favorilere ekle")
    public void addToFavorites() {
        try {
            appiumDriver.findElement(By.id(LocatorP.PRODUCTADDFAVORITES.getLocator())).click();
            logger.info("favorilere eklendi");
        } catch (Exception e) {
            logger.info("favroilere eklenemedi");
                    }
    }

    @Step("Sepete ekle")
    public void addToBasket() {
        try {
            appiumDriver.findElement(By.id(LocatorP.ADDCART.getLocator())).click();
            logger.info("sepete eklendi");
        } catch (Exception e) {
            logger.info("ürün sepete eklenemdi");
        }
    }
}

