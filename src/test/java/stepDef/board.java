package stepDef;

import com.github.javafaker.Faker;
import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.pageBoard;
import objectRepository.pageCard;
import objectRepository.pageFileMgr;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.mobileGesture;
import support.fileHandling;
import java.util.Set;


public class board extends env {
    pageBoard elementBoard = new pageBoard();
    pageCard elementCard = new pageCard();
    pageFileMgr elementFileMgr = new pageFileMgr();
    Faker faker = new Faker();
    fileHandling fileHandling = new fileHandling();
    mobileGesture gesture = new mobileGesture();
    String dataBoardName = "src/test/resources/file/listName.txt";
    String dataCardName = "src/test/resources/file/cardName.txt";
    String dataCardAmount = "src/test/resources/file/cardAmount.txt";
    String dataComments = "src/test/resources/file/allComments.txt";
    Integer amountFilteredCard = 0;

    @Then("user is on Current Board Page")
    public void user_is_on_current_board_page() throws InterruptedException {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementBoard.getPageDropdownBoard())
        );
    }
    @When("user click Add New List")
    public void user_click_add_new_list() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementBoard.getBtnAddList())
        );
        driver.findElement(elementBoard.getBtnAddList()).click();
    }
    @And("user input List Name Src")
    public void user_input_list_name_src() {
        String boardName = "List Anis Source " + faker.number().numberBetween(111, 99999);
        fileHandling.writeToFile(dataBoardName, boardName);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementBoard.getInputBoardName())
        );
        WebElement inputBoardName = driver.findElement(elementBoard.getInputBoardName());
        inputBoardName.click();
        inputBoardName.sendKeys(boardName);
    }


    @And("user input List Name Tgt")
    public void user_input_list_name_tgt() {
        String boardName = "List Anis Target " + faker.number().numberBetween(111, 99999);
        fileHandling.writeToFile(dataBoardName, boardName);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementBoard.getInputBoardName())
        );
        WebElement inputBoardName = driver.findElement(elementBoard.getInputBoardName());
        inputBoardName.click();
        inputBoardName.sendKeys(boardName);
    }


    @And("user click Submit button")
    public void user_click_submit_button() {
        driver.findElement(elementBoard.getBtnsubmitBoard()).click();
    }
    @Then("user see List in Board has been created")
    public void user_see_list_in_board_has_been_created() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementBoard.getCtnBoardName(fileHandling.readFromFile(dataBoardName)))
        );
    }
    @Then("user stay on Create New List form")
    public void user_stay_on_create_new_list_form() {
        driver.findElement(elementBoard.getInputBoardName()).isDisplayed();
    }


    @When("user click Add New Card button")
    public void user_click_add_new_card_button() {
        driver.findElement(elementBoard.getBtnAddNewCard()).click();
    }
    @And("user input Card Name")
    public void user_input_card_name() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementBoard.getInputCardName())
        );
        WebElement inputCardName = driver.findElement(elementBoard.getInputCardName());
        inputCardName.click();
        String cardName = "Card Anis " + faker.number().numberBetween(111, 99999);
        inputCardName.sendKeys(cardName);
        fileHandling.writeToFile(dataCardName, cardName);
    }


    @And("user change Private card toggle button")
    public void user_change_private_card_toggle_button() {
        wait.until(
                ExpectedConditions.elementToBeClickable(elementBoard.getTogglePrivCard())
        );
        driver.findElement(elementBoard.getTogglePrivCard()).click();
        String toogleStatus = driver.findElement(elementBoard.getTogglePrivCard()).getAttribute("checked");
        Assert.assertEquals(toogleStatus, "true");
    }
    @And("user click Tick On Card Name")
    public void user_click_tick_on_card_name() {
        driver.findElement(elementBoard.getTickOnCard()).click();
    }
    @Then("user see success create Card notification")
    public void user_see_success_create_card_notification() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementBoard.getCtnCard(fileHandling.readFromFile(dataCardName)))
        );
    }


    @Then("user stay on Current Board Page")
    public void user_stay_on_current_board_page() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementBoard.getPageDropdownBoard())
        );
    }


    @When("user get order Current List")
    public void user_get_order_current_list() {
        String sourceList = driver.findElement(elementCard.getListNameDrag(1)).getAttribute("content-desc");
        fileHandling.writeToFile(dataBoardName, sourceList);
        String targetList = driver.findElement(elementCard.getListNameDrag(2)).getAttribute("content-desc");
        fileHandling.writeToFile(dataBoardName, targetList);
    }
    @And("user change order Current List")
    public void user_change_order_current_list() {
        gesture.dragnDrop(driver, elementCard.getListNameDrag(2), elementCard.getListNameDrag(1));
    }

    @Then("user see List has switched to Target List notification")
    public void user_see_list_has_switched_to_target_list_notification() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementCard.getNotifSuccessReorder())
        );
        driver.findElement(elementCard.getCloseNotif3()).click();
    }

    @When("user click Current Card")
    public void user_click_current_card() {
        wait.until(
                ExpectedConditions.elementToBeClickable(elementCard.getBtnCurrCard())
        );
        driver.findElement(elementCard.getBtnCurrCard()).click();
    }


    @And("user click icon pencil to edit Card Name")
    public void user_click_icon_pencil_to_edit_card_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("user edit Card Name")
    public void user_edit_card_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("And user click Tick On Edit Card Name")
    public void and_user_click_tick_on_edit_card_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user success create Card notification")
    public void user_success_create_card_notification() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @And("user click Attach File button")
    public void user_click_attach_file_button() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementCard.getBtnAttachFile())
        );
        driver.findElement(elementCard.getBtnAttachFile()).click();
    }
    @And("user click Allow confirmation")
    public void user_click_allow_confirmation() {
        driver.findElement(elementCard.getBtnAllowConf()).click();
    }

    @And("user choose files to be attached")
    public void user_choose_files_to_be_attached() {
        Set<String> contextNames = driver.getContextHandles();
        for (String strContextName : contextNames) {
            if (strContextName.contains("NATIVE_APP")) {
                driver.context("NATIVE_APP");
                break;
            }
        }
        wait.until(
                ExpectedConditions.elementToBeClickable(elementFileMgr.getBtnSideBar())
        );
//        driver.findElement(elementFileMgr.getBtnSideBar()).click();
//        driver.findElement(elementFileMgr.getBtnOpenDrive()).click();
//        driver.findElement(elementFileMgr.getBtnMyDrive()).click();
        driver.findElement(elementFileMgr.getBtnFilePdf()).click();
    }

    @Then("user see attachment has been uploaded")
    public void user_see_attachment_has_been_uploaded() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementCard.getNotifSuccessAttach())
        );
    }


    @And("user input New Comment")
    public void user_input_new_comment() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementCard.getClickNewComment())
        );
        driver.findElement(elementCard.getClickNewComment()).click();
        WebElement inputNewComment = driver.findElement(elementCard.getBoxInputComment());
        inputNewComment.click();
        String newComment = "Comment Anis " + faker.number().numberBetween(111, 99999);
        inputNewComment.sendKeys(newComment);
        fileHandling.writeToFile(dataComments, newComment);
    }

    @And("user click Submit Comment button")
    public void user_click_submit_comment_button() {
        driver.findElement(elementCard.getBtnSubmitComment()).click();
    }

    @Then("user see comment has been added")
    public void user_see_comment_has_been_added() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementCard.getClickNewComment())
        );
        gesture.swipeToElement(driver, 0.8, 0.5, 0.5, 0.2);
