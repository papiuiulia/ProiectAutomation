package UItests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;

public class ProductTests extends BaseTest {

    @Test
    public void TC01_productsVisible() {

        ProductPage productPage = new ProductPage(driver);

        Assert.assertTrue(
                productPage.areProductsVisible()
        );
    }

    @Test
    public void TC02_productsCount() {

        ProductPage productPage = new ProductPage(driver);

        Assert.assertTrue(
                productPage.getProductsCount() > 0
        );
    }

    @Test
    public void TC03_openProductPage() {

        ProductPage productPage = new ProductPage(driver);

        productPage.openFirstProduct();

        Assert.assertTrue(
                productPage.isProductPageOpened()
        );
    }

    @Test
    public void TC04_addToCartVisible() {

        ProductPage productPage = new ProductPage(driver);
        productPage.openFirstProduct();

        Assert.assertTrue(
                productPage.isAddToCartVisible()
        );
    }
}