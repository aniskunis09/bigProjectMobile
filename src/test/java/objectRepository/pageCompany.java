package objectRepository;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import support.fileHandling;

public class pageCompany {
    fileHandling fileHandling = new fileHandling();
    String dataTeamName = "src/test/resources/data/teamName.txt";

    By inputCompanyName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[1]");
    By inputCompanyDesc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]");
    By btnCreateCompany = By.xpath("//android.widget.Button[@content-desc='Create']");
    By notifSuccessComp = By.xpath("//android.view.View[@content-desc='Successfully create company user']");
    By btnCloseNotif2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");

    public By getInputCompanyName() {
        return inputCompanyName;
    }
    public By getInputCompanyDesc() {
        return inputCompanyDesc;
    }
    public By getBtnCreateCompany() {
        return btnCreateCompany;
    }
    public By getNotifSuccessComp() {
        return notifSuccessComp;
    }
    public By getBtnCloseNotif2() {
        return btnCloseNotif2;
    }

    By notifFailedComp = By.xpath("//android.view.View[@content-desc='Name and description fields must be filled']");
    By btnCloseNotif4 = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]/android.widget.Button");
    public By getNotifFailedComp() {
        return notifFailedComp;
    }
    public By getBtnCloseNotif4() {
        return btnCloseNotif4;
    }

    public By getCtnCurrTeam(String teamName) {
        By ctnCurrTeam = By.xpath("//android.widget.Button[contains(@content-desc, '" + teamName + "')]");
        return ctnCurrTeam;
    }
}
