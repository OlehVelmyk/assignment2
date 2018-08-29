package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckMainMenuTest extends BaseScript{

    public static void main(String[] args) throws InterruptedException {
       // TODO Script to check Main Menu items

        WebDriver driver = getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        LoginTest.loginToAdminPannel(driver);

        List<WebElement> list = driver.findElements(By.cssSelector(".menu > li > a"));

        for (int i = 0; i < list.size(); i++) {

            clickOnEachMenuItem(driver, i, "nav>ul>li>a");
        }

        driver.quit();
    }

    public static void clickOnEachMenuItem(WebDriver driver, int i, String value) {

        driver.findElements(By.cssSelector(value)).get(i).click();
        System.out.println(driver.findElements(By.cssSelector(value)).get(i).getText());
        driver.navigate().refresh();
        System.out.println(driver.findElements(By.cssSelector(value)).get(i).getText());
        System.out.println();
    }
}
