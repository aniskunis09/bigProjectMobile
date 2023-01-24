package objectRepository;

import org.openqa.selenium.By;
import support.fileHandling;

public class pageTeam {
    fileHandling fileHandling = new fileHandling();
    String dataTeamName = "src/test/resources/file/teamName.txt";


    public By getInputTeamName() {
        By inputTeamName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[1]");
        return inputTeamName;
    }
    public By getInputTeamDesc() {
        By inputTeamDesc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]");
        return inputTeamDesc;
    }
    public By getBtnCreateTeam() {
        By btnCreateTeam = By.xpath("//android.widget.Button[@content-desc='Create']");
        return btnCreateTeam;
    }


    public By getPageTeam() {
        By pageTeam = By.xpath("//android.view.View[contains(@content-desc, '" + fileHandling.readFromFile(dataTeamName) + "')]");
        return pageTeam;
    }
    public By getBtnBoardMenu() {
        By btnBoardMenu = By.xpath("//*[@content-desc='Board']");
        return btnBoardMenu;
    }
}
