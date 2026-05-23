package pages;

import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(css = "[data-test='nav-cart']")
    private WebElement cartButton;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Step("Deschid coșul de cumpărături")
    public void openCart() {
        click(cartButton);
    }

    @Step("Verific dacă utilizatorul este pe pagina de checkout (coș)")
    public boolean isCartOpened() {
        return waitUtils.waitForUrlContains("/checkout");
    }
}