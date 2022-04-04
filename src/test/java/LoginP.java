import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class LoginP extends BaseTest{
    @Step("giris alanına <email> ve <password> yazma")
    public void insertLoginInformation(String email, String password) {
        try {
            waitUntilElementVisible(By.id(LocatorP.LOGINPAGE.getLocator()));
            appiumDriver.findElement(By.id(LocatorP.INSERTEMAIL.getLocator())).sendKeys(email);
            appiumDriver.findElement(By.id(LocatorP.INSERTPASSWORD.getLocator())).sendKeys(password);
            logger.info("login bilgileri yazildi");
        } catch (Exception e) {
            logger.info("login kısmında hata alindi");
        }
    }
}
