package stepDef;

import com.github.javafaker.Faker;
import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.pageTeam;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.fileHandling;


public class team extends env {
    pageTeam elementTeam = new pageTeam();
    Faker faker = new Faker();
    fileHandling fileHandling = new fileHandling();
    String dataTeamName = "src/test/resources/file/teamName.txt";

    @And("user input Team Name")
    public void user_input_team_name() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementTeam.getInputTeamName())
        );
        WebElement inputTeamName = driver.findElement(elementTeam.getInputTeamName());
        inputTeamName.click();
        String teamName = "Team Anis " + faker.number().numberBetween(111, 99999);
        inputTeamName.sendKeys(teamName);
        fileHandling.writeToFile(dataTeamName, teamName);
    }
    @And("user input Team Description")
    public void user_input_team_description() {
        driver.findElement(elementTeam.getInputTeamDesc()).click();
        String teamDesc = "Description Team untuk Big Project SQA 16";
        driver.findElement(elementTeam.getInputTeamDesc()).sendKeys(teamDesc);
    }
    @And("user click Create Team button")
    public void user_click_create_team_button() {
        driver.findElement(elementTeam.getBtnCreateTeam()).click();
    }
    @Then("user is on Current Team Page")
    public void user_is_on_current_team_page() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementTeam.getPageTeam())
        );
    }


    @When("user input Team Name - Negative")
    public void user_input_team_name_negative() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementTeam.getInputTeamName())
        );
        WebElement inputTeamName = driver.findElement(elementTeam.getInputTeamName());
        inputTeamName.click();
        String teamName = "Team Anis - Negative " + faker.number().numberBetween(111, 99999);
        inputTeamName.sendKeys(teamName);
    }


    @When("user click Board Menu button")
    public void user_click_board_menu_button() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementTeam.getBtnBoardMenu())
        );
        driver.findElement(elementTeam.getBtnBoardMenu()).click();
    }
}
