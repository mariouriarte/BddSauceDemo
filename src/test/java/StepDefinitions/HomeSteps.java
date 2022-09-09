package StepDefinitions;

import Pages.HomePage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

    @When("I click on sort items NAME Z to A")
    public void clickOnOptionZtoA() {
        homePage.clickOnOptionZtoA();
    }

    @Then("I verify first products is {string} and last is {string}")
    public void verifyOrderZtoA(String first, String last) {
        homePage.verifyOrderZtoA(first, last);
    }

    @Then("I click on the remove button on sauce labs back pack")
    public void removeSauceLabsBackpackToCart() {
        homePage.clickOnRemoveSauceLabsBackPack();
    }

    @Then("I verify that the button ADD TO CART is display")
    public void verifySauceLabsBackPackAddButtonIsDisplay() {
        homePage.verifySauceLabsBackPackAddButtonIsDisplay();
    }

    @Then("I click on twitter button i should see {string} page")
    public void verifyTwitterButton(String url) {
        homePage.verifyTwitterButton(url);
    }

    @Then("I click on facebook button i should see {string} page")
    public void verifyFacebookButton(String url) {
        homePage.verifyFacebookButton(url);
    }

    @Then("I click on linkedin button i should see {string} page")
    public void verifyLinkedinButton(String url) {
        homePage.verifyLinkedinButton(url);
    }
}
