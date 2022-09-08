package StepDefinitions;

import Utilities.DriverManager;
import io.cucumber.java.en.Given;

public class CommonSteps {

    @Given("I am in the Sauce Labs Demo Page")
    public void goToMainPage() {
        DriverManager.getInstance().getDriver().navigate("https://www.saucedemo.com/");
    }


}
