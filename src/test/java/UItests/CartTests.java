package UItests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ProductPage;

public class CartTests extends BaseTest {

    @Test
    public void TC01_addProductToCart() {

        ProductPage productPage =
                new ProductPage(driver);

        productPage.openFirstProduct();

        Assert.assertTrue(
                productPage.isAddToCartVisible()
        );

        productPage.clickAddToCart();
    }

    @Test
    public void TC02_openCartPage() {

        CartPage cartPage =
                new CartPage(driver);

        cartPage.openCart();

        Assert.assertTrue(
                cartPage.isCartOpened()
        );
    }
}