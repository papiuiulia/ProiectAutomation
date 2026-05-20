package UItests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test
    public void TC01_openLoginPage() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.openLoginPage();

        Assert.assertTrue(
                loginPage.isLoginPageDisplayed(),
                "Login page should open"
        );
    }

    @Test
    public void TC02_invalidLogin() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();

        loginPage.login(
                "invalid@test.com",
                "wrongpassword"
        );

        Assert.assertTrue(
                loginPage.isErrorDisplayed(),
                "Error message should appear"
        );
    }
}