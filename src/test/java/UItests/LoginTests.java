package UItests;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test
    @Description("Verifică dacă pagina de login se deschide corect")
    public void TC01_openLoginPage() {

        // Pasul 1: Inițializez pagina de login
        LoginPage loginPage = new LoginPage(driver);

        // Pasul 2: Deschid pagina de login
        loginPage.openLoginPage();

        // Pasul 3: Verific dacă pagina de login este afișată
        Assert.assertTrue(
                loginPage.isLoginPageDisplayed(),
                "Pagina de login ar trebui să fie afișată"
        );
    }

    @Test
    @Description("Verifică autentificarea cu date invalide")
    @Owner("Iulia")
    @Severity(SeverityLevel.CRITICAL)
    public void TC02_invalidLogin() {

        // Pasul 1: Inițializez pagina de login
        LoginPage loginPage = new LoginPage(driver);

        // Pasul 2: Deschid pagina de login
        loginPage.openLoginPage();

        // Pasul 3: Introduc date invalide de autentificare
        loginPage.login("invalid@test.com", "wrongpassword");

        // Pasul 4: Verific dacă apare mesajul de eroare
        Assert.assertTrue(
                loginPage.isErrorDisplayed(),
                "Mesajul de eroare ar trebui să fie afișat"
        );
    }
}