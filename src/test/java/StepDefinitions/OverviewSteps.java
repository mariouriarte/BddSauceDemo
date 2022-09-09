package StepDefinitions;

import Pages.OverviewPage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;

public class OverviewSteps {

    OverviewPage overviewPage = new OverviewPage(DriverManager.getInstance().getDriver());

    @And("I click on finish button")
    public void clickOnFinishButton() {
        overviewPage.clickOnFinishButton();
    }
}
