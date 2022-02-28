package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;


    public static WebDriver getDriver() {

        if (driver == null) {

            switch (ConfigReader.getProperty("browser")) {

                case "chrome":

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

                    break;

                case "firefox":

                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();

                    break;

                case "opera":

                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();

                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();

                    break;

                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver =new ChromeDriver(new ChromeOptions().setHeadless(true));

                    break;

                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        return driver;
    }


    public static void closeDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }
    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));

    }

    public static void windowVIewJS(WebElement element) {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }


}
