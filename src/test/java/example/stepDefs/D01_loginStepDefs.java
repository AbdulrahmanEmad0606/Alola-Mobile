package example.stepDefs;

import example.Screens.S01_LoginScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class D01_loginStepDefs {
    S01_LoginScreen p01_login=new S01_LoginScreen();
    @Given("Inspector Open the Application")
    public void inspectorOpenTheApplication() {
        System.out.println("Welcome to AlOla App");
    }

    @And("Enter Valid userName{string}")
    public void enterValidUserName(String arg0) {
        p01_login.setUserName(arg0);
    }

    @And("Enter Valid Password{string}")
    public void enterValidPassword(String arg1) {
        p01_login.setPassword(arg1);
    }
    @And("Click Login")
    public void clickLogin() {
        p01_login.clickLogin();
    }
    @Then("User Should Login Successfully")
    public void userShouldLoginSuccessfully() {
        System.out.println("Inspector Navigated to Home Page");
    }

}
