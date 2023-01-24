package support;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class loginType {
    public String getLoginType() {
        List<String> givenList = Arrays.asList("Swipe", "Skip");
        Random rdm = new Random();
        String loginType = givenList.get(rdm.nextInt(givenList.size()));

        return loginType;
    }
}
