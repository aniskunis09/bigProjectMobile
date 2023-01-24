package stepDef;

import config.env;
import objectRepository.pageLogin;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.mobileGesture;

public class login extends env {
    pageLogin elementLogin = new pageLogin();
    mobileGesture gesture = new mobileGesture();


//    public void user_has_open_cicle_app() {
//        wait.until(
//                ExpectedConditions.visibilityOfElementLocated(elementLogin.getPageCicle())
//        );
//    }

    public void user_choose_method_login(String loginType) {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementLogin.getBtnSkip())
        );
        if (loginType.equals("Swipe")) {
            driver.findElement(elementLogin.getBtnYes()).click();
            for (int i=0; i<=3; i++){
                gesture.swipeToElement(driver, 0.8, 0.5, 0.2, 0.5);
            }
        } else {
            driver.findElement(elementLogin.getBtnSkip()).click();
        }

    }
    public void user_click_sign_in_button() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementLogin.getBtnSignIn())
        );
        driver.findElement(elementLogin.getBtnSignIn()).click();
    }
    public void user_click_sign_in_by_google_account_button() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementLogin.getBtnSignInGoogle())
        );
        driver.findElement(elementLogin.getBtnSignInGoogle()).click();
    }
    public void user_choose_account() {
        driver.findElement(elementLogin.getBtnChooseAccount()).click();
    }
}
