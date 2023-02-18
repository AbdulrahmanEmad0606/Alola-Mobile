package example.stepDefs;

import Base.PageBase;
import Base.Utils;
import example.Screens.Forms.S01_ScanningForm;
import example.Screens.S02_HomeScreen;
import example.Screens.S03_LocationsScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class D02_SubmitFormStepDefs extends PageBase {
    S01_ScanningForm p04_form=new S01_ScanningForm();
    S02_HomeScreen s02_homeScreen=new S02_HomeScreen();
    S03_LocationsScreen s03_locationsScreen=new S03_LocationsScreen();
    Utils utils=new Utils();
    @Given("Inspector Navigated To the Home Page")
    public void inspectorNavigatedToTheHomePage() {
        System.out.println("Welcome To HomePage");
    }

    @And("Expand Activity Section")
    public void expandActivitySection() {
        s02_homeScreen.expandAllActivities();
    }
    @And("Click on desired Activity{int}")
    public void clickOnDesiredActivityActivityNumber(int arg0) {
       // scrollTo();
        s02_homeScreen.clickOnActivity(arg0-1);
    }
    @And("Select schedule")
    public void selectScheduleScheduleNumber() {
     s02_homeScreen.selectSchedule();
    }
    @And("Click on the Skip Button")
    public void clickOnTheSkipButton() {
        s03_locationsScreen.clickSkip();
    }
    @And("Fill Form")
    public void FillForm() throws InterruptedException {
        p04_form.fillForm();
    }
    @Then("Click on Submit Button")
    public void clickOnSubmitButton() throws InterruptedException {
        utils.submitForm();
    }
}
