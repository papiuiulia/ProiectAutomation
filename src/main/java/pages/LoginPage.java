package pages;

import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    private WebElement signInButton;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement loginButton;

    @FindBy(css = ".help-block")
    private WebElement errorMessage;

    @FindBy(xpath = "//h3[contains(text(),'Login')]")
    private WebElement loginTitle;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Deschid pagina de login")
    public void openLoginPage() {
        click(signInButton);
    }

    @Step("Introduc email: {email}")
    public void enterEmail(String email) {
        type(emailField, email);
    }

    @Step("Introduc parola")
    public void enterPassword(String password) {
        type(passwordField, password);
    }

    @Step("Apăs pe butonul Login")
    public void clickLogin() {
        click(loginButton);
    }

    @Step("Login cu user: {email}")
    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLogin();
    }

    @Step("Verific dacă apare mesajul de eroare")
    public boolean isErrorDisplayed() {
        return isDisplayed(errorMessage);
    }

    @Step("Verific dacă pagina de login este afișată")
    public boolean isLoginPageDisplayed() {
        return isDisplayed(loginTitle);
    }
}