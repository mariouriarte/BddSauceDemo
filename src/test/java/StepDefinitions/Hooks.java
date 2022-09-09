package StepDefinitions;


import Utilities.DriverManager;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void beforeHook() {
        DriverManager.getInstance().getDriver().navigate("https://www.saucedemo.com/");
    }
}
