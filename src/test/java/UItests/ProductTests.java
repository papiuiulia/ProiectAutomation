package UItests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;

/**
 * =========================
 * PRODUCT TEST CASES
 * =========================
 *
 * TC01 - Verify products are displayed
 * TC02 - Verify products count > 0
 * TC03 - Verify product details page opens
 * TC04 - Verify Add to Cart button exists
 */

public class ProductTests extends BaseTest {

    @Test
    public void TC01_productsVisible() {

        ProductPage productPage = new ProductPage(driver);

        Assert.assertTrue(
                productPage.areProductsVisible(),
                "Products should be visible"
        );
    }

    @Test
    public void TC02_productsCount() {

        ProductPage productPage = new ProductPage(driver);

        Assert.assertTrue(
                productPage.getProductsCount() > 0,
                "Products count should be greater than 0"
        );
    }

    @Test
    public void TC03_openProductPage() {

        ProductPage productPage = new ProductPage(driver);

        productPage.openFirstProduct();

        Assert.assertTrue(
                driver.getCurrentUrl().contains("product"),
                "Product page should open"
        );
    }

    @Test
    public void TC04_addToCartVisible() {

        ProductPage productPage = new ProductPage(driver);

        productPage.openFirstProduct();

        Assert.assertTrue(
                productPage.isAddToCartVisible(),
                "Add to cart button should be visible"
        );
    }
}