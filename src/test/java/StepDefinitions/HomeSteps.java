package StepDefinitions;

import Pages.HomePage;
import Utilities.DriverManager;
import io.cucumber.java.en.Then;

public class HomeSteps {

    private HomePage homePage = new HomePage(DriverManager.getInstance().getDriver());

    @Then("I should be in the home page")
    public void verifyImInHomePage() {

    }
}
