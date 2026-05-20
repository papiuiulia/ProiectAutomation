package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private By searchBox = By.cssSelector("input[placeholder='Search']");
    private By productItem = By.cssSelector(".card");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String product) {
        driver.findElement(searchBox).sendKeys(product);
    }

    public boolean isProductDisplayed() {
        return driver.findElements(productItem).size() > 0;
    }
}