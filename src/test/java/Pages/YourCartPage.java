package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class YourCartPage {

    private Page driver;
    private Locator checkoutButton;
    private Locator itemAddToCar;

    public YourCartPage(Page driver) {
        this.driver = driver;
        this.checkoutButton = driver.locator("id=checkout");
        this.itemAddToCar = driver.locator("div.cart_item_label a#item_4_title_link div");
    }

    public void clickOnCheckoutButton() {
        checkoutButton.click();
    }

    public void verifyAddItemToCart(String item) {
        Assert.assertEquals(item, itemAddToCar.textContent());
    }
}
