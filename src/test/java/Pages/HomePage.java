package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class HomePage {
    private Page driver;
    private Locator header;
    private Locator item;


    public HomePage(Page driver) {
        this.driver = driver;
        this.header = driver.locator("div.header_label");
    }

    public void verifyHeaderHomePageIsDisplay() {

        Assert.assertTrue(!header.isDisabled());

    }

    public void verifyProductInHomePage(String product) {
        Assert.assertTrue(driver.isVisible("//div[text()='" + product + "']"));
    }
}
