package objectRepository;

import org.openqa.selenium.By;
import support.fileHandling;

public class pageCard {
    fileHandling fileHandling = new fileHandling();
    String dataCardName = "src/test/resources/file/cardName.txt";


    By notifSuccessReorder = By.xpath("//android.view.View[@content-desc='Reorder list is success']");
    By closeNotif3 = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
    public By getListNameDrag(Integer listOrderNo) {
        By listNameDrag = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[" + listOrderNo + "]/android.view.View");
        return listNameDrag;
    }
    public By getNotifSuccessReorder() {
        return notifSuccessReorder;
    }
    public By getCloseNotif3() {
        return closeNotif3;
    }


    By btnCurrCard = By.xpath("//android.widget.Button[contains(@content-desc,'" + fileHandling.readFromFile(dataCardName) + "')]");
    By clickNewComment = By.xpath("//android.view.View[@content-desc='Add new comment...']");
    By boxInputComment = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText");
    By btnSubmitComment = By.xpath("//android.widget.Button[@content-desc='submit']");
    By newComment = By.xpath("//android.view.View[contains(@content-desc,'Comment Anis')]");
    public By getBtnCurrCard() {
        return btnCurrCard;
    }
    public By getClickNewComment() {
        return clickNewComment;
    }

    public By getBoxInputComment() {
        return boxInputComment;
    }

    public By getBtnSubmitComment() {
        return btnSubmitComment;
    }
    public By getNewComment() {
        return newComment;
    }


    By btnAttachFile = By.xpath("//android.widget.Button[@content-desc='Attach file']");
    By btnAllowConf = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
//            By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']");
    By notifSuccessAttach = By.xpath("//android.view.View[@content-desc='Upload attachments is success']");
    public By getBtnAttachFile() {
        return btnAttachFile;
    }
    public By getBtnAllowConf() {
        return btnAllowConf;
    }
    public By getNotifSuccessAttach() {
        return notifSuccessAttach;
    }
}
