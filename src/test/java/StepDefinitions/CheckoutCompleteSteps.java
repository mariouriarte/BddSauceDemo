package StepDefinitions;

import Pages.CheckoutCompletePage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;

public class CheckoutCompleteSteps {

    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(DriverManager.getInstance().getDriver());

    @And("I should see a message that says {string}")
    public void clickOnFinishButton(String message) {
        checkoutCompletePage.verifyThankYouMessage(message);
    }
}
