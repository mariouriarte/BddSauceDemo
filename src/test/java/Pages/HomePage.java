package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class HomePage {
    private Page driver;
    private Locator header;
    private Locator sauceLabsBackPackAddButton;
    private Locator sauceLabsBackPackRemoveButton;
    private Locator cartIcon;
    private Locator optionZtoA;
    private Locator firstItemOfPage;
    private Locator lastItemOfPage;
    private Locator twitterButton;
    private Locator facebookButton;
    private Locator linkedinButton;

    public HomePage(Page driver) {
        this.driver = driver;
        this.header = driver.locator("div.header_label");
        this.sauceLabsBackPackAddButton = driver.locator("id=add-to-cart-sauce-labs-backpack");
        this.cartIcon = driver.locator("a.shopping_cart_link");

        this.optionZtoA = driver.locator("select.product_sort_container");
        this.firstItemOfPage = driver.locator("div.inventory_item:first-child div.inventory_item_label a");
        this.lastItemOfPage = driver.locator("div.inventory_item:last-child div.inventory_item_label a");
        this.sauceLabsBackPackRemoveButton = driver.locator("id=remove-sauce-labs-backpack");

        this.twitterButton = driver.locator("li.social_twitter a");
        this.facebookButton = driver.locator("li.social_facebook a");
        this.linkedinButton = driver.locator("li.social_linkedin a");
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

    public void clickOnOptionZtoA() {
        optionZtoA.selectOption("za");
    }

    public void verifyOrderZtoA(String first, String last){
        Assert.assertEquals(first, firstItemOfPage.textContent());
        Assert.assertEquals(last, lastItemOfPage.textContent());
    }

    public void clickOnRemoveSauceLabsBackPack() {
        sauceLabsBackPackRemoveButton.click();
    }

    public void verifySauceLabsBackPackAddButtonIsDisplay() {
        Assert.assertTrue(sauceLabsBackPackAddButton.isVisible());
    }

    public void verifyTwitterButton(String url) {
        driver.navigate("https://www.saucedemo.com/inventory.html");
        String href = twitterButton.getAttribute("href");
        driver.navigate(href);

        Assert.assertTrue(url.equals(driver.url()));
    }

    public void verifyFacebookButton(String url) {
        driver.navigate("https://www.saucedemo.com/inventory.html");
        String href = facebookButton.getAttribute("href");
        driver.navigate(href);

        Assert.assertTrue(url.equals(driver.url()));
    }

    public void verifyLinkedinButton(String url) {
        driver.navigate("https://www.saucedemo.com/inventory.html");
        String href = linkedinButton.getAttribute("href");
        driver.navigate(href);

        Assert.assertTrue(url.equals(driver.url()));
    }
}
