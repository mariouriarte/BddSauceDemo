package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class YourInformationPage {

    private Page driver;
    private Locator nameTextBox;
    private Locator lastNameTextBox;
    private Locator zipCodeTextBox;
    private Locator continueButton;

    public YourInformationPage(Page driver) {
        this.driver = driver;
        this.nameTextBox = driver.locator("id=first-name");
        this.lastNameTextBox = driver.locator("id=last-name");
        this.zipCodeTextBox = driver.locator("id=postal-code");
        this.continueButton = driver.locator("id=continue");
    }


    public void setNameTextBox(String name) {
        this.nameTextBox.type(name);
    }

    public void setLastNameTextBox(String lastName) {
        this.lastNameTextBox.type(lastName);
    }

    public void setZipCodeTextBox(String zip) {
        this.zipCodeTextBox.type(zip);
    }

    public void clickOnContinueButton() {
        this.continueButton.click();
    }
}
