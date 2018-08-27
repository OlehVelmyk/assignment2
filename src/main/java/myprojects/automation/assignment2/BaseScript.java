package myprojects.automation.assignment2;

import myprojects.automation.assignment2.tests.LoginTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Base script functionality, can be used for all Selenium scripts.
 */
public abstract class BaseScript {

    /**
     *
     * @return New instance of {@link WebDriver} object.
     */
    public static WebDriver getDriver() {
        // TODO return  WebDriver instance
        //throw new UnsupportedOperationException("Method doesn't return WebDriver instance");

        System.setProperty("webdriver.chrome.driver", LoginTest.class.getResource("/chromedriver.exe").getPath() );
        return new ChromeDriver();

    }
}
