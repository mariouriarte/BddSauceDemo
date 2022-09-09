package StepDefinitions;

import Pages.YourCartPage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;

public class YourCartSteps {

    YourCartPage yourCartPage = new YourCartPage(DriverManager.getInstance().getDriver());

    @And("I click on checkout button")
    public void clickOnCheckoutButton() {
          yourCartPage.clickOnCheckoutButton();
    }

}
