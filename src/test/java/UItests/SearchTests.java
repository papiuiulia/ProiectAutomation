package UItests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;

public class SearchTests extends BaseTest {

    @DataProvider(name = "searchData")
    public Object[][] searchData() {

        return new Object[][]{
                {"pliers"},
                {"hammer"},
                {"drill"}
        };
    }

    @Test(dataProvider = "searchData")
    public void TC01_searchProducts(String product) {

        // Step 1:
        // Create HomePage object
        HomePage homePage = new HomePage(driver);

        // Step 2:
        // Search product using search bar
        homePage.searchProduct(product);

        // Step 3:
        // Verify search results are displayed
        Assert.assertTrue(
                homePage.isProductDisplayed(),
                "Search results should appear"
        );
    }
}