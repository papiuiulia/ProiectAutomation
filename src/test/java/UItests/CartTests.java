package UItests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ProductPage;

public class CartTests extends BaseTest {

    @Test
    public void TC01_addProductAndOpenCart() {

        ProductPage productPage =
                new ProductPage(driver);

        CartPage cartPage =
                new CartPage(driver);

        // Step 1
        // open first product
        productPage.openFirstProduct();

        // Step 2
        // verify add to cart button
        Assert.assertTrue(
                productPage.isAddToCartVisible(),
                "Add To Cart button should be visible"
        );

        // Step 3
        // add product
        productPage.clickAddToCart();

        // Step 4
        // open cart
        cartPage.openCart();

        // Step 5
        // verify cart page opened
        Assert.assertTrue(
                cartPage.isCartOpened(),
                "Cart page should open"
        );
    }
}