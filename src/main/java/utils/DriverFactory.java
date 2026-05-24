package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    public static WebDriver createDriver() {

        String browser =
                ConfigReader.getProperty("browser");

        WebDriver driver;

        switch (browser.toLowerCase()) {

            case "chrome":

                WebDriverManager.chromedriver().setup();

                ChromeOptions options =
                        new ChromeOptions();

                driver = new ChromeDriver(options);
                break;

            default:
                throw new RuntimeException(
                        "Unsupported browser"
                );
        }

        driver.manage().window().maximize();

        return driver;
    }
}