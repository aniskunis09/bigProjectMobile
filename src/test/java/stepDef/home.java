package stepDef;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.pageHome;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.net.MalformedURLException;

public class home extends env {
    pageHome elementHome = new pageHome();

    @Given("user is on Home page")
    public void user_is_on_home_page() throws MalformedURLException {
//        before();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementHome.getPageHome())
        );
    }
    @When("user verify new Notifications")
    public void user_verify_new_notifications() {
        String pageSource = (driver.getPageSource());
        Boolean checkNotif = (pageSource.contains("not joined any company") || pageSource.contains("don't own or join a company"));
        while (checkNotif){
            if (pageSource.contains("not joined any company") || pageSource.contains("don't own or join a company")) {
                driver.findElement(elementHome.getBtnCloseNotif1()).click();
            }
            pageSource = (driver.getPageSource());
            checkNotif = (pageSource.contains("not joined any company") || pageSource.contains("don't own or join a company"));
        }
    }
    @When("user click Create New Company button")
    public void user_click_create_new_company_button() {
        driver.findElement(elementHome.getBtnCreateComp()).click();
    }
    @When("user click Choose Company Name")
    public void user_click_choose_company_name() {
        wait.until(
                ExpectedConditions.elementToBeClickable(elementHome.getBtnChooseComp())
        );
        driver.findElement(elementHome.getBtnChooseComp()).click();
    }
    @Then("user is on Current Company Page")
    public void user_is_on_current_company_page() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementHome.getListMember())
        );
    }


    @And("user click Add Yellow button")
    public void user_click_add_yellow_button() {
        driver.findElement(elementHome.getBtnAddTeam()).click();
    }
    @And("user choose Add New Team button")
    public void user_choose_add_new_team_button() {
        driver.findElement(elementHome.getBtnNewTeam()).click();
    }


    @When("user click Menu button")
    public void user_click_menu_button() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementHome.getBtnCreateComp())
        );
        driver.findElement(elementHome.getBtnMenu()).click();
    }
    @And("user click Logout button")
    public void user_click_logout_button() {
        driver.findElement(elementHome.getBtnLogout()).click();
    }
    @And("user click OK on confirmation page")
    public void user_click_ok_on_confirmation_page() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementHome.getConfMsg())
        );
        driver.findElement(elementHome.getConfOk()).click();
    }
    @Then("user navigated to Choose Login Type page")
    public void user_navigated_to_choose_login_type_page() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementHome.getPageLoginType())
        );
        driver.findElement(elementHome.getPageLoginType()).isDisplayed();
    }

}