//        gesture.swipeToElement(driver, 0.5, 0.2, 0.2, 0.8);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementCard.getNewComment())
        );
        driver.findElement(elementCard.getNewComment()).isDisplayed();
    }


    @When("user click Filter Card button")
    public void user_click_filter_card_button() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementBoard.getBtnFilter())
        );
        driver.findElement(elementBoard.getBtnFilter()).click();
    }

    @And("user input Card Name on Filter form")
    public void user_input_card_name_on_filter_form() {
        driver.findElement(elementBoard.getInputCardFilter()).click();
        driver.findElement(elementBoard.getInputCardFilter()).sendKeys(fileHandling.readFromFile(dataCardName));
        driver.getKeyboard().sendKeys(Keys.ENTER);
    }

    @And("user click Apply button")
    public void user_click_apply_button() {
        driver.findElement(elementBoard.getBtnApplyFilter()).click();
    }

    @Then("user see filter Card result")
    public void user_see_filter_card_result() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementBoard.getCtnCard(fileHandling.readFromFile(dataCardName)))
        );
    }

    @When("user click Reset function")
    public void user_click_reset_function() {
        driver.findElement(elementBoard.getResetFunc()).click();
    }

    @Then("user see display All Cards")
    public void user_see_display_all_cards() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementBoard.getCtnAllCards())
        );
    }
}