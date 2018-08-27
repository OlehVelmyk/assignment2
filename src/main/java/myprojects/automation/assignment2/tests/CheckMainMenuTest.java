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

            if (i == 2 || i == 6) {

                clickOnEachMenuItem(driver, i, ".menu > li > a", ".main-menu > li > a");
            } else {

                if (i == 3 || i == 7) {

                    clickOnEachMenuItem(driver, i, ".main-menu > li > a", ".menu > li > a");
                } else {

                    clickOnEachMenuItem(driver, i, ".menu > li > a", ".menu > li > a");
                }
            }

        }

        driver.quit();
    }

    public static void clickOnEachMenuItem(WebDriver driver, int i, String value, String value1) {

        driver.findElements(By.cssSelector(value)).get(i).click();
        System.out.println(driver.findElements(By.cssSelector(value1)).get(i).getText());
        driver.navigate().refresh();
        System.out.println(driver.findElements(By.cssSelector(value1)).get(i).getText());
        System.out.println();
    }
}
