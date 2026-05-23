package UItests;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;

public class ProductTests extends BaseTest {

    @Test
    @Description("Verifică afișarea produselor pe pagina principală")
    @Severity(SeverityLevel.NORMAL)
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
    @Description("Verifică dacă există cel puțin un produs")
    @Severity(SeverityLevel.NORMAL)
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
    @Description("Deschide primul produs și verifică pagina de produs")
    @Severity(SeverityLevel.CRITICAL)
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
    @Description("Verifică butonul Add to Cart pe pagina produsului")
    @Severity(SeverityLevel.NORMAL)
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