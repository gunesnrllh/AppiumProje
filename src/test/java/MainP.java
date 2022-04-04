import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MainP extends BaseTest {

   /* @Step("Güncellemeyi atla")
    public void clicktheSkippUppDate(){
        try {
            appiumDriver.findElement(By.id(LocatorP.SKIPPUPDATE.getLocator())).click();
        }catch (Exception e){
            logger.info("Güncelleme atlanamadı");

        }

}
 */
    @Step("Uygulama Acma kontrol")
    public void checkHomePage() {
        try {
            waitUntilElementVisible(By.id(LocatorP.HOMEPAGE_CHECK.getLocator()));
            boolean isDisplayed = appiumDriver.findElement(By.id(LocatorP.HOMEPAGE_CHECK.getLocator())).isDisplayed();
            if (isDisplayed) {
                String text = appiumDriver.findElement(By.id(LocatorP.ALISVERISE_BASLA.getLocator())).getText();
                Assert.assertEquals("ALIŞVERİŞE BAŞLA", text, "Anasayfa acildi");
            }
        } catch (Exception e) {
            logger.info("Uygulama acilirken bir hata olustu");
        }
    }


    @Step("Alisverise Baslaya Tıkla")
    public void clickAlisveriseBasla() {
        try {
            appiumDriver.findElement(By.id(LocatorP.ALISVERISE_BASLA.getLocator())).click();
        } catch (Exception e) {
            logger.info("Alisverise Baslanamadi");
        }
    }

    @Step("Alisveris sayfasi kontrolü")
    public void checkShoppingPage() {
        try {
            waitUntilElementVisible(By.xpath(LocatorP.SHOPPINGPAGECHECK.getLocator()));
            String text = appiumDriver.findElement(By.xpath(LocatorP.SHOPPINGPAGECHECK.getLocator())).getText();
            Assert.assertEquals("Ev Tekstili",text,"alisveris sekmesi acildi");
        } catch (Exception e) {
            logger.info("alisveris sayfasi acilirken hata oldu");
        }
    }
}

