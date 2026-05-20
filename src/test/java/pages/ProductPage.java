package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    private WebDriver driver;

    private By products = By.cssSelector(".card");
    private By firstProduct = By.cssSelector(".card");
   // private By addToCartButton = By.xpath("//button[contains(text(),'Add to cart')]");

    private By addToCartButton = By.cssSelector("[data-test='add-to-cart']");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean areProductsVisible() {
        return driver.findElements(products).size() > 0;
    }

    public int getProductsCount() {
        return driver.findElements(products).size();
    }

    public void openFirstProduct() {
        driver.findElements(firstProduct).get(0).click();
    }

    public boolean isAddToCartVisible() {
        return driver.findElements(addToCartButton).size() > 0;
    }

    public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }
}