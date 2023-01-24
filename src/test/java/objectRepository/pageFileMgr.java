package objectRepository;

import org.openqa.selenium.By;

public class pageFileMgr {
    By btnSideBar = By.xpath("//android.widget.ImageButton[@content-desc='Show roots']");
    By btnOpenDrive = By.xpath("//android.widget.FrameLayout[@content-desc='Open Drive']/parent::android.widget.LinearLayout");
    By btnMyDrive = By.xpath("//*/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/com.google.android.material.card.MaterialCardView/android.widget.FrameLayout/android.widget.LinearLayout");
    By btnFilePdf = By.xpath("//*/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/com.google.android.material.card.MaterialCardView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]");
//            By.xpath("//android.widget.Button[@resource-id='com.google.android.documentsui:id/icon_thumb']");

    public By getBtnSideBar() {
        return btnSideBar;
    }
    public By getBtnOpenDrive() {
        return btnOpenDrive;
    }
    public By getBtnMyDrive() {
        return btnMyDrive;
    }
    public By getBtnFilePdf() {
        return btnFilePdf;
    }
}
