package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtils;

public class BasePage {

    protected WebDriver driver;
    protected WaitUtils waitUtils;

    public BasePage(WebDriver driver) {

        this.driver = driver;

        waitUtils = new WaitUtils(driver);

        PageFactory.initElements(driver, this);
    }

    protected void click(WebElement element) {

        waitUtils
                .waitForClickability(element)
                .click();
    }

    protected void type(WebElement element, String text) {

        waitUtils
                .waitForVisibility(element)
                .clear();

        waitUtils
                .waitForVisibility(element)
                .sendKeys(text);
    }

    protected boolean isDisplayed(WebElement element) {

        return waitUtils
                .waitForVisibility(element)
                .isDisplayed();
    }

    protected String getText(WebElement element) {

        return waitUtils
                .waitForVisibility(element)
                .getText();
    }
}