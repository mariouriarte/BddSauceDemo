package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class HomePage {
    private Page driver;
    private Locator header;
    private Locator sauceLabsBackPackAddButton;
    private Locator cartIcon;

    private Locator firstItemList;
    private Locator lastItemList;

    public HomePage(Page driver) {
        this.driver = driver;
        this.header = driver.locator("div.header_label");
        this.sauceLabsBackPackAddButton = driver.locator("id=add-to-cart-sauce-labs-backpack");
        this.cartIcon = driver.locator("a.shopping_cart_link");

        this.firstItemList = driver.locator("div.inventory_item:first-child div.inventory_item_label a");
        this.lastItemList = driver.locator("a.shopping_cart_link");
    }

    public void verifyHeaderHomePageIsDisplay() {
        Assert.assertTrue(!header.isDisabled());
    }

    public void verifyProductInHomePage(String product) {
        Assert.assertTrue(driver.isVisible("//div[text()='" + product + "']"));
    }

    public void clickOnAddSauceLabsBackPack() {
        sauceLabsBackPackAddButton.click();
    }

    public void clickOnCartIcon() {
        cartIcon.click();
    }
}
