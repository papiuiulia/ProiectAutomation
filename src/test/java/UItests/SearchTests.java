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

        HomePage homePage = new HomePage(driver);

        homePage.searchProduct(product);
        Assert.assertTrue(
                homePage.isProductDisplayed(),
                "Search results should appear"
        );
    }
}