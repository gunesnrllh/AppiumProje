import com.thoughtworks.gauge.Step;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class Movements extends BaseTest{
    @Step("İki kez geri dön")
    public void backDouble() {
        try {
            appiumDriver.navigate().back();
            logger.info("geri butonuna tıklandı");
            appiumDriver.navigate().back();
            logger.info("geri butonuna ikinci kez tıklandı");
        } catch (Exception e) {
            logger.info("İki kez geri tıklamada hata alındı");
        }
    }

    @Step("İki kez asagi in")
    public void swipeDouble() {

/*
        (new TouchAction(driver))
                .press({x: 720, y: 2472})
  .moveTo({x: 712: y: 952})
  .release()
                .perform()

        (new TouchAction(driver))
                .press({x: 720, y: 2413})
  .moveTo({x: 720: y: 573})
  .release()

}*/
}}
