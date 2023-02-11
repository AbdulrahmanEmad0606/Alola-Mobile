package example.stepDefs;

import example.Page.P02_Homepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class D02_HomepageStepDefs extends P02_Homepage {
    @Given("Inspector Navigated To the Home Page")
    public void inspectorNavigatedToTheHomePage() {
        System.out.println("Welcome To HomePage");
    }

    @And("Allow App to Access his Location")
    public void allowAppToAccessHisLocation() {
    }

    @And("Expand Activity Section")
    public void expandActivitySection() {
        expandAllActivities();
    }

    @Then("Success")
    public void success() {
        System.out.println("Done");
    }

    @And("Click on desired Activity{int}")
    public void clickOnDesiredActivityActivityNumber(int arg0) {
       // scrollTo();
        clickOnActivity(arg0-1);
    }
}
