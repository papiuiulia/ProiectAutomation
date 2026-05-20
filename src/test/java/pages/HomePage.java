package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = "input[placeholder='Search']")
    private WebElement searchBox;

    @FindBy(css = ".card")
    private WebElement firstProduct;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchProduct(String product) {
        type(searchBox, product);
    }

    public boolean isProductDisplayed() {
        return isDisplayed(firstProduct);
    }
}