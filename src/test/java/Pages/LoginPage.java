package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage {

    private Page driver;
    private Locator userNameTextBox;
    private Locator passwordTextBox;
    private Locator loginButton;

    public LoginPage(Page page) {
        this.driver = page;
        this.userNameTextBox = driver.locator("id=user-name");
        this.passwordTextBox = driver.locator("id=password");
        this.loginButton = driver.locator("id=login-button");
    }


    public void setUserNameTextBox(String userName) {
        userNameTextBox.type(userName);
    }

    public void setPasswordTextBox(String password) {
        passwordTextBox.type(password);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }
}
