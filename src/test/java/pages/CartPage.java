package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(css = "[data-test='nav-cart']")
    private WebElement cartButton;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void openCart() {
        click(cartButton);
    }

    public boolean isCartOpened() {

        return waitUtils.waitForUrlContains("/checkout");
    }
}