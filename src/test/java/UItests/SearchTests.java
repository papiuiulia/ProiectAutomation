package UItests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

/**
 * =========================
 * TEST CASES - SEARCH MODULE
 * =========================
 *
 * TC01 - Verify user can perform a search
 * TC02 - Verify search returns results
 * TC03 - Verify search results are displayed after valid input
 */

public class SearchTests extends BaseTest {

    @Test
    public void TC01_userCanSearchProduct() {

        HomePage homePage = new HomePage(driver);

        // Action: search a product
        homePage.searchProduct("pliers");

        // Assertion: results should appear
        Assert.assertTrue(
                homePage.isProductDisplayed(),
                "Search results should be displayed after searching for a product"
        );
    }

    @Test
    public void TC02_searchReturnsResults() {

        HomePage homePage = new HomePage(driver);

        homePage.searchProduct("hammer");

        Assert.assertTrue(
                homePage.isProductDisplayed(),
                "Search should return at least one product"
        );
    }

    @Test
    public void TC03_searchWithValidKeywordShowsResults() {

        HomePage homePage = new HomePage(driver);

        homePage.searchProduct("drill");

        boolean resultsVisible = homePage.isProductDisplayed();

        Assert.assertTrue(resultsVisible,
                "Valid search keyword should display results");
    }
}
