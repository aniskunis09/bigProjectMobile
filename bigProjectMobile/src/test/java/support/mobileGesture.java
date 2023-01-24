package support;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;


public class mobileGesture {
    public void dragnDrop(AppiumDriver driver, By sourceElement, By targetElement) {
        AndroidElement source = (AndroidElement) driver.findElement(sourceElement);
        AndroidElement target = (AndroidElement) driver.findElement(targetElement);

        new AndroidTouchAction(driver).longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(source)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(ElementOption.element(target))
                .release()
                .perform();
    }

    public void swipeToElement(AppiumDriver driver, double start_xh, double start_yh, double end_xh, double end_yh) {
        Dimension dimension = driver.manage().window().getSize();
        int startXH = (int) (dimension.width * start_xh);
        int startYH = (int) (dimension.height * start_yh);
        int endXH = (int) (dimension.width * end_xh);
        int endYH = (int) (dimension.height * end_yh);

        new TouchAction(driver).press(PointOption.point(startXH, startYH))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(endXH, endYH))
                .release()
                .perform();
    }
}
