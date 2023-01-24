package stepDef;

import config.env;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.loginType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class hooks extends env {
    login funcLogin = new login();
    loginType selectLoginType = new loginType();

    @Before
    public void before() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel 4 API 30");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
//        capabilities.setCapability("app", "src/test/resources/apk/cicle-staging.apk");
        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("appActivity", "staging.cicle.MainActivity");

        URL url = new URL(baseUrl);
        driver = new AndroidDriver(url, capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, duration);

        String selectedLoginType = selectLoginType.getLoginType();
        funcLogin.user_choose_method_login(selectedLoginType);
//        funcLogin.user_has_open_cicle_app();
        funcLogin.user_click_sign_in_button();
        funcLogin.user_click_sign_in_by_google_account_button();
        funcLogin.user_choose_account();
    }

    @After
    public void after(){
        driver.quit();
    }
}
