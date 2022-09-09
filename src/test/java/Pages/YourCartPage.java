package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class YourCartPage {

    private Page driver;
    private Locator checkoutButton;
    private Locator itemAddToCar;
    private Locator priceOfItemCar;

    public YourCartPage(Page driver) {
        this.driver = driver;
        this.checkoutButton = driver.locator("id=checkout");
        this.itemAddToCar = driver.locator("div.cart_item_label a#item_4_title_link div");

        this.priceOfItemCar = driver.locator("div.inventory_item_price");
    }

    public void clickOnCheckoutButton() {
        checkoutButton.click();
    }

    public void verifyAddItemToCart(String item) {
        Assert.assertEquals(item, itemAddToCar.textContent());
    }

    public void verifyPriceOfItemCar(String itemPrice) {
        Assert.assertEquals(itemPrice, priceOfItemCar.textContent());
    }
}
