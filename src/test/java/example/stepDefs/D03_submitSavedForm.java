package example.stepDefs;

import Base.PageBase;
import Base.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class D03_submitSavedForm extends PageBase {
    Utils utils=new Utils();
    @And("Click on the save button")
    public void clickOnTheSaveButton() {
        utils.getSaveBtn().click();
    }
    @And("Navigate to saved Events")
    public void navigateToSavedEvents() throws InterruptedException {
        utils.navigateToSavedEvent();
    }
    @Then("Success")
    public void success() throws InterruptedException {
        utils.submitSavedForm();
    }

}
