package UItests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test
    public void TC01_openLoginPage() {

        // Step 1:
        // Create LoginPage object
        LoginPage loginPage = new LoginPage(driver);

        // Step 2:
        // Open login page
        loginPage.openLoginPage();

        // Step 3:
        // Verify login page is displayed
        Assert.assertTrue(
                loginPage.isLoginPageDisplayed(),
                "Login page should open"
        );
    }

    @Test
    public void TC02_invalidLogin() {

        // Step 1:
        // Create LoginPage object
        LoginPage loginPage = new LoginPage(driver);

        // Step 2:
        // Open login page
        loginPage.openLoginPage();

        // Step 3:
        // Enter invalid email and password
        loginPage.login(
                "invalid@test.com",
                "wrongpassword"
        );

        // Step 4:
        // Verify error message is displayed
        Assert.assertTrue(
                loginPage.isErrorDisplayed(),
                "Error message should appear"
        );
    }
}