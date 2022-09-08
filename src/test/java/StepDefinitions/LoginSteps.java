package StepDefinitions;

import Pages.LoginPage;
import Utilities.DriverManager;
import io.cucumber.java.en.When;

public class LoginSteps {

    private LoginPage loginPage = new LoginPage(DriverManager.getInstance().getDriver());

    @When("I set the user name text box with a valid user name")
    public void setUserName() {
        loginPage.setUserNameTextBox("standard_user");

    }

    @When("I set the password text box with a valid password")
    public void setPassword() {
        loginPage.setPasswordTextBox("secret_sauce");
    }

    @When("I click on the login button")
    public void clickOnLoginButton() {
        loginPage.clickOnLoginButton();
    }

}
