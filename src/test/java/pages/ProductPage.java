package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage {

    @FindBy(css = ".card")
    private List<WebElement> products;

    @FindBy(css = "[data-test='add-to-cart']")
    private WebElement addToCartButton;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean areProductsVisible() {

        try {

            Thread.sleep(2000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        return products.size() > 0;
    }

    public int getProductsCount() {

        try {

            Thread.sleep(2000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        return products.size();
    }

    public void openFirstProduct() {

        try {

            Thread.sleep(2000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        if(products.size() > 0) {

            click(products.get(0));

        } else {

            throw new RuntimeException(
                    "No products found on page"
            );
        }
    }

    public boolean isAddToCartVisible() {

        try {

            Thread.sleep(2000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        return isDisplayed(addToCartButton);
    }

    public void clickAddToCart() {

        try {

            Thread.sleep(2000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        click(addToCartButton);
    }

    public boolean isProductPageOpened() {

        return driver.getCurrentUrl()
                .contains("/product/");
    }
}