package StepDefinitions;

import Pages.HomePage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomeSteps {

    private HomePage homePage = new HomePage(DriverManager.getInstance().getDriver());

    @Then("I am in the home page")
    @Then("I should be in the home page")
    public void verifyImInHomePage() {

        homePage.verifyHeaderHomePageIsDisplay();
    }

    @Then("I verify that {string} is displayed")
    public void verifyProductInHomePage(String product) {
        homePage.verifyProductInHomePage(product);
    }

    @Then("I add sauce labs back pack product to the car")
    public void addSauceLabsBackpackToCart() {
        homePage.clickOnAddSauceLabsBackPack();
    }

    @And("I click on the cart icon")
    public void clickOnCartIcon() {
        homePage.clickOnCartIcon();
    }
}
