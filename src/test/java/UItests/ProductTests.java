package UItests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;

public class ProductTests extends BaseTest {

    @Test
    public void TC01_productsVisible() {

        // Step 1:
        // Create ProductPage object
        ProductPage productPage = new ProductPage(driver);

        // Step 2:
        // Verify products are visible on page
        Assert.assertTrue(
                productPage.areProductsVisible()
        );
    }

    @Test
    public void TC02_productsCount() {

        // Step 1:
        // Create ProductPage object
        ProductPage productPage = new ProductPage(driver);

        // Step 2:
        // Verify products count is greater than 0
        Assert.assertTrue(
                productPage.getProductsCount() > 0
        );
    }

    @Test
    public void TC03_openProductPage() {

        // Step 1:
        // Create ProductPage object
        ProductPage productPage = new ProductPage(driver);

        // Step 2:
        // Open first product
        productPage.openFirstProduct();

        // Step 3:
        // Verify product page is opened
        Assert.assertTrue(
                productPage.isProductPageOpened()
        );
    }

    @Test
    public void TC04_addToCartVisible() {

        // Step 1:
        // Create ProductPage object
        ProductPage productPage = new ProductPage(driver);

        // Step 2:
        // Open first product
        productPage.openFirstProduct();

        // Step 3:
        // Verify Add To Cart button is visible
        Assert.assertTrue(
                productPage.isAddToCartVisible()
        );
    }
}