import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;


public class BaseTest {
    protected static AppiumDriver<MobileElement> appiumDriver;
    protected Logger logger = LogManager.getLogger(BaseTest.class);

    protected boolean localAndroid = true;
    @BeforeScenario

    public void beforeScenario() throws MalformedURLException {
        System.out.println("Android testi başlıyor");

        if (localAndroid) {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
            desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.ozdilek.ozdilekteyim");
            desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.ozdilek.ozdilekteyim.MainActivity");
            desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3000);
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiTestingProject");
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            appiumDriver = new AndroidDriver(url, desiredCapabilities);
        } else {
            System.out.println("İos testi başlıyor");
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiTestingProject");
            desiredCapabilities.setCapability(MobileCapabilityType.UDID, "00008030-00157936018B802E");
            desiredCapabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.ozdilek.ozdilekteyim");
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.7.1");
            desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3000);
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            appiumDriver = new IOSDriver(url, desiredCapabilities);

        }
        }

    @AfterScenario
    public void afterScenario() {
        if(appiumDriver != null)
            appiumDriver.quit();
            logger.info("Driver terminated");
    }
    public void waitUntilElementVisible(By element) {
        WebDriverWait wait = new WebDriverWait(appiumDriver, 20);//20 saniye içinde uygulamaya ait element görünme kontrolü
        wait.until(ExpectedConditions.elementToBeClickable(element));//eğer tıklanabilirse tılanması
}
}
