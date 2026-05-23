package UItests;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
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
    @Description("Verifică funcționalitatea de căutare produse în magazin")
    @Severity(SeverityLevel.NORMAL)
    public void TC01_searchProducts(String product) {

        // Pasul 1: Inițializez pagina principală
        HomePage homePage = new HomePage(driver);

        // Pasul 2: Caut produsul în bara de search
        homePage.searchProduct(product);

        // Pasul 3: Verific dacă sunt afișate rezultate
        Assert.assertTrue(
                homePage.isProductDisplayed(),
                "Rezultatele căutării ar trebui să fie afișate"
        );
    }
}