package StepDefinitions;

import Pages.YourCartPage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class YourCartSteps {

    YourCartPage yourCartPage = new YourCartPage(DriverManager.getInstance().getDriver());

    @And("I click on checkout button")
    public void clickOnCheckoutButton() {
          yourCartPage.clickOnCheckoutButton();
    }

    @Then("I verify that the item is {string}")
    public void verifyItemInCart(String item){
        yourCartPage.verifyAddItemToCart(item);
    }

    @Then("I should see a label price that says {string}")
    public void verifyItemPriceInCart(String price){
        yourCartPage.verifyPriceOfItemCar(price);
    }
}
