import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

public class CategoryP extends BaseTest {
    @Step("Kategori sekmesine tiklama")
    public void openCategoryPage() {
        try {
            waitUntilElementVisible(By.id(LocatorP.CATEGORY.getLocator()));
            if (appiumDriver.findElement(By.id(LocatorP.CATEGORY.getLocator())).isDisplayed()) {
                String text = appiumDriver.findElement(By.xpath(LocatorP.CATEGORYCHECK.getLocator())).getAttribute("content-desc");
                Assert.assertNotEquals("Kategoriler", text, "Kategoriler acilamadi");
                appiumDriver.findElement(By.id(LocatorP.CATEGORY.getLocator())).click();
                logger.info("Kategorilere giris yapildi");
                waitUntilElementVisible(By.xpath(LocatorP.WOMANCATEGORYSELECT.getLocator()));
                appiumDriver.findElement(By.xpath(LocatorP.WOMANCATEGORYSELECT.getLocator())).click();
            }
        } catch (Exception e) {
            logger.info("Kadin kategorisi acilamadi");
        }
    }
    @Step("Pantolon kategorisi secilmesi")
    public void choosePantolon() {
        try {
            waitUntilElementVisible(By.xpath(LocatorP.PANTOLONSELECT.getLocator()));
            if (appiumDriver.findElement(By.xpath(LocatorP.PANTOLONSELECT.getLocator())).isDisplayed()) {
                appiumDriver.findElement(By.xpath(LocatorP.PANTOLONSELECT.getLocator())).click();
                logger.info("Pntalaon kategorisine tiklandi");
            }
        } catch (Exception e) {
            logger.info("Pantolonlar acilamadi");
        }
    }

    @Step("Random kadin pantolonu secilmesi")
    public void chooseRandomProduct() {
        try {
            waitUntilElementVisible(By.id(LocatorP.PRODUCTSCHECK.getLocator()));
            List<MobileElement> productList = appiumDriver.findElementsByXPath(LocatorP.PRDUCTSLIST.getLocator());
            int size = productList.size();
            Random random = new Random();
            int selectedProduct = random.nextInt(size);
            productList.get(selectedProduct).click();
            logger.info("Random kadın pantolonu secildi");
        } catch (Exception e) {
            logger.info("Random pantolon secilemedi");
        }
    }
}

