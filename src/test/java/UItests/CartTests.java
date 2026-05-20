package UItests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;

import java.time.Duration;

/**
 * =========================
 * CART TEST CASES
 * =========================
 *
 * TC01 - Verify user can add product to cart
 */

public class CartTests extends BaseTest {

    @Test
    public void TC01_addProductToCart() {

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement addToCartButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("add-to-cart-sauce-labs-backpack"))
        );

        Assert.assertTrue(addToCartButton.isDisplayed());

        addToCartButton.click();

        WebElement cartBadge = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.className("shopping_cart_badge"))
        );

        Assert.assertEquals(cartBadge.getText(), "1");
    }
}