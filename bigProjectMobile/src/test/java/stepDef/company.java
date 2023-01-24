package stepDef;

import com.github.javafaker.Faker;
import config.env;
import org.junit.Assert;
import org.openqa.selenium.By;
import support.fileHandling;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import objectRepository.pageCompany;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class company extends env {
    pageCompany elementCompany = new pageCompany();
    fileHandling fileHandling = new fileHandling();
    Faker faker = new Faker();
    String dataCompanyName = "src/test/resources/file/companyName.txt";
    String dataTeamName = "src/test/resources/file/teamName.txt";


    @And("user input Company Name")
    public void user_input_company_name() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementCompany.getInputCompanyName())
        );
        WebElement inputCompanyName = driver.findElement(elementCompany.getInputCompanyName());
        inputCompanyName.click();
        String companyName = "Company Anis " + faker.number().numberBetween(111, 99999);
        inputCompanyName.sendKeys(companyName);
        fileHandling.writeToFile(dataCompanyName, companyName);
    }
    @And("user input Company Description")
    public void user_input_company_description() {
        driver.findElement(elementCompany.getInputCompanyDesc()).click();
        String compDesc = "Description Company untuk Big Project SQA 16";
        driver.findElement(elementCompany.getInputCompanyDesc()).sendKeys(compDesc);
    }
    @And("user click Create Company button")
    public void user_click_create_company_button() {
        driver.findElement(elementCompany.getBtnCreateCompany()).click();
    }
    @Then("user see success create Company notification")
    public void user_see_success_create_company_notification() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementCompany.getNotifSuccessComp())
        );
        driver.findElement(elementCompany.getNotifSuccessComp()).isDisplayed();
        driver.findElement(elementCompany.getBtnCloseNotif2()).click();
    }


    @And("user input Company Name - Negative")
    public void user_input_company_name_negative() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementCompany.getInputCompanyName())
        );
        WebElement inputCompanyName = driver.findElement(elementCompany.getInputCompanyName());
        inputCompanyName.click();
        String companyName = "Company Anis - Negative " + faker.number().numberBetween(111, 99999);
        inputCompanyName.sendKeys(companyName);
    }
    @Then("user see fields must be filled notification")
    public void user_see_fields_must_be_filled_notification() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementCompany.getNotifFailedComp())
        );
        driver.findElement(elementCompany.getNotifFailedComp()).isDisplayed();
        driver.findElement(elementCompany.getBtnCloseNotif4()).click();
    }

    @Then("user click Choose Team Name")
    public void user_click_choose_team_name() {
        By btnCurrentTeam = elementCompany.getCtnCurrTeam(fileHandling.readFromFile(dataTeamName));
        wait.until(
                ExpectedConditions.elementToBeClickable(btnCurrentTeam)
        );
        driver.findElement(btnCurrentTeam).click();
    }
}
