package objectRepository;

import org.openqa.selenium.By;
import support.fileHandling;

public class pageHome {
    fileHandling fileHandling = new fileHandling();
    String dataCompanyName = "src/test/resources/file/companyName.txt";


    By btnCloseNotif1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
    By pageHome = By.xpath("//android.widget.ImageView[@content-desc='logo']");
    By btnCreateComp = By.xpath("//android.widget.Button[@content-desc='Create New Company']");
    By btnChooseComp = By.xpath("//android.view.View[contains(@content-desc,'" + fileHandling.readFromFile(dataCompanyName) + "')]");


    By listMember = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]");
    By btnAddTeam = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By btnNewTeam = By.xpath("//android.view.View[@content-desc='Add new team']");


    By btnMenu = By.xpath("//android.view.View[@content-desc=\"Menu\n" +
            "Tab 4 of 4\"]");
    By btnLogout = By.xpath("//android.view.View[@content-desc=\"Logout\n" +
            "v2.0.32+2052\"]");
    By confMsg = By.xpath("//android.view.View[@content-desc='Are you sure to logout ?']");
    By confOk = By.xpath("//android.widget.Button[@content-desc='Ok']");
    By pageLoginType = By.xpath("//android.view.View[@content-desc='Sick of miscoordination?']/android.widget.ImageView[3]");



    public By getBtnCloseNotif1() {
        return btnCloseNotif1;
    }
    public By getPageHome() {
        return pageHome;
    }
    public By getBtnCreateComp() {
        return btnCreateComp;
    }
    public By getBtnChooseComp() {
        return btnChooseComp;
    }
    public By getListMember() {
        return listMember;
    }
    public By getBtnAddTeam() {
        return btnAddTeam;
    }
    public By getBtnNewTeam() {
        return btnNewTeam;
    }
    public By getBtnMenu() {
        return btnMenu;
    }
    public By getBtnLogout() {
        return btnLogout;
    }
    public By getConfMsg() {
        return confMsg;
    }
    public By getConfOk() {
        return confOk;
    }
    public By getPageLoginType() {
        return pageLoginType;
    }
}
